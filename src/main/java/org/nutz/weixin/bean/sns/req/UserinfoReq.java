package org.nutz.weixin.bean.sns.req;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class UserinfoReq {

    /**
     * 调用凭证
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 普通用户的标识，对当前开发者帐号唯一
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 国家地区语言版本，
     * zh_CN 简体，
     * zh_TW 繁体，
     * en 英语，
     * 默认为zh-CN
     */
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public UserinfoReq(String access_token, String openid, String lang) {
        this.access_token = access_token;
        this.openid = openid;
        this.lang = lang;
    }

    public UserinfoReq(String access_token, String openid) {
        this.access_token = access_token;
        this.openid = openid;
        this.lang = "zh-CN";
    }

    public UserinfoReq() {
    }
}
