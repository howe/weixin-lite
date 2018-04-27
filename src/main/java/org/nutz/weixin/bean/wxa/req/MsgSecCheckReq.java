package org.nutz.weixin.bean.wxa.req;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class MsgSecCheckReq extends BaseReq {

    /**
     * 要检测的文本内容，长度不超过500K字节
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
