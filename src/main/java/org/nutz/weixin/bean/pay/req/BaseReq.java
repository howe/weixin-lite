package org.nutz.weixin.bean.pay.req;

import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class BaseReq {

    /**
     * 应用ID
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 商户号
     */
    @Param("mch_id")
    private String mchId;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }
}
