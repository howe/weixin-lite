package org.nutz.weixin.bean.sns.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
    @Param("grant_type")
    @JsonField("grant_type")
    private String grantType;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public AccessTokenReq(String appid, String secret, String code) {
        this.appid = appid;
        this.secret = secret;
        this.code = code;
        this.grantType = "authorization_code";
    }

    public AccessTokenReq(String appid, String secret, String code, String grantType) {
        this.appid = appid;
        this.secret = secret;
        this.code = code;
        this.grantType = grantType;
    }

    public AccessTokenReq() {
    }
}
