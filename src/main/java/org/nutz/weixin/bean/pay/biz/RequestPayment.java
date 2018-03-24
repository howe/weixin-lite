package org.nutz.weixin.bean.pay.biz;

/**
 * Created by Jianghao on 2018/3/24
 *
 * @howechiang
 */
public class RequestPayment {

    /**
     * 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间
     */
    private long timeStamp;

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 随机字符串，长度为32个字符以下。
     */
    private String nonceStr;

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    /**
     * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=*
     */
    private String $package;

    public String get$package() {
        return $package;
    }

    public void set$package(String $package) {
        this.$package = $package;
    }

    /**
     * 签名算法，暂支持 MD5
     */
    private String signType;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * 签名,具体签名方案参见<a href="https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=3">小程序支付接口文档</a>;
     */
    private String paySign;

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public RequestPayment(long timeStamp, String nonceStr, String $package) {
        this.timeStamp = timeStamp;
        this.nonceStr = nonceStr;
        this.$package = $package;
        this.signType = "MD5";
    }
}
