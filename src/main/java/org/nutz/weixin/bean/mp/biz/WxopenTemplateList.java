package org.nutz.weixin.bean.mp.biz;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class WxopenTemplateList {

    /**
     * 添加至帐号下的模板id，发送小程序模板消息时所需
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
     * 模板内容示例
     */
    private String example;

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
