package org.nutz.weixin.bean.mp.resp;

import org.nutz.weixin.bean.mp.biz.WxopenTemplateList;
import org.nutz.weixin.bean.mp.req.BaseReq;

import java.util.List;

/**
 * Created by Jianghao on 2018/4/12
 *
 * @howechiang
 */
public class WxopenTemplateListResp extends BaseReq {

    private List<WxopenTemplateList> list;

    public List<WxopenTemplateList> getList() {
        return list;
    }

    public void setList(List<WxopenTemplateList> list) {
        this.list = list;
    }
}
