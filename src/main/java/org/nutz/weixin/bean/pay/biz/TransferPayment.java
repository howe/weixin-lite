package org.nutz.weixin.bean.pay.biz;

/**
 * Created by Jianghao on 2018/3/19
 *
 * @howechiang
 */
public class TransferPayment {

    /**
     * 公众号id
     * <p>
     * 商户注册具有支付权限的公众号成功后即可获得
     */
    private String appId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 时间戳
     * <p>
     * 当前的时间，其他详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">时间戳规则</a>
     */
    private long timeStamp;

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 随机字符串
     * <p>
     * 随机字符串，不长于32位。推荐<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">随机数生成算法</a>
     */
    private String nonceStr;

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    /**
     * 订单详情扩展字符串
     * <p>
     * 统一下单接口返回的prepay_id参数值，提交格式如：prepay_id=***
     */
    private String $package;

    public String get$package() {
        return $package;
    }

    public void set$package(String $package) {
        this.$package = $package;
    }

    /**
     * 签名方式
     * <p>
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。注意此处需与统一下单的签名类型一致
     */
    private String signType;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * 签名
     * <p>
     * 签名，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">签名生成算法</a>
     */
    private String paySign;

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }
}
