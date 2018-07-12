package org.nutz.weixin.bean.mp.resp;

import org.nutz.weixin.bean.mp.biz.Industry;

/**
 * Created by Jianghao on 2018/7/12
 *
 * @howechiang
 */
public class TemplateGetIndustryResp {

    /**
     * 帐号设置的主营行业
     */
    private Industry primary_industry;

    public Industry getPrimary_industry() {
        return primary_industry;
    }

    public void setPrimary_industry(Industry primary_industry) {
        this.primary_industry = primary_industry;
    }

    /**
     * 帐号设置的副营行业
     */
    private Industry secondary_industry;

    public Industry getSecondary_industry() {
        return secondary_industry;
    }

    public void setSecondary_industry(Industry secondary_industry) {
        this.secondary_industry = secondary_industry;
    }
}
