package org.nutz.weixin.bean.mp.resp;

/**
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class TokenResp {

    /**
     * 	获取到的凭证
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 失效时间
     */
    private long expires_in;

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }
}
