package org.nutz.weixin.bean.mp.biz;

import org.nutz.lang.util.NutMap;

/**
 * 公众号模板消息相关的信息，可以参考公众号模板消息接口；有此节点并且没有weapp_template_msg节点时，发送公众号模板消息
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class MpTemplateMsg {

    /**
     *公众号appid，要求与小程序有绑定且同主体
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 公众号模板id
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * 公众号模板消息所要跳转的url
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 公众号模板消息所要跳转的小程序，小程序的必须与公众号具有绑定关系
     */
    private Miniprogram miniprogram;

    public Miniprogram getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(Miniprogram miniprogram) {
        this.miniprogram = miniprogram;
    }

    /**
     * 公众号模板消息的数据
     */
    private NutMap data;

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }
}