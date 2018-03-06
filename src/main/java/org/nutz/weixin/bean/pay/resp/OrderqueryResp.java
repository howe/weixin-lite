package org.nutz.weixin.bean.pay.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class OrderqueryResp extends Resp {

    /**
     * 用户标识
     * <p>
     * 用户在商户appid下的唯一标识
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 是否关注公众账号
     * <p>
     * 用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
     */
    @Param("is_subscribe")
    @JsonField("is_subscribe")
    private String isSubscribe;

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    /**
     * 交易类型
     * <p>
     * 调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY，详细说明见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">参数规定</a>
     */
    @Param("trade_type")
    @JsonField("trade_type")
    private String tradeType;

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 交易状态
     * <p>
     * SUCCESS—支付成功
     * <p>
     * REFUND—转入退款
     * <p>
     * NOTPAY—未支付
     * <p>
     * CLOSED—已关闭
     * <p>
     * REVOKED—已撤销（刷卡支付）
     * <p>
     * USERPAYING--用户支付中
     * <p>
     * PAYERROR--支付失败(其他原因，如银行返回失败)
     * <p>
     * 支付状态机请见下单API页面
     */
    @Param("trade_state")
    @JsonField("trade_state")
    private String tradeState;

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    /**
     * 付款银行
     * <p>
     * 银行类型，采用字符串类型的银行标识
     */
    @Param("bank_type")
    @JsonField("bank_type")
    private String bankType;

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
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
    private String settlementTotalFee;

    public String getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(String settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 标价币种
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
     * 代金券金额
     * <p>
     * “代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    @Param("coupon_fee")
    @JsonField("coupon_fee")
    private int couponFee;

    public int getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(int couponFee) {
        this.couponFee = couponFee;
    }

    /**
     * 代金券使用数量
     * <p>
     * 代金券使用数量
     */
    @Param("coupon_count")
    @JsonField("coupon_count")
    private int couponCount;

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 微信订单号
     * <p>
     * 微信支付订单号
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
     * 附加数据
     * <p>
     * 附加数据，原样返回
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 支付完成时间
     * <p>
     * 订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">时间规则</a>
     */
    @Param("time_end")
    @JsonField("time_end")
    private String timeEnd;

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * 交易状态描述
     * <p>
     * 对当前查询订单状态的描述和下一步操作的指引
     */
    @Param("trade_state_desc")
    @JsonField("trade_state_desc")
    private String tradeStateDesc;

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }
}
