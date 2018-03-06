package org.nutz.weixin.bean.sns.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class UserinfoReq {

    /**
     * 调用凭证
     */
    @Param("access_token")
    @JsonField("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
}
