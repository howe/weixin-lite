package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class TokenReq {

    /**
     * 	获取access_token填写client_credential
     */
    private String grant_type;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    /**
     * 第三方用户唯一凭证
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 	第三方用户唯一凭证密钥，即appsecret
     */
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public TokenReq(String grant_type, String appid, String secret) {
        this.grant_type = grant_type;
        this.appid = appid;
        this.secret = secret;
    }

    public TokenReq(String appid, String secret) {
        this.grant_type = "client_credential";
        this.appid = appid;
        this.secret = secret;
    }

    public TokenReq() {
    }
}
