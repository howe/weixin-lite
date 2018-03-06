package org.nutz.weixin.bean.pay.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;
import org.nutz.weixin.bean.pay.biz.SceneInfo;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class UnifiedorderReq extends BaseReq {

    /**
     * 设备号
     */
    @Param("device_info")
    @JsonField("device_info")
    private String deviceInfo;

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * 商品描述
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 商品详情
     */
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 附加数据
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 商户订单号
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
     * 总金额
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
     * 终端IP
     */
    @Param("spbill_create_ip")
    @JsonField("spbill_create_ip")
    private String spbillCreateIp;

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    /**
     * 交易起始时间
     */
    @Param("time_start")
    @JsonField("time_start")
    private String timeStart;

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * 交易结束时间
     */
    @Param("time_expire")
    @JsonField("time_expire")
    private String timeExpire;

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * 订单优惠标记
     */
    @Param("goods_tag")
    @JsonField("goods_tag")
    private String goodsTag;

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    /**
     * 通知地址
     */
    @Param("notify_url")
    @JsonField("notify_url")
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 交易类型
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
     * 指定支付方式
     */
    @Param("limit_pay")
    @JsonField("limit_pay")
    private String limitPay;

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    /**
     * 用户标识
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 场景信息
     */
    @Param("scene_info")
    @JsonField("scene_info")
    private SceneInfo sceneInfo;

    public SceneInfo getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
    }
}
