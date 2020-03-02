package org.nutz.weixin.bean.datacube.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class VisitTrend {

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
     * 打开次数
     */
    private Long session_cnt;

    public Long getSession_cnt() {
        return session_cnt;
    }

    public void setSession_cnt(Long session_cnt) {
        this.session_cnt = session_cnt;
    }

    /**
     * 访问次数
     */
    private Long visit_pv;

    public Long getVisit_pv() {
        return visit_pv;
    }

    public void setVisit_pv(Long visit_pv) {
        this.visit_pv = visit_pv;
    }

    /**
     * 访问人数
     */
    private Long visit_uv;

    public Long getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(Long visit_uv) {
        this.visit_uv = visit_uv;
    }

    /**
     * 新用户数
     */
    private Long visit_uv_new;

    public Long getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(Long visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    /**
     * 人均停留时长 (浮点型，单位：秒)
     */
    private Integer stay_time_uv;

    public Integer getStay_time_uv() {
        return stay_time_uv;
    }

    public void setStay_time_uv(Integer stay_time_uv) {
        this.stay_time_uv = stay_time_uv;
    }

    /**
     * 次均停留时长 (浮点型，单位：秒)
     */
    private Integer stay_time_session;

    public Integer getStay_time_session() {
        return stay_time_session;
    }

    public void setStay_time_session(Integer stay_time_session) {
        this.stay_time_session = stay_time_session;
    }

    /**
     * 平均访问深度 (浮点型)
     */
    private Double visit_depth;

    public Double getVisit_depth() {
        return visit_depth;
    }

    public void setVisit_depth(Double visit_depth) {
        this.visit_depth = visit_depth;
    }
}