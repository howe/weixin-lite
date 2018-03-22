package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class GetcallbackipReq {

    /**
     * 公众号的access_token
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

    public GetcallbackipReq(String accessToken) {
        this.accessToken = accessToken;
    }

    public GetcallbackipReq() {
    }
}
