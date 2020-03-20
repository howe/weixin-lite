package org.nutz.weixin.bean.sns.resp;

/**
 * Created by Jianghao on 2018/3/15
 *
 * @howechiang
 */
public class Jscode2sessionResp extends BaseResp {

    /**
     * 用户唯一标识
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 会话密钥
     */
    private String session_key;

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
