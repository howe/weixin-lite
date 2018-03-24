package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class GetcallbackipReq {

    /**
     * 公众号的access_token
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public GetcallbackipReq(String access_token) {
        this.access_token = access_token;
    }

    public GetcallbackipReq() {
    }
}
