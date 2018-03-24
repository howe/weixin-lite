package org.nutz.weixin.bean.sns.resp;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class RefreshTokenResp {

    /**
     * 接口调用凭证
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    private int expires_in;

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    /**
     * 用户刷新access_token
     */
    private String refresh_token;

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    /**
     * 授权用户唯一标识
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
