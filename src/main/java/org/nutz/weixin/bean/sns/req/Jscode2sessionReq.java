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
    private String jsCode;

    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }

    /**
     * 填写为 authorization_code
     */
    private String grantType;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public Jscode2sessionReq(String appid, String secret, String jsCode, String grantType) {
        this.appid = appid;
        this.secret = secret;
        this.jsCode = jsCode;
        this.grantType = grantType;
    }

    public Jscode2sessionReq() {
    }
}