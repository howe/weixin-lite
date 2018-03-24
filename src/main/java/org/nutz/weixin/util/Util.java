package org.nutz.weixin.util;

import org.nutz.lang.Encoding;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.pay.biz.RequestPayment4Miniapp;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.AlgorithmParameters;
import java.security.Key;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class Util {

    /**
     * @param obj
     * @return
     */
    public static NutMap obj2nutmap(Object obj) {
        NutMap map = new NutMap();
        for (Map.Entry<String, Object> m : Lang.obj2nutmap(obj).entrySet()) {
            map.setv(Strings.hump2Line(m.getKey().replaceAll("$", "_$")), m.getValue());
        }
        return map;
    }

    /**
     * @param nutmap
     * @return
     */
    public static NutMap nutmap2Hump(NutMap nutmap) {
        NutMap map = new NutMap();
        for (Map.Entry<String, Object> m : nutmap.entrySet()) {
            map.setv(Strings.line2Hump(m.getKey()), m.getValue());
        }
        return map;
    }

    /**
     * 将一个下面格式的 XML:
     * <p>
     * <pre>
     * &lt;xml&gt;
     * &lt;key1&gt;value1&lt;/key1&gt;
     * &lt;key2&gt;value2&lt;/key2&gt;
     * &lt;/xml&gt;
     * </pre>
     * <p>
     * 转换成一个 Map
     *
     * @param xml XML 字符串
     * @return Map
     */
    public static NutMap xmlToMap(String xml) {
        NutMap nutMap = Xmls.xmlToMap(xml);
        NutMap map = new NutMap();
        for (Map.Entry<String, Object> m : nutMap.entrySet()) {
            map.setv(line2Hump(m.getKey()), m.getValue());
        }
        return map;
    }

    /**
     * 将一个 Map 转换成 XML 类似:
     * <p>
     * <pre>
     * &lt;xml&gt;
     * &lt;key1&gt;value1&lt;/key1&gt;
     * &lt;key2&gt;value2&lt;/key2&gt;
     * &lt;/xml&gt;
     * </pre>
     *
     * @param map Map
     * @return XML 字符串
     */
    public static String mapToXml(Map<String, Object> map) {
        NutMap nutMap = new NutMap();
        for (Map.Entry<String, Object> m : map.entrySet()) {
            nutMap.setv(Strings.hump2Line(m.getKey().replaceAll("$", "_$")), m.getValue());
        }
        return Xmls.mapToXml("xml", nutMap);
    }

    /**
     * 蛇形转驼峰
     * <p>
     *
     * @param str 待转换字符串
     * @return 转换结果
     */
    public static String line2Hump(String str) {
        str = str.toLowerCase();
        Matcher matcher = Pattern.compile("_(\\w)").matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 签名
     * <p>
     *
     * @param params   待签名字符串
     * @param key      加密钥
     * @param signType 加密方式
     * @return 签名
     */
    public static String getSign(NutMap params, String key, String signType, String signName) {

        try {
            if (Lang.isEmpty(params)) {
                throw new NullPointerException("待签名字符串为空");

            } else if (Strings.isBlank(key)) {
                throw new NullPointerException("加密钥为空");
            } else {
                if (Strings.equalsIgnoreCase(signType, "HMAC-SHA256")) {
                    return Lang.sha256(Util.Url.encode(Util.buildParmas(params, new String[]{signName})) + key);
                } else {
                    return Lang.md5(Util.Url.encode(Util.buildParmas(params, new String[]{signName})) + key);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 校验签名
     * <p>
     *
     * @param params 待签名字符串
     * @param key    加密钥
     * @return 结果
     */
    public static Boolean checkSign(NutMap params, String key, String signType, String signName) {

        String sign = params.getString("sign");
        if (Lang.isEmpty(params) || Strings.isBlank(key)) {
            return false;
        } else {
            if (Strings.equalsIgnoreCase(signType, "HMAC-SHA256")) {
                if (Strings.equalsIgnoreCase(Lang.sha256(Util.Url.encode(Util.buildParmas(params, new String[]{signName})) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (Strings.equalsIgnoreCase(Lang.md5(Util.Url.encode(Util.buildParmas(params, new String[]{signName})) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    /**
     * Map排序
     * <p>
     *
     * @param params 待排序对象
     * @param order  排序方式
     * @return 排序后的对象
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            Map<String, Object> map = new LinkedHashMap<>();
            if (Strings.equalsIgnoreCase(order, "desc")) {
                params.entrySet().stream()
                        .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            } else {
                params.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }
            return map;
        }
    }

    /**
     * 构建参数
     * <p>
     *
     * @param params 待构建的map
     * @param f      过滤字段
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f) {

        if (Lang.isEmpty(f)) {
            return buildParmas(params);
        } else {
            Arrays.asList(f).stream().forEach(params::remove);
            return buildParmas(params);
        }
    }

    /**
     * 构建参数
     * <p>
     *
     * @param params 待构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            params = Util.sorting(params, "asc");
            StringBuffer sb = new StringBuffer();
            params.forEach((k, v) -> {
                if (!Lang.isEmpty(v)) {
                    sb.append(k + "=" + v + "&");
                }
            });
            return Strings.removeLast(sb.toString().replaceAll("$package", "package")
                    .replaceAll(" , ", ",").replaceAll(" ,", ",")
                    .replaceAll(", ", ","), '&');
        }
    }

    /**
     * URL转解码
     */
    public static class Url {
        /**
         * 加密
         * <p>
         *
         * @param s
         * @return
         */
        public static String encode(String s) {
            if (Strings.isBlank(s)) {
                throw new NullPointerException("s加密对象为空");
            } else {
                try {
                    return URLEncoder.encode(s, Encoding.UTF8);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    throw Lang.wrapThrow(e);
                }
            }
        }

        /**
         * 解密
         * <p>
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            if (Strings.isBlank(s)) {
                throw new NullPointerException("s解密对象为空");
            } else {
                try {
                    return URLDecoder.decode(s, Encoding.UTF8);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw Lang.wrapThrow(e);
                }
            }
        }
    }

    /**
     * BASE64加解密
     */
    public static class Base64 {

        /**
         * 加密
         * <p>
         *
         * @param s
         * @return
         */
        public static String encode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new NullPointerException("s加密对象为空");
                } else {
                    return org.nutz.repo.Base64.encodeToString(s.getBytes(Encoding.CHARSET_UTF8), true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw Lang.wrapThrow(e);
            }
        }

        /**
         * 解密
         * <p>
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new NullPointerException("s解密对象为空");
                } else {
                    return new String(org.nutz.repo.Base64.decode(s));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw Lang.wrapThrow(e);
            }
        }
    }

    /**
     * 解密微信小程序加密用户信息
     * <p>
     *
     * @param encryptedData 敏感数据
     * @param sessionKey    登录返回的key
     * @param iv            解密算法初始向量
     * @return
     */
    public static String decryptionData(String encryptedData, String sessionKey, String iv) {

        try {
            // 被加密的数据
            byte[] dataByte = org.nutz.repo.Base64.decode(encryptedData);
            // 加密秘钥
            byte[] keyByte = org.nutz.repo.Base64.decode(sessionKey);
            // 偏移量
            byte[] ivByte = org.nutz.repo.Base64.decode(iv);
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Key spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (!Lang.isEmpty(resultByte)) {
                return new String(resultByte, "UTF-8");
            }
            throw new Exception("解析数据失败");
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 微信小程序调起支付API签名方法
     *
     * @param appId 小程序ID
     * @param rpm   参数对象
     * @param key   支付密码
     * @return 结果
     */
    public static String getRequestPaymentPaySign4Miniapp(String appId, RequestPayment4Miniapp rpm, String key) {
        try {
            if (Strings.isBlank(appId)) {
                throw new NullPointerException("appId为空");
            } else if (Strings.isBlank(key)) {
                throw new NullPointerException("key为空");
            } else if (Lang.isEmpty(rpm)) {
                throw new NullPointerException("rpm为空");
            } else {
                StringBuffer sb = new StringBuffer();
                sb.append("appId=").append(appId);
                sb.append("&nonceStr=").append(rpm.getNonceStr());
                sb.append("&package=").append(rpm.get$package());
                sb.append("&signType=").append(rpm.getSignType());
                sb.append("&timeStamp=").append(rpm.getTimeStamp());
                sb.append("&key=").append(key);
                return Lang.md5(sb.toString()).toUpperCase();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
