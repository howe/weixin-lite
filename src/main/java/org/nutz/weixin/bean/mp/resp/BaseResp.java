package org.nutz.weixin.bean.mp.resp;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class BaseResp {

    private int errcode;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    private String errmsg;

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
