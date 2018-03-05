package org.nutz.weixin.bean.mp.resp;

import org.nutz.mvc.annotation.Param;

/**
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class TokenResp {

    /**
     * 	获取到的凭证
     */
    @Param("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Param("expires_in")
    private long expiresIn;

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
