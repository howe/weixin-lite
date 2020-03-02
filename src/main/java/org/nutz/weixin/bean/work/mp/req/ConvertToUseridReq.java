package org.nutz.weixin.bean.work.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class ConvertToUseridReq {

    /**
     * 调用接口凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 	在使用企业支付之后，返回结果的openid
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
