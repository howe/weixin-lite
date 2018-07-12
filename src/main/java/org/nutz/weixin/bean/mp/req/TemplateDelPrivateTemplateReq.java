package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/7/11
 *
 * @howechiang
 */
public class TemplateDelPrivateTemplateReq extends BaseReq {

    /**
     * 公众帐号下模板消息ID
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
}
