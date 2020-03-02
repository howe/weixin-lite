package org.nutz.weixin.bean.wxa.req;

/**
 * Created by Jianghao on 2019/8/16
 *
 * @author Freshplay Inc.
 */
public class GetpaidunionidReq extends BaseReq {

    /**
     * 支付用户唯一标识
     * 必填
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 微信支付订单号
     * 选填
     */
    private String transaction_id;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     * 微信支付分配的商户号，和商户订单号配合使用
     * 选填
     */
    private String mch_id;

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * 微信支付商户订单号，和商户号配合使用
     * 选填
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
