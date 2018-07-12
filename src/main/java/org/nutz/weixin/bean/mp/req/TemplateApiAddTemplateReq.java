package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/7/11
 *
 * @howechiang
 */
public class TemplateApiAddTemplateReq extends BaseReq {

    /**
     * 模板库中模板的编号，有“TM**”和“OPENTMTM**”等形式
     */
    private String template_id_short;

    public String getTemplate_id_short() {
        return template_id_short;
    }

    public void setTemplate_id_short(String template_id_short) {
        this.template_id_short = template_id_short;
    }
}
