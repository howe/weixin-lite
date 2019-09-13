package org.nutz.weixin.bean.wxa.resp;

/**
 * Created by Jianghao on 2019/8/16
 *
 * @author Freshplay Inc.
 */
public class GetpaidunionidResp extends BaseResp {

    /**
     * 用户唯一标识，调用成功后返回
     */
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
