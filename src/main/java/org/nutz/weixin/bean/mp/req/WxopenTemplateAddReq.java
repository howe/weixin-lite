package org.nutz.weixin.bean.mp.req;

import java.util.List;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateAddReq extends BaseReq {

    /**
     * 模板标题id，可通过接口获取，也可登录小程序后台查看获取
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 开发者自行组合好的模板关键词列表，关键词顺序可以自由搭配（例如[3,5,4]或[4,5,3]），最多支持10个关键词组合
     */
    private List<Integer> keyword_id_list;

    public List<Integer> getKeyword_id_list() {
        return keyword_id_list;
    }

    public void setKeyword_id_list(List<Integer> keyword_id_list) {
        this.keyword_id_list = keyword_id_list;
    }
}
