package org.nutz.weixin.bean.sns.biz;

/**
 * Created on 2018/3/23
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Watermark {
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    private long timestamp;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
