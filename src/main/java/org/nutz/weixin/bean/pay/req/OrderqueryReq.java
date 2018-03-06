package org.nutz.weixin.bean.pay.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。 详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">商户订单号</a>
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
}
