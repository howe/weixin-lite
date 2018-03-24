package org.nutz.weixin.bean.pay.req;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class CloseorderReq extends BaseReq {

    /**
     * 商户订单号
     * <p>
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public CloseorderReq(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public CloseorderReq() {
    }
}
