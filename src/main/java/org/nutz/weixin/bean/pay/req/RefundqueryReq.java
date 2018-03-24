package org.nutz.weixin.bean.pay.req;

/**
 * Created by Jianghao on 2018/3/7
 *
 * @howechiang
 */
public class RefundqueryReq extends BaseReq {

    /**
     * 微信订单号
     * <p>
     * 微信订单号查询的优先级是： refund_id > out_refund_no > transaction_id > out_trade_no
     */
    private String transaction_id;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

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

    /**
     * 商户退款单号
     * <p>
     * 商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。
     */
    private String out_refund_no;

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    /**
     * 微信退款单号
     * <p>
     * 微信生成的退款单号，在申请退款接口有返回
     */
    private String refund_id;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    /**
     * 偏移量
     * <p>
     * 偏移量，当部分退款次数超过10次时可使用，表示返回的查询结果从这个偏移量开始取记录
     */
    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public RefundqueryReq(String transaction_id, String out_trade_no, String out_refund_no, String refund_id, int offset) {
        this.transaction_id = transaction_id;
        this.out_trade_no = out_trade_no;
        this.out_refund_no = out_refund_no;
        this.refund_id = refund_id;
        this.offset = offset;
    }

    public RefundqueryReq() {
    }
}
