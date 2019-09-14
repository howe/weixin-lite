package org.nutz.weixin.bean.work.mp.resp;

/**
 * Created by Jianghao on 2019/9/14
 *
 * @author Freshplay Inc.
 */
public class ConvertToUseridResp extends BaseResp {

    /**
     * 	该openid在企业微信对应的成员userid
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
