package org.nutz.weixin.bean.pay;

import org.nutz.lang.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class Error {

    /**
     * 名称
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 描述
     */
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 原因
     */
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 解决方案
     */
    private String solution;

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Error() {
    }

    public Error(String code, String desc, String reason, String solution) {
        this.code = code;
        this.desc = desc;
        this.reason = reason;
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", reason='" + reason + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }

    public static List<Error> list = new ArrayList<>(Arrays.asList(
            new Error("NOAUTH", "商户无此接口权限", "商户未开通此接口权限", "请商户前往申请此接口权限"),
            new Error("NOTENOUGH", "余额不足", "用户帐号余额不足", "用户帐号余额不足，请用户充值或更换支付卡后再支付"),
            new Error("ORDERPAID", "商户订单已支付", "商户订单已支付，无需重复操作", "商户订单已支付，无需更多操作"),
            new Error("ORDERCLOSED", "订单已关闭", "当前订单已关闭，无法支付", "当前订单已关闭，请重新下单"),
            new Error("SYSTEMERROR", "系统错误", "系统超时", "系统异常，请用相同参数重新调用"),
            new Error("APPID_NOT_EXIST", "APPID不存在", "参数中缺少APPID", "请检查APPID是否正确"),
            new Error("MCHID_NOT_EXIST", "MCHID不存在", "参数中缺少MCHID", "请检查MCHID是否正确"),
            new Error("APPID_MCHID_NOT_MATCH", "appid和mch_id不匹配", "appid和mch_id不匹配", "请确认appid和mch_id是否匹配"),
            new Error("LACK_PARAMS", "缺少参数", "缺少必要的请求参数", "请检查参数是否齐全"),
            new Error("OUT_TRADE_NO_USED", "商户订单号重复", "同一笔交易不能多次提交", "请核实商户订单号是否重复提交"),
            new Error("SIGNERROR", "签名错误", "参数签名结果不正确", "请检查签名参数和方法是否都符合签名算法要求"),
            new Error("XML_FORMAT_ERROR", "XML格式错误", "XML格式错误", "请检查XML参数格式是否正确"),
            new Error("REQUIRE_POST_METHOD", "请使用post方法", "未使用post传递参数", "请检查请求参数是否通过post方法提交"),
            new Error("POST_DATA_EMPTY", "post数据为空", "post数据不能为空", "请检查post数据是否为空"),
            new Error("NOT_UTF8", "编码格式错误", "未使用指定编码格式", "请使用UTF-8编码格式"),
            new Error("ORDERNOTEXIST", "此交易订单号不存在", "查询系统中不存在此交易订单号", "该API只能查提交支付交易返回成功的订单，请商户检查需要查询的订单号是否正确"),
            new Error("ORDERPAID", "订单已支付", "订单已支付，不能发起关单", "订单已支付，不能发起关单，请当作已支付的正常交易"),
            new Error("ORDERCLOSED", "订单已关闭", "订单已关闭，无法重复关闭", "订单已关闭，无需继续调用"),
            new Error("XML_FORMAT_ERROR", "XML格式错误", "XML格式错误", "请检查XML参数格式是否正确")
    ));

    public static Error getError(String code) {
        for (Error error : list) {
            if (Strings.equalsIgnoreCase(code, error.getCode())) {
                return error;
            }
        }
        return new Error("unknown", "未知", "", "");
    }
}
