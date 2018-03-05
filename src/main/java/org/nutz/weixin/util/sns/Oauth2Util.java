package org.nutz.weixin.util.sns;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.Error;
import org.nutz.weixin.bean.sns.req.AccessTokenReq;
import org.nutz.weixin.bean.sns.req.AuthReq;
import org.nutz.weixin.bean.sns.req.RefreshTokenReq;
import org.nutz.weixin.bean.sns.req.UserinfoReq;
import org.nutz.weixin.bean.sns.resp.AccessTokenResp;
import org.nutz.weixin.bean.sns.resp.RefreshTokenResp;
import org.nutz.weixin.bean.sns.resp.UserinfoResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * 微信登录功能
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class Oauth2Util {

    /**
     * 通过code获取access_token
     *
     * @param req 参数
     * @return 令牌
     */
    public static AccessTokenResp accessToken(AccessTokenReq req) {

        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getSecret())) {
                throw new NullPointerException("secret为空");
            } else if ((Strings.isBlank(req.getCode()))) {
                throw new NullPointerException("code为空");
            } else if (Strings.equalsIgnoreCase(req.getGrantType(), "authorization_code")) {
                throw new Exception("grant_type填authorization_code");
            } else {
                String json = HttpUtil.get(Dict.WX_API_GATE + Dict.WX_SNS_OAUTH2_ACCESS_TOKEN + "?appid=" + req.getAppid() +
                        "&secret=" + req.getSecret() + "&code=" + req.getCode() + "&grant_type=" + req.getGrantType());
                if (json.indexOf("access_token") >= 0) {
                    AccessTokenResp resp = Json.fromJson(AccessTokenResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw null;
        }
    }

    /**
     * 刷新或续期access_token使用
     * <p>
     * access_token是调用授权关系接口的调用凭证，由于access_token有效期（目前为2个小时）较短，当access_token超时后，可以使用refresh_token进行刷新，access_token刷新结果有两种：
     * <p>
     * 1.若access_token已超时，那么进行refresh_token会获取一个新的access_token，新的超时时间；
     * <p>
     * 2.若access_token未超时，那么进行refresh_token不会改变access_token，但超时时间会刷新，相当于续期access_token。
     * <p>
     * refresh_token拥有较长的有效期（30天）且无法续期，当refresh_token失效的后，需要用户重新授权后才可以继续获取用户头像昵称。
     *
     * @param req 参数
     * @return 令牌
     */
    public static RefreshTokenResp refreshToken(RefreshTokenReq req) {

        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if ((Strings.isBlank(req.getRefreshToken()))) {
                throw new NullPointerException("refresh_token为空");
            } else if (Strings.equalsIgnoreCase(req.getGrantType(), "refresh_token")) {
                throw new Exception("grant_type填refresh_token");
            } else {
                String json = HttpUtil.get(Dict.WX_API_GATE + Dict.WX_SNS_OAUTH2_REFRESH_TOKEN + "?appid=" + req.getAppid() +
                        "&refresh_token=" + req.getRefreshToken() + "&grant_type=" + req.getGrantType());
                if (json.indexOf("access_token") >= 0) {
                    RefreshTokenResp resp = Json.fromJson(RefreshTokenResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw null;
        }
    }

    /**
     * 检验授权凭证（access_token）是否有效
     *
     * @param req 参数
     * @return 是否有效
     */
    public static boolean auth(AuthReq req) {
        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("access_token为空");
            } else if ((Strings.isBlank(req.getOpenid()))) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.get(Dict.WX_API_GATE + Dict.WX_SNS_AUTH + "?openid=" + req.getOpenid() +
                        "&access_token=" + req.getAccessToken());
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Lang.equals(map.getInt("errcode"), 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 获取用户个人信息（UnionID机制）
     * 此接口用于获取用户个人信息。开发者可通过OpenID来获取用户基本信息。
     * 特别需要注意的是，如果开发者拥有多个移动应用、网站应用和公众帐号，
     * 可通过获取用户基本信息中的unionid来区分用户的唯一性，
     * 因为只要是同一个微信开放平台帐号下的移动应用、网站应用和公众帐号，
     * 用户的unionid是唯一的。换句话说，同一用户，对同一个微信开放平台下的不同应用，
     * unionid是相同的。请注意，在用户修改微信头像后，旧的微信头像URL将会失效，
     * 因此开发者应该自己在获取用户信息后，将头像图片保存下来，避免微信头像URL失效后的异常情况。
     *
     * @param req 参数
     * @return 令牌
     */
    public static UserinfoResp userinfo(UserinfoReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getOpenid())) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.get(Dict.WX_API_GATE + Dict.WX_SNS_USERINFO + "?openid=" + req.getOpenid() +
                        "&access_token=" + req.getAccessToken() + "&lang=" + req.getLang());
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
            throw null;
        }
    }
}
