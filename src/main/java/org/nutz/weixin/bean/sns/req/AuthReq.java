package org.nutz.weixin.bean.sns.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class AuthReq {

    /**
     * 调用接口凭证
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
     * 普通用户标识，对该公众帐号唯一
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
