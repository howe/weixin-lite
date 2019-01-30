package org.nutz.weixin.api.sns;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.sns.Error;
import org.nutz.weixin.bean.sns.req.AccessTokenReq;
import org.nutz.weixin.bean.sns.req.RefreshTokenReq;
import org.nutz.weixin.bean.sns.resp.AccessTokenResp;
import org.nutz.weixin.bean.sns.resp.RefreshTokenResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * 微信网站登录功能
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class Oauth2Api {

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
            } else if (!Strings.equalsIgnoreCase(req.getGrant_type(), "authorization_code")) {
                throw new Exception("grant_type填authorization_code");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.SNS_OAUTH2_ACCESS_TOKEN + "?appid=" + req.getAppid() +
                        "&secret=" + req.getSecret() + "&code=" + req.getCode() + "&grant_type=" + req.getGrant_type());
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
            throw Lang.wrapThrow(e);
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
            } else if (Strings.isBlank(req.getRefresh_token())) {
                throw new NullPointerException("refresh_token为空");
            } else if (!Strings.equalsIgnoreCase(req.getGrant_type(), "refresh_token")) {
                throw new Exception("grant_type填refresh_token");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.SNS_OAUTH2_REFRESH_TOKEN + "?appid=" + req.getAppid() +
                        "&refresh_token=" + req.getRefresh_token() + "&grant_type=" + req.getGrant_type());
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
            throw Lang.wrapThrow(e);
        }
    }
}
