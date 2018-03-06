package org.nutz.weixin.bean.pay.resp;

import org.nutz.mvc.annotation.Param;

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
    @Param("trade_type")
    private String tradeType;

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 预支付交易会话标识
     * <p>
     * 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    @Param("prepay_id")
    private String prepayId;

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    /**
     * 二维码链接
     * <p>
     * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付
     */
    @Param("code_url")
    private String codeUrl;

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
}
