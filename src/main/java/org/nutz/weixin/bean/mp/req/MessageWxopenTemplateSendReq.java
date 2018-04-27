package org.nutz.weixin.bean.mp.req;

import org.nutz.lang.util.NutMap;

/**
 * Created by Jianghao on 2018/4/3
 *
 * @howechiang
 */
public class MessageWxopenTemplateSendReq extends BaseReq {

    /**
     * 接收者（用户）的 openid
     */
    private String touser;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * 所需下发的模板消息的id
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * 点击模板卡片后的跳转页面，仅限本小程序内的页面。支持带参数,（示例index?foo=bar）。该字段不填则模板无跳转。
     */
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    /**
     * 表单提交场景下，为 submit 事件带上的 formId；支付场景下，为本次支付的 prepay_id
     */
    private String form_id;

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    /**
     * 模板内容，不填则下发空模板
     */
    private NutMap data;

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }

    /**
     * 模板需要放大的关键词，不填则默认无放大
     */
    private String emphasis_keyword;

    public String getEmphasis_keyword() {
        return emphasis_keyword;
    }

    public void setEmphasis_keyword(String emphasis_keyword) {
        this.emphasis_keyword = emphasis_keyword;
    }
}
