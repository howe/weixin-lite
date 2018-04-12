package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateLibraryGetReq extends BaseReq {

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
