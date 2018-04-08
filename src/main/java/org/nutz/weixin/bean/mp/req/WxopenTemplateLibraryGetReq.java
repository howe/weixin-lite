package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateLibraryGetReq {

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

    /**
     * 模板标题id，可通过接口获取，也可登录小程序后台查看获取
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
