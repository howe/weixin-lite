package org.nutz.weixin.bean.datacube.resp;

import org.nutz.weixin.bean.datacube.biz.VisitDistributionList;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappidvisitdistributionResp extends BaseResp {

    /**
     * 数据列表
     */
    private List<VisitDistributionList> list;

    public List<VisitDistributionList> getList() {
        return list;
    }

    public void setList(List<VisitDistributionList> list) {
        this.list = list;
    }
}
