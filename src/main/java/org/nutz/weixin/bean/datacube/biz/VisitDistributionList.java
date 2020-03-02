package org.nutz.weixin.bean.datacube.biz;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class VisitDistributionList {

    /**
     * 分布类型
     * access_source_session_cnt	访问来源分布
     * access_staytime_info	访问时长分布
     * access_depth_info	访问深度的分布
     */
    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * 分布数据列表
     */
    private List<Item> item_list;

    public List<Item> getItem_list() {
        return item_list;
    }

    public void setItem_list(List<Item> item_list) {
        this.item_list = item_list;
    }
}
