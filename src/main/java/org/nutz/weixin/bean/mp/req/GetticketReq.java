package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/24
 *
 * @howechiang
 */
public class GetticketReq {

    /**
     * 获取到的凭证
     */
    @Param("access_token")
    @JsonField(value = "access_token", ignore = true)
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetticketReq(String accessToken) {
        this.accessToken = accessToken;
        this.type = "jsapi";
    }

    public GetticketReq() {
    }
}
