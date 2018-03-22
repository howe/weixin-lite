package org.nutz.weixin.bean.pay.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
    @Param("transaction_id")
    @JsonField("transaction_id")
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 商户订单号
     * <p>
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
     */
    @Param("out_trade_no")
    @JsonField("out_trade_no")
    private String outTradeNo;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * 商户退款单号
     * <p>
     * 商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。
     */
    @Param("out_refund_no")
    @JsonField("out_refund_no")
    private String outRefundNo;

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    /**
     * 微信退款单号
     * <p>
     * 微信生成的退款单号，在申请退款接口有返回
     */
    @Param("refund_id")
    @JsonField("refund_id")
    private String refundId;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
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

    public RefundqueryReq(String transactionId, String outTradeNo, String outRefundNo, String refundId, int offset) {
        this.transactionId = transactionId;
        this.outTradeNo = outTradeNo;
        this.outRefundNo = outRefundNo;
        this.refundId = refundId;
        this.offset = offset;
    }

    public RefundqueryReq() {
    }
}
