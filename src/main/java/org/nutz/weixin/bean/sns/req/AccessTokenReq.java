package org.nutz.weixin.bean.sns.req;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class AccessTokenReq {

    /**
     * 应用唯一标识，在微信开放平台提交应用审核通过后获得
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 应用密钥AppSecret，在微信开放平台提交应用审核通过后获得
     */
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 填写第一步获取的code参数
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 填authorization_code
     */
    private String grant_type;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public AccessTokenReq(String appid, String secret, String code) {
        this.appid = appid;
        this.secret = secret;
        this.code = code;
        this.grant_type = "authorization_code";
    }

    public AccessTokenReq(String appid, String secret, String code, String grant_type) {
        this.appid = appid;
        this.secret = secret;
        this.code = code;
        this.grant_type = grant_type;
    }

    public AccessTokenReq() {
    }
}
