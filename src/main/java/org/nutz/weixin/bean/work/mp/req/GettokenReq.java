package org.nutz.weixin.bean.work.mp.req;

/**
 * Created by Jianghao on 2019/9/13
 *
 * @author Freshplay Inc.
 */
public class GettokenReq {

    /**
     * 企业ID，获取方式参考：<a href='https://work.weixin.qq.com/api/doc#14953/corpid'>术语说明-corpid</a>
     */
    private String corpid;

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }

    /**
     * 应用的凭证密钥，获取方式参考：<a href='https://work.weixin.qq.com/api/doc#14953/secret'>术语说明-secret</a>
     */
    private String corpsecret;

    public String getCorpsecret() {
        return corpsecret;
    }

    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret;
    }
}
