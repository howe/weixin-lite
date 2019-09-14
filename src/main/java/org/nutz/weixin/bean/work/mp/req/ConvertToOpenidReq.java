package org.nutz.weixin.bean.work.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class ConvertToOpenidReq {

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
     * 企业内的成员id
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
