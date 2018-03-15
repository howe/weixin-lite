package org.nutz.weixin.bean.pay.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/7
 *
 * @howechiang
 */
public class RefundqueryResp extends Resp {

    /**
     * 订单总退款次数
     * <p>
     * 订单总共已发生的部分退款次数，当请求参数传入offset后有返回
     */
    @Param("total_refund_count")
    @JsonField("total_refund_count")
    private int totalRefundCount;

    public int getTotalRefundCount() {
        return totalRefundCount;
    }

    public void setTotalRefundCount(int totalRefundCount) {
        this.totalRefundCount = totalRefundCount;
    }

    /**
     * 微信订单号
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
     * 标价金额
     * <p>
     * 订单总金额，单位为分
     */
    @Param("total_fee")
    @JsonField("total_fee")
    private int totalFee;

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 应结订单金额
     * <p>
     * 当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额。
     */
    @Param("settlement_total_fee")
    @JsonField("settlement_total_fee")
    private int settlementTotalFee;

    public int getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(int settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 货币类型
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    @Param("fee_type")
    @JsonField("fee_type")
    private String feeType;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * 现金支付金额
     * <p>
     * 现金支付金额订单现金支付金额，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    @Param("cash_fee")
    @JsonField("cash_fee")
    private int cashFee;

    public int getCashFee() {
        return cashFee;
    }

    public void setCashFee(int cashFee) {
        this.cashFee = cashFee;
    }
}
