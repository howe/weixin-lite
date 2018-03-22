package org.nutz.weixin.bean.sns.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
    @Param("grant_type")
    @JsonField("grant_type")
    private String grantType;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * 填写通过access_token获取到的refresh_token参数
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

    public RefreshTokenReq(String appid, String grantType, String refreshToken) {
        this.appid = appid;
        this.grantType = grantType;
        this.refreshToken = refreshToken;
    }

    public RefreshTokenReq() {
    }
}
