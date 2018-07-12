package org.nutz.weixin.bean.mp.resp;

import org.nutz.weixin.bean.mp.biz.PrivateTemplate;

import java.util.List;

/**
 * Created by Jianghao on 2018/7/12
 *
 * @howechiang
 */
public class TemplateGetAllPrivateTemplateResp {

    private List<PrivateTemplate> template_list;

    public List<PrivateTemplate> getTemplate_list() {
        return template_list;
    }

    public void setTemplate_list(List<PrivateTemplate> template_list) {
        this.template_list = template_list;
    }
}
