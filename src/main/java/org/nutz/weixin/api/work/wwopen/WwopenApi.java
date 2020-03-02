package org.nutz.weixin.api.work.wwopen;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.work.wwopen.req.QrConnectReq;
import org.nutz.weixin.util.Util;

/**
 * Created by Jianghao on 2019/9/13
 *
 * @author Freshplay Inc.
 */
public class WwopenApi {

    /**
     * 构造独立窗口登录二维码
     *
     * @param req
     * @return
     */
    public static String qrConnect(QrConnectReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getAgentid())) {
                throw new NullPointerException("agentid为空");
            } else if (Strings.isBlank(req.getRedirect_uri())) {
                throw new NullPointerException("redirect_uri为空");
            } else {
                return Dict.OPEN_WORK_GATE + Dict.WWOPEN_SSO_QRCONNECT + "?" + Util.buildParmas(Lang.obj2map(req));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
