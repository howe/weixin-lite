package org.nutz.weixin.util;

import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.lang.util.NutMap;

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
            nutMap.setv(Strings.hump2Line(m.getKey()), m.getValue());
        }
        return Xmls.mapToXml("xml", nutMap);
    }

    /**
     * 蛇形转驼峰
     *
     * @param str
     *            待转换字符串
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
}
