package org.nutz.weixin.bean.mp.req;

import org.nutz.weixin.bean.mp.biz.MpTemplateMsg;
import org.nutz.weixin.bean.mp.biz.WeappTemplateMsg;

/**
 * 下发小程序和公众号统一的服务消息
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class UniformSendReq extends BaseReq {

    /**
     * 用户openid，可以是小程序的openid，也可以是mp_template_msg.appid对应的公众号的openid
     */
    private String touser;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * 小程序模板消息相关的信息，可以参考小程序模板消息接口; 有此节点则优先发送小程序模板消息
     */
    private WeappTemplateMsg weapp_template_msg;

    public WeappTemplateMsg getWeapp_template_msg() {
        return weapp_template_msg;
    }

    public void setWeapp_template_msg(WeappTemplateMsg weapp_template_msg) {
        this.weapp_template_msg = weapp_template_msg;
    }

    /**
     * 公众号模板消息相关的信息，可以参考公众号模板消息接口；有此节点并且没有weapp_template_msg节点时，发送公众号模板消息
     */
    private MpTemplateMsg mp_template_msg;

    public MpTemplateMsg getMp_template_msg() {
        return mp_template_msg;
    }

    public void setMp_template_msg(MpTemplateMsg mp_template_msg) {
        this.mp_template_msg = mp_template_msg;
    }
}