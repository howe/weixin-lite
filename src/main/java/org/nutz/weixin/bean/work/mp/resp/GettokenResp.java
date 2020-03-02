package org.nutz.weixin.bean.work.mp.resp;

/**
 * Created by Jianghao on 2019/9/13
 *
 * @author Freshplay Inc.
 */
public class GettokenResp extends BaseResp {

    /**
     * 	获取到的凭证，最长为512字节
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 凭证的有效时间（秒）
     */
    private long expires_in;

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }
}
