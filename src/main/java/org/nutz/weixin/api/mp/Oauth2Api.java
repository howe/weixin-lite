package org.nutz.weixin.api.mp;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.weixin.bean.Comm;
import org.nutz.weixin.bean.mp.req.AuthorizeReq;

/**
 * Created by Jianghao on 2020/4/14
 *
 * @author Freshplay Inc.
 */
public class Oauth2Api {

    /**
     * 用户同意授权，获取code
     *
     * @param req
     * @return
     */
    public static String authorize(AuthorizeReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getRedirect_uri())) {
                throw new NullPointerException("redirect_uri为空");
            } else if (Strings.isBlank(req.getState())) {
                throw new NullPointerException("state为空");
            } else {
                return Comm.OPEN_GATE + Comm.CONNECT_OAUTH2_AUTHORIZE + "?response_type=" + req.getResponse_type()
                        + "&appid=" + req.getAppid()
                        + "&redirect_uri=" + req.getRedirect_uri()
                        + "&state=" + req.getState()
                        + "&scope=" + req.getScope()
                        + "#wechat_redirect";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
