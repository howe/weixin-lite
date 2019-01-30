package org.nutz.weixin.api.sns;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.sns.Error;
import org.nutz.weixin.bean.sns.req.UserinfoReq;
import org.nutz.weixin.bean.sns.resp.UserinfoResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * 获取用户个人信息功能
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class UserinfoApi {

    /**
     * 获取用户个人信息（UnionID机制）
     * <p>
     * 此接口用于获取用户个人信息。开发者可通过OpenID来获取用户基本信息。
     * 特别需要注意的是，如果开发者拥有多个移动应用、网站应用和公众帐号，
     * 可通过获取用户基本信息中的unionid来区分用户的唯一性，
     * 因为只要是同一个微信开放平台帐号下的移动应用、网站应用和公众帐号，
     * 用户的unionid是唯一的。换句话说，同一用户，对同一个微信开放平台下的不同应用，
     * unionid是相同的。请注意，在用户修改微信头像后，旧的微信头像URL将会失效，
     * 因此开发者应该自己在获取用户信息后，将头像图片保存下来，避免微信头像URL失效后的异常情况。
     *
     * @param req 参数
     * @return 结果
     */
    public static UserinfoResp userinfo(UserinfoReq req) {

        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getOpenid())) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.SNS_USERINFO + "?openid=" + req.getOpenid() +
                        "&access_token=" + req.getAccess_token() + "&lang=" + req.getLang());
                if (json.indexOf("openid") >= 0) {
                    UserinfoResp resp = Json.fromJson(UserinfoResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
