package org.nutz.weixin.bean.work.mp.resp;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class GetuserinfoResp extends BaseResp {

    /**
     * 成员UserID。若需要获得用户详情信息，可调用通讯录接口：读取成员
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 非企业成员的标识，对当前企业唯一
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
