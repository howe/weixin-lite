package org.nutz.weixin.util;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.lang.util.NutMap;
import org.nutz.repo.Base64;
import org.nutz.weixin.bean.sns.biz.DecryptionData;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Security;
import java.util.Arrays;
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
     * 解密微信小程序加密用户信息
     * <p>
     *
     * @param encryptedData 敏感数据
     * @param sessionKey    登录返回的key
     * @param iv            解密算法初始向量
     * @return
     */
    public static DecryptionData decryptionData(String encryptedData, String sessionKey, String iv) {

        try {
            // 被加密的数据
            byte[] dataByte = Base64.decode(encryptedData);
            // 加密秘钥
            byte[] keyByte = Base64.decode(sessionKey);
            // 偏移量
            byte[] ivByte = Base64.decode(iv);
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (!Lang.isEmpty(resultByte)) {
                String result = new String(resultByte, "UTF-8");
                return Json.fromJson(DecryptionData.class, result);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
