package org.nutz.weixin.bean.sns.req;

/**
 * Created by Jianghao on 2018/3/15
 *
 * @howechiang
 */
public class Jscode2sessionReq {

    /**
     * 小程序唯一标识
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 小程序的 app secret
     */
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 登录时获取的 code
     */
    private String js_code;

    public String getJs_code() {
        return js_code;
    }

    public void setJs_code(String js_code) {
        this.js_code = js_code;
    }

    /**
     * 填写为 authorization_code
     */
    private String grant_type;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public Jscode2sessionReq(String appid, String secret, String js_code, String grant_type) {
        this.appid = appid;
        this.secret = secret;
        this.js_code = js_code;
        this.grant_type = grant_type;
    }

    public Jscode2sessionReq(String appid, String secret, String js_code) {
        this.appid = appid;
        this.secret = secret;
        this.js_code = js_code;
        this.grant_type = "authorization_code";
    }

    public Jscode2sessionReq() {
    }
}