package org.nutz.weixin.bean.sns.req;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class AuthReq {

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
     * 普通用户标识，对该公众帐号唯一
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public AuthReq(String access_token, String openid) {
        this.access_token = access_token;
        this.openid = openid;
    }

    public AuthReq() {
    }
}
