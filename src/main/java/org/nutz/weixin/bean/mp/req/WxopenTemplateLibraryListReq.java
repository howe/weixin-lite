package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2018/4/8
 *
 * @howechiang
 */
public class WxopenTemplateLibraryListReq {

    /**
     * 接口调用凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
     */
    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
     */
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
