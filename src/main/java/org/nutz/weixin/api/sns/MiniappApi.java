package org.nutz.weixin.api.sns;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Comm;
import org.nutz.weixin.bean.sns.Error;
import org.nutz.weixin.bean.sns.req.Jscode2sessionReq;
import org.nutz.weixin.bean.sns.resp.Jscode2sessionResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * 小程序功能
 * Created by Jianghao on 2018/3/15
 *
 * @howechiang
 */
public class MiniappApi {

    /**
     * 登录凭证校验
     * <p>
     * 临时登录凭证校验接口是一个 HTTPS 接口，开发者服务器使用 临时登录凭证code 获取 session_key 和 openid 等。
     * <p>
     * 注意：
     * <p>
     * 1 会话密钥session_key 是对用户数据进行加密签名的密钥。为了应用自身的数据安全，开发者服务器不应该把会话密钥下发到小程序，也不应该对外提供这个密钥。
     * <p>
     * 2 UnionID 只在满足一定条件的情况下返回。具体参看UnionID机制说明
     *
     * @param req
     * @return
     */
    public static Jscode2sessionResp jscode2session(Jscode2sessionReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid空");
            } else if (Strings.isBlank(req.getSecret())) {
                throw new NullPointerException("secret为空");
            } else if (Strings.isBlank(req.getJs_code())) {
                throw new NullPointerException("js_code为空");
            } else if (!Strings.equalsIgnoreCase(req.getGrant_type(), "authorization_code")) {
                throw new Exception("grant_type填authorization_code");
            } else {
                String json = HttpUtil.get(Comm.API_GATE + Comm.SNS_JSCODE2SESSION + "?appid=" + req.getAppid() +
                        "&secret=" + req.getSecret() + "&js_code=" + req.getJs_code() + "&grant_type=" + req.getGrant_type());
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.isNotBlank(map.getString("openid"))) {
                    Jscode2sessionResp resp = Lang.map2Object(map, Jscode2sessionResp.class);
                    return resp;
                } else {

                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
