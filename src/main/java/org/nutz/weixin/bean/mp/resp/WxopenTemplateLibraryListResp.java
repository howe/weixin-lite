package org.nutz.weixin.bean.mp.resp;

import org.nutz.weixin.bean.mp.biz.WxopenTemplateLibraryList;

import java.util.List;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateLibraryListResp extends BaseResp {

    private List<WxopenTemplateLibraryList> list;

    public List<WxopenTemplateLibraryList> getList() {
        return list;
    }

    public void setList(List<WxopenTemplateLibraryList> list) {
        this.list = list;
    }

    private int total_count;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }
}
