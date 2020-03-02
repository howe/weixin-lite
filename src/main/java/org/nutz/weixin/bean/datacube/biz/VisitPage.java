package org.nutz.weixin.bean.datacube.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class VisitPage {

    /**
     * 页面路径
     */
    private String page_path;

    public String getPage_path() {
        return page_path;
    }

    public void setPage_path(String page_path) {
        this.page_path = page_path;
    }

    /**
     * 访问次数
     */
    private Long page_visit_pv;

    public Long getPage_visit_pv() {
        return page_visit_pv;
    }

    public void setPage_visit_pv(Long page_visit_pv) {
        this.page_visit_pv = page_visit_pv;
    }

    /**
     * 访问人数
     */
    private Long page_visit_uv;

    public Long getPage_visit_uv() {
        return page_visit_uv;
    }

    public void setPage_visit_uv(Long page_visit_uv) {
        this.page_visit_uv = page_visit_uv;
    }

    /**
     * 次均停留时长
     */
    private Long page_staytime_pv;

    public Long getPage_staytime_pv() {
        return page_staytime_pv;
    }

    public void setPage_staytime_pv(Long page_staytime_pv) {
        this.page_staytime_pv = page_staytime_pv;
    }

    /**
     * 进入页次数
     */
    private Long entrypage_pv;

    public Long getEntrypage_pv() {
        return entrypage_pv;
    }

    public void setEntrypage_pv(Long entrypage_pv) {
        this.entrypage_pv = entrypage_pv;
    }

    /**
     * 退出页次数
     */
    private Long exitpage_pv;

    public Long getExitpage_pv() {
        return exitpage_pv;
    }

    public void setExitpage_pv(Long exitpage_pv) {
        this.exitpage_pv = exitpage_pv;
    }

    /**
     * 转发次数
     */
    private Long page_share_pv;

    public Long getPage_share_pv() {
        return page_share_pv;
    }

    public void setPage_share_pv(Long page_share_pv) {
        this.page_share_pv = page_share_pv;
    }

    /**
     * 转发人数
     */
    private Long page_share_uv;

    public Long getPage_share_uv() {
        return page_share_uv;
    }

    public void setPage_share_uv(Long page_share_uv) {
        this.page_share_uv = page_share_uv;
    }
}
