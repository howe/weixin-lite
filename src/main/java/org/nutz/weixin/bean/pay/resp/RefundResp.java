package org.nutz.weixin.bean.pay.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/7
 *
 * @howechiang
 */
public class RefundResp extends Resp {

    /**
     * 微信订单号
     * <p>
     * 微信生成的订单号，在支付通知中有返回
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
     * 微信退款单号
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
     * 退款金额
     * <p>
     * 退款总金额,单位为分,可以做部分退款
     */
    @Param("refund_fee")
    @JsonField("refund_fee")
    private int refundFee;

    public int getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(int refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * 应结退款金额
     * <p>
     * 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额
     */
    @Param("settlement_refund_fee")
    @JsonField("settlement_refund_fee")
    private int settlementRefundFee;

    public int getSettlementRefundFee() {
        return settlementRefundFee;
    }

    public void setSettlementRefundFee(int settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    /**
     * 标价金额
     * <p>
     * 订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
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
     * 去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。
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

    /**
     * 现金支付币种
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    @Param("cash_fee_type")
    @JsonField("cash_fee_type")
    private String cashFeeType;

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    /**
     * 现金退款金额
     * <p>
     * 现金退款金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    @Param("cash_refund_fee")
    @JsonField("cash_refund_fee")
    private int cashRefundFee;

    public int getCashRefundFee() {
        return cashRefundFee;
    }

    public void setCashRefundFee(int cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    /**
     * 代金券退款总金额
     * <p>
     * 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_1">代金券或立减优惠</a>
     */
    @Param("coupon_refund_fee")
    @JsonField("coupon_refund_fee")
    private int couponRefundFee;

    public int getCouponRefundFee() {
        return couponRefundFee;
    }

    public void setCouponRefundFee(int couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    /**
     * 退款代金券使用数量
     */
    @Param("coupon_refund_count")
    @JsonField("coupon_refund_count")
    private int couponRefundCount;

    public int getCouponRefundCount() {
        return couponRefundCount;
    }

    public void setCouponRefundCount(int couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }
}
