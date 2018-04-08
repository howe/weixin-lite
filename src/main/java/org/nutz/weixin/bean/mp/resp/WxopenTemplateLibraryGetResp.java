package org.nutz.weixin.bean.mp.resp;

import org.nutz.weixin.bean.mp.biz.WxopenTemplateLibraryGet;

import java.util.List;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateLibraryGetResp extends BaseResp {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private List<WxopenTemplateLibraryGet> keyword_list;

    public List<WxopenTemplateLibraryGet> getKeyword_list() {
        return keyword_list;
    }

    public void setKeyword_list(List<WxopenTemplateLibraryGet> keyword_list) {
        this.keyword_list = keyword_list;
    }
}
