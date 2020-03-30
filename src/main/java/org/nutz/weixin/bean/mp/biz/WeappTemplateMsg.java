package org.nutz.weixin.bean.mp.biz;

import org.nutz.lang.util.NutMap;

/**
 * 小程序模板消息相关的信息，可以参考小程序模板消息接口; 有此节点则优先发送小程序模板消息
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class WeappTemplateMsg {

    /**
     * 小程序模板ID
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * 小程序页面路径
     */
    private String page;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    /**
     * 小程序模板消息formid
     */
    private String form_id;

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    /**
     * 小程序模板数据
     */
    private NutMap data;

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }

    /**
     * 小程序模板放大关键词
     */
    private String emphasis_keyword;

    public String getEmphasis_keyword() {
        return emphasis_keyword;
    }

    public void setEmphasis_keyword(String emphasis_keyword) {
        this.emphasis_keyword = emphasis_keyword;
    }
}