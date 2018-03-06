package org.nutz.weixin.bean.sns.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class AccessTokenResp {

    /**
     * 接口调用凭证
     */
    @Param("access_token")
    @JsonField("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    @Param("expires_in")
    @JsonField("expires_in")
    private long expiresIn;

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 用户刷新access_token
     */
    @Param("refresh_token")
    @JsonField("refresh_token")
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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
