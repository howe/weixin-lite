package org.nutz.weixin.bean.datacube.resp;

import org.nutz.weixin.bean.datacube.biz.VisitUv;
import org.nutz.weixin.bean.datacube.biz.VisitUvNew;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetweanalysisappidweeklyretaininfoResp extends BaseResp {

    /**
     * 新增用户留存
     */
    private List<VisitUvNew> visit_uv_new;

    public List<VisitUvNew> getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(List<VisitUvNew> visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    /**
     * 活跃用户留存
     */
    private List<VisitUv> visit_uv;

    public List<VisitUv> getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(List<VisitUv> visit_uv) {
        this.visit_uv = visit_uv;
    }
}
