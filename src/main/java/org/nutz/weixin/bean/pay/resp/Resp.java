package org.nutz.weixin.bean.pay.resp;

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
    private String mch_id;

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * 设备号
     * <p>
     * 自定义参数，可以为请求支付的终端设备号等
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 随机字符串
     * <p>
     * 微信返回的随机字符串
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
    private String result_code;

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    /**
     * 错误代码
     * <p>
     * 详细参见下文错误列表
     */
    private String err_code;

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    /**
     * 错误代码描述
     * <p>
     * 错误信息描述
     */
    private String err_code_des;

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }
}
