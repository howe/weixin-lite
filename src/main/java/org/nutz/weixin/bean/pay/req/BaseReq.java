package org.nutz.weixin.bean.pay.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
    @Param("mch_id")
    @JsonField("mch_id")
    private String mchId;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * 随机字符串
     * <p>
     * 随机字符串，不长于32位。推荐<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">随机数生成算法</a>
     */
    @Param("nonce_str")
    @JsonField("nonce_str")
    private String nonceStr;

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
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
    @Param("sign_type")
    @JsonField("sign_type")
    private String signType;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
