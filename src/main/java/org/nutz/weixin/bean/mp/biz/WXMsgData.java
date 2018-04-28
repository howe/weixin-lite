package org.nutz.weixin.bean.mp.biz;

/**
 * Created by Jianghao on 2018/4/28
 *
 * @howechiang
 */
public class WXMsgData {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public WXMsgData(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public WXMsgData() {
    }

    public WXMsgData(String value) {
        this.value = value;
    }
}
