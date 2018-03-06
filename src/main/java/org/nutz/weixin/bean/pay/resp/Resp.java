package org.nutz.weixin.bean.pay.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class Resp extends BaseResp {

    /**
     * 公众账号ID
     * <p>
     * 调用接口提交的公众账号ID
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
     * <p>
     * 调用接口提交的商户号
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
     * 设备号
     * <p>
     * 自定义参数，可以为请求支付的终端设备号等
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
     * 随机字符串
     * <p>
     * 微信返回的随机字符串
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
     * 微信返回的签名值，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">签名算法</a>
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 业务结果
     * <p>
     * SUCCESS/FAIL
     */
    @Param("result_code")
    @JsonField("result_code")
    private String resultCode;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 错误代码
     * <p>
     * 详细参见下文错误列表
     */
    @Param("err_code")
    @JsonField("err_code")
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * 错误代码描述
     * <p>
     * 错误信息描述
     */
    @Param("err_code_des")
    @JsonField("err_code_des")
    private String errCodeDes;

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}
