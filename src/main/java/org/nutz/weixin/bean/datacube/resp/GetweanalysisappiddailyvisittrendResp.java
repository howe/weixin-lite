package org.nutz.weixin.bean.datacube.resp;

import org.nutz.weixin.bean.datacube.biz.VisitTrend;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappiddailyvisittrendResp {

    /**
     * 数据列表
     */
    private List<VisitTrend> list;

    public List<VisitTrend> getList() {
        return list;
    }

    public void setList(List<VisitTrend> list) {
        this.list = list;
    }
}