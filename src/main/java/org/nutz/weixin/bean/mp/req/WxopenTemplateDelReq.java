package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class WxopenTemplateDelReq extends BaseReq {

    /**
     * 要删除的模板id
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
}
