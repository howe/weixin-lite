package org.nutz.weixin.bean.pay.req;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class OrderqueryReq extends BaseReq {

    /**
     * 微信订单号
     * <p>
     * 微信的订单号，建议优先使用
     */
    private String transaction_id;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 商户订单号
     * <p>
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。 详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">商户订单号</a>
     */
    private String out_trade_no;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public OrderqueryReq(String transaction_id, String out_trade_no) {
        this.transaction_id = transaction_id;
        this.out_trade_no = out_trade_no;
    }

    public OrderqueryReq() {
    }
}
