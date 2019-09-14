package org.nutz.weixin.bean.work.mp.resp;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class ConvertToOpenidResp extends BaseResp {

    /**
     * 企业微信成员USERID对应的OPENID
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
