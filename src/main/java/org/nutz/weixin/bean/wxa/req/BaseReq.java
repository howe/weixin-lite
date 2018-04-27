package org.nutz.weixin.bean.wxa.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2018/4/12
 *
 * @howechiang
 */
public class BaseReq {

    /**
     * 接口调用凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
