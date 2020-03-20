package org.nutz.weixin.bean.sns.req;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class RefreshTokenReq {

    /**
     * 应用唯一标识
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 填refresh_token
     */
    private String grant_type;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    /**
     * 填写通过access_token获取到的refresh_token参数
     */
    private String refresh_token;
    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public RefreshTokenReq(String appid, String grant_type, String refresh_token) {
        this.appid = appid;
        this.grant_type = grant_type;
        this.refresh_token = refresh_token;
    }

    public RefreshTokenReq() {
    }
}
