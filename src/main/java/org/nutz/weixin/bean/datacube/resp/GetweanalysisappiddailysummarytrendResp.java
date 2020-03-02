package org.nutz.weixin.bean.datacube.resp;

import org.nutz.weixin.bean.datacube.biz.DailySummary;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappiddailysummarytrendResp {

    /**
     * 数据列表
     */
    private List<DailySummary> list;

    public List<DailySummary> getList() {
        return list;
    }

    public void setList(List<DailySummary> list) {
        this.list = list;
    }
}
