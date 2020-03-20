package org.nutz.weixin.bean.sns.resp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseResp {

    private Integer errcode;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
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
