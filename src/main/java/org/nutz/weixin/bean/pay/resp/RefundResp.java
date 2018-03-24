package org.nutz.weixin.bean.pay.resp;

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
     * 微信退款单号
     */
    private String refund_id;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    /**
     * 退款金额
     * <p>
     * 退款总金额,单位为分,可以做部分退款
     */
    private int refund_fee;


    /**
     * 应结退款金额
     * <p>
     * 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额
     */
    private int settlement_refund_fee;

    public int getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(int refund_fee) {
        this.refund_fee = refund_fee;
    }

    /**
     * 标价金额
     * <p>
     * 订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int total_fee;

    public int getSettlement_refund_fee() {
        return settlement_refund_fee;
    }

    public void setSettlement_refund_fee(int settlement_refund_fee) {
        this.settlement_refund_fee = settlement_refund_fee;
    }

    /**
     * 应结订单金额
     * <p>
     * 去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。
     */
    private int settlement_total_fee;

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 货币类型
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    private String fee_type;

    public int getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(int settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    /**
     * 现金支付金额
     * <p>
     * 现金支付金额订单现金支付金额，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int cash_fee;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 现金支付币种
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    private String cash_fee_type;

    public int getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(int cash_fee) {
        this.cash_fee = cash_fee;
    }

    /**
     * 现金退款金额
     * <p>
     * 现金退款金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int cash_refund_fee;

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    /**
     * 代金券退款总金额
     * <p>
     * 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_1">代金券或立减优惠</a>
     */
    private int coupon_refund_fee;

    public int getCash_refund_fee() {
        return cash_refund_fee;
    }

    public void setCash_refund_fee(int cash_refund_fee) {
        this.cash_refund_fee = cash_refund_fee;
    }

    /**
     * 退款代金券使用数量
     */
    private int coupon_refund_count;

    public int getCoupon_refund_fee() {
        return coupon_refund_fee;
    }

    public void setCoupon_refund_fee(int coupon_refund_fee) {
        this.coupon_refund_fee = coupon_refund_fee;
    }
}
