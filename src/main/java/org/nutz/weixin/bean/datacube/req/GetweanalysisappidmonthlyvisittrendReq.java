package org.nutz.weixin.bean.datacube.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappidmonthlyvisittrendReq extends BaseReq {

    public GetweanalysisappidmonthlyvisittrendReq(String begin_date, String end_date, String access_token) {
        super(begin_date, end_date, access_token);
    }

    public GetweanalysisappidmonthlyvisittrendReq() {
    }
}
