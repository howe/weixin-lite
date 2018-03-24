package org.nutz.weixin.util.sns;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.sns.req.AuthReq;
import org.nutz.weixin.util.HttpUtil;

/**
 * 检验授权凭证功能
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class AuthUtil {

    /**
     * 检验授权凭证（access_token）是否有效
     *
     * @param req 参数
     * @return 是否有效
     */
    public static boolean auth(AuthReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getOpenid())) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.SNS_AUTH + "?openid=" + req.getOpenid() +
                        "&access_token=" + req.getAccess_token());
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Lang.equals(map.getInt("errcode"), 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
