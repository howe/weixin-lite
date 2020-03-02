package org.nutz.weixin.bean.datacube.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class DailySummary {

    /**
     * 日期，格式为 yyyymmdd
     */
    private String ref_date;

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    /**
     * 累计用户数
     */
    private Long visit_total;

    public Long getVisit_total() {
        return visit_total;
    }

    public void setVisit_total(Long visit_total) {
        this.visit_total = visit_total;
    }

    /**
     * 转发次数
     */
    private Long share_pv;

    public Long getShare_pv() {
        return share_pv;
    }

    public void setShare_pv(Long share_pv) {
        this.share_pv = share_pv;
    }

    /**
     * 转发人数
     */
    private Long share_uv;

    public Long getShare_uv() {
        return share_uv;
    }

    public void setShare_uv(Long share_uv) {
        this.share_uv = share_uv;
    }
}
