package org.nutz.weixin.bean.pay.resp;

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
    private String is_subscribe;

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    /**
     * 交易类型
     * <p>
     * 调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY，详细说明见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">参数规定</a>
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
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
    private String trade_state;

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

    /**
     * 付款银行
     * <p>
     * 银行类型，采用字符串类型的银行标识
     */
    private String bank_type;

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    /**
     * 标价金额
     * <p>
     * 订单总金额，单位为分
     */
    private int total_fee;

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 应结订单金额
     * <p>
     * 当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额。
     */
    private String settlement_total_fee;

    public String getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(String settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    /**
     * 标价币种
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 现金支付金额
     * <p>
     * 现金支付金额订单现金支付金额，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int cash_fee;

    public int getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(int cash_fee) {
        this.cash_fee = cash_fee;
    }

    /**
     * 现金支付币种
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    private String cash_fee_type;

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    /**
     * 代金券金额
     * <p>
     * “代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int coupon_fee;

    public int getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(int coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    /**
     * 代金券使用数量
     * <p>
     * 代金券使用数量
     */
    private int coupon_count;

    public int getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(int coupon_count) {
        this.coupon_count = coupon_count;
    }

    /**
     * 代金券类型
     * <p>
     * 开通免充值券功能，并且订单使用了优惠券后有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0
     */
    private String coupon_type_$0;

    public String getCoupon_type_$0() {
        return coupon_type_$0;
    }

    public void setCoupon_type_$0(String coupon_type_$0) {
        this.coupon_type_$0 = coupon_type_$0;
    }

    /**
     * 代金券ID
     * <p>
     * 代金券ID, $n为下标，从0开始编号
     */
    private String coupon_id_$0;

    public String getCoupon_id_$0() {
        return coupon_id_$0;
    }

    public void setCoupon_id_$0(String coupon_id_$0) {
        this.coupon_id_$0 = coupon_id_$0;
    }

    /**
     * 单个代金券支付金额
     * <p>
     * 单个代金券支付金额, $n为下标，从0开始编号
     */
    private int coupon_fee_$0;

    public int getCoupon_fee_$0() {
        return coupon_fee_$0;
    }

    public void setCoupon_fee_$0(int coupon_fee_$0) {
        this.coupon_fee_$0 = coupon_fee_$0;
    }

    /**
     * 微信订单号
     * <p>
     * 微信支付订单号
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
    private String time_end;

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    /**
     * 交易状态描述
     * <p>
     * 对当前查询订单状态的描述和下一步操作的指引
     */
    private String trade_state_desc;

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }
}
