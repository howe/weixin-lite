package org.nutz.weixin.bean.mp.req;

/**
 * Created by Jianghao on 2018/4/12
 *
 * @howechiang
 */
public class WxopenTemplateListReq extends BaseReq {

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
