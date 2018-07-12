package org.nutz.weixin.bean.mp.resp;

/**
 * Created by Jianghao on 2018/7/12
 *
 * @howechiang
 */
public class MessageTemplateSendResp extends BaseResp {

    private String msgid;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
