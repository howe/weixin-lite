package org.nutz.weixin.bean.work.wwopen.req;

/**
 * Created by Jianghao on 2019/9/13
 *
 * @author Freshplay Inc.
 */
public class QrConnectReq {

    /**
     * 企业微信的CorpID，在企业微信管理端查看
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 授权方的网页应用ID，在具体的网页应用中查看
     */
    private String agentid;

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    /**
     * 重定向地址，需要进行UrlEncode
     */
    private String redirect_uri;

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    /**
     * 用于保持请求和回调的状态，授权请求后原样带回给企业。该参数可用于防止csrf攻击（跨站请求伪造攻击），建议企业带上该参数，可设置为简单的随机数加session进行校验
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
