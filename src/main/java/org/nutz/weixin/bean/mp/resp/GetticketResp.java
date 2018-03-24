package org.nutz.weixin.bean.mp.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/24
 *
 * @howechiang
 */
public class GetticketResp {

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

    private String ticket;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * 失效时间
     */
    @Param("expires_in")
    @JsonField("expires_in")
    private long expiresIn;

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
