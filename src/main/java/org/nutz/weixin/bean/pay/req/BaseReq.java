package org.nutz.weixin.bean.pay.req;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class BaseReq {

    /**
     * 应用ID
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 商户号
     */
    private String mch_id;

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * 随机字符串
     * <p>
     * 随机字符串，不长于32位。推荐<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">随机数生成算法</a>
     */
    private String nonce_str;

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    /**
     * 签名
     * <p>
     * 通过签名算法计算得出的签名值，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">签名生成算法</a>
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 签名类型
     * <p>
     * 签名类型，目前支持HMAC-SHA256和MD5，默认为MD5
     */
    private String sign_type;

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }
}
