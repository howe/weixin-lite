package org.nutz.weixin.bean.mp.biz;

/**
 * Created by Jianghao on 2018/7/12
 *
 * @howechiang
 */
public class PrivateTemplate {

    /**
     * 模板ID
     */
    private String template_id;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    /**
     * 模板标题
     */
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 模板所属行业的一级行业
     */
    private String primary_industry;

    public String getPrimary_industry() {
        return primary_industry;
    }

    public void setPrimary_industry(String primary_industry) {
        this.primary_industry = primary_industry;
    }

    /**
     * 	模板所属行业的二级行业
     */
    private String deputy_industry;

    public String getDeputy_industry() {
        return deputy_industry;
    }

    public void setDeputy_industry(String deputy_industry) {
        this.deputy_industry = deputy_industry;
    }

    /**
     * 模板内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 模板示例
     */
    private String example;

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
