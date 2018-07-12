package org.nutz.weixin.bean.mp.req;

import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.mp.biz.Miniprogram;

/**
 * Created by Jianghao on 2018/7/12
 *
 * @howechiang
 */
public class MessageTemplateSendReq extends BaseReq {

    /**
     * 接收者（用户）的 openid
     */
    private String touser;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * 所需下发的模板消息的id
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * 模板跳转链接
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 跳小程序所需数据，不需跳小程序可不用传该数据
     */
    private Miniprogram miniprogram;

    public Miniprogram getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(Miniprogram miniprogram) {
        this.miniprogram = miniprogram;
    }

    /**
     * 模板数据
     * "data": {
     *     "first": {
     *         "value": "恭喜你购买成功！",
     *         "color": "#173177"
     *     },
     *     "keyword1": {
     *         "value": "巧克力",
     *         "color": "#173177"
     *     },
     *     "keyword2": {
     *         "value": "39.8元",
     *         "color": "#173177"
     *     },
     *     "keyword3": {
     *         "value": "2014年9月22日",
     *         "color": "#173177"
     *     },
     *     "remark": {
     *         "value": "欢迎再次购买！",
     *         "color": "#173177"
     *     }
     * }
     */
    private NutMap data;

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }
}
