package org.nutz.weixin.bean.pay.resp;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class UnifiedorderResp extends Resp {

    /**
     * 交易类型
     * JSAPI 公众号支付
     * <p>
     * NATIVE 扫码支付
     * <p>
     * APP APP支付
     * <p>
     * 说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">参数规定</a>
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * 预支付交易会话标识
     * <p>
     * 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    private String prepay_id;

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    /**
     * 二维码链接
     * <p>
     * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付
     */
    private String code_url;

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }
}
