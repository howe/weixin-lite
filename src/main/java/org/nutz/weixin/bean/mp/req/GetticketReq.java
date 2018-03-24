package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2018/3/24
 *
 * @howechiang
 */
public class GetticketReq {

    /**
     * 获取到的凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetticketReq(String access_token) {
        this.access_token = access_token;
        this.type = "jsapi";
    }

    public GetticketReq() {
    }
}
