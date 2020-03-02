package org.nutz.weixin.bean.custom.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseReq {

    /**
     * 接口调用凭证
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public BaseReq(String access_token) {
        this.access_token = access_token;
    }

    public BaseReq() {
    }
}
