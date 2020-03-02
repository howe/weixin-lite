package org.nutz.weixin.bean.custom.req;

import org.nutz.weixin.bean.custom.biz.Image;
import org.nutz.weixin.bean.custom.biz.Link;
import org.nutz.weixin.bean.custom.biz.Miniprogrampage;
import org.nutz.weixin.bean.custom.biz.Text;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class SendReq extends BaseReq {

    /**
     * 用户的 OpenID
     */
    private String touser;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * 消息类型
     * text	文本消息
     * image	图片消息
     * link	图文链接
     * miniprogrampage	小程序卡片
     */
    private String msgtype;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    /**
     * 文本消息，msgtype="text" 时必填
     */
    private Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    /**
     * 图片消息，msgtype="image" 时必填
     */
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 图文链接，msgtype="link" 时必填
     */
    private Link link;

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    private Miniprogrampage miniprogrampage;

    public Miniprogrampage getMiniprogrampage() {
        return miniprogrampage;
    }

    public void setMiniprogrampage(Miniprogrampage miniprogrampage) {
        this.miniprogrampage = miniprogrampage;
    }
}
