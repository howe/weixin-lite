package org.nutz.weixin.bean.datacube.resp;

import org.nutz.weixin.bean.datacube.biz.VisitPage;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappidvisitpageResp extends BaseResp {

    private List<VisitPage> list;

    public List<VisitPage> getList() {
        return list;
    }

    public void setList(List<VisitPage> list) {
        this.list = list;
    }
}
