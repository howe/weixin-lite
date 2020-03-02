package org.nutz.weixin.bean.work.mp.req;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class GetReq {

    /**
     * 调用接口凭证
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
