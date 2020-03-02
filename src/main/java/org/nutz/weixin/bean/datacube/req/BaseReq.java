package org.nutz.weixin.bean.datacube.req;

import org.nutz.json.JsonField;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseReq {

    /**
     * 开始日期。格式为 yyyymmdd
     */
    private String begin_date;

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    /**
     * 结束日期，限定查询1天数据，允许设置的最大值为昨日。格式为 yyyymmdd
     */
    private String end_date;

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    /**
     * 获取到的凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public BaseReq(String begin_date, String end_date, String access_token) {
        this.begin_date = begin_date;
        this.end_date = end_date;
        this.access_token = access_token;
    }

    public BaseReq() {
    }
}
