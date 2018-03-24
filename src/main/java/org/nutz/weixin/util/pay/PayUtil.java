package org.nutz.weixin.util.pay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.pay.Error;
import org.nutz.weixin.bean.pay.req.CloseorderReq;
import org.nutz.weixin.bean.pay.req.OrderqueryReq;
import org.nutz.weixin.bean.pay.req.RefundReq;
import org.nutz.weixin.bean.pay.req.UnifiedorderReq;
import org.nutz.weixin.bean.pay.resp.CloseorderResp;
import org.nutz.weixin.bean.pay.resp.OrderqueryResp;
import org.nutz.weixin.bean.pay.resp.RefundResp;
import org.nutz.weixin.bean.pay.resp.UnifiedorderResp;
import org.nutz.weixin.util.HttpUtil;
import org.nutz.weixin.util.Util;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class PayUtil {

    /**
     * 统一下单
     * <p>
     * 除被扫支付场景以外，商户系统先调用该接口在微信支付服务后台生成预支付交易单，
     * 返回正确的预支付交易回话标识后再按扫码、JSAPI、APP等不同场景生成交易串调起支付
     * <p>
     * <img src="https://pay.weixin.qq.com/wiki/doc/api/img/chapter9_1_0.jpg" />
     *
     * @param req 参数
     * @return 结果
     */
    public static UnifiedorderResp unifiedorder(UnifiedorderReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getMch_id())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getNonce_str())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSign_type(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else if (Strings.isBlank(req.getBody())) {
                throw new NullPointerException("body为空");
            } else if (Strings.isBlank(req.getOut_trade_no())) {
                throw new NullPointerException("out_trade_no为空");
            } else if (!Strings.equalsIgnoreCase(req.getFee_type(), "CNY")) {
                throw new Exception("fee_type符合ISO 4217标准的三位字母代码，默认人民币：CNY，详细列表请参见货币类型");
            } else if (Lang.isEmpty(req.getTotal_fee())) {
                throw new NullPointerException("total_fee为空");
            } else if (Strings.isBlank(req.getSpbill_create_ip())) {
                throw new NullPointerException("spbill_create_ip为空");
            } else if (Strings.isBlank(req.getNotify_url())) {
                throw new NullPointerException("onotify_url为空");
            } else if (Strings.isBlank(req.getTrade_type())) {
                throw new NullPointerException("trade_type为空");
            } else if (!Strings.equalsIgnoreCase(req.getTrade_type(), "JSAPI")
                    && !Strings.equalsIgnoreCase(req.getTrade_type(), "NATIVE")
                    && !Strings.equalsIgnoreCase(req.getTrade_type(), "APP")) {
                throw new Exception("JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付，统一下单接口trade_type的传参可参考这里");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_UNIFIEDORDER, Xmls.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Xmls.xmlToMap(xml);
                if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                    if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                        return Lang.map2Object(map, UnifiedorderResp.class);
                    } else {
                        throw new Exception(Error.getError(map.getString("result_code")).toString());
                    }
                } else {
                    throw new Exception(map.getString("return_msg"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 查询订单
     * <p>
     * 该接口提供所有微信支付订单的查询，商户可以通过查询订单接口主动查询订单状态，完成下一步的业务逻辑。
     * <p>
     * 需要调用查询接口的情况：
     * <p>
     * ◆ 当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知；
     * <p>
     * ◆ 调用支付接口后，返回系统错误或未知交易状态情况；
     * <p>
     * ◆ 调用刷卡支付API，返回USERPAYING的状态；
     * <p>
     * ◆ 调用关单或撤销接口API之前，需确认支付状态；
     *
     * @param req 参数
     * @return 结果
     */
    public static OrderqueryResp orderquery(OrderqueryReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getMch_id())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getTransaction_id()) && Strings.isBlank(req.getOut_trade_no())) {
                throw new Exception("transaction_id与out_trade_no二选一");
            } else if (Strings.isBlank(req.getNonce_str())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSign_type(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_ORDERQUERY, Xmls.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Xmls.xmlToMap(xml);
                if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                    if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                        return Lang.map2Object(map, OrderqueryResp.class);
                    } else {
                        throw new Exception(Error.getError(map.getString("result_code")).toString());
                    }
                } else {
                    throw new Exception(map.getString("return_msg"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 关闭订单
     * <p>
     * 以下情况需要调用关单接口：商户订单支付失败需要生成新单号重新发起支付，要对原订单号调用关单，避免重复支付；系统下单后，用户支付超时，系统退出不再受理，避免用户继续，请调用关单接口。
     * <p>
     * 注意：订单生成后不能马上调用关单接口，最短调用时间间隔为5分钟。
     *
     * @param req 参数
     * @return 结果
     */
    public static CloseorderResp closeorder(CloseorderReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getMch_id())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getOut_trade_no())) {
                throw new Exception("out_trade_no为空");
            } else if (Strings.isBlank(req.getNonce_str())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSign_type(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_CLOSEORDER, Xmls.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Xmls.xmlToMap(xml);
                if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                    if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                        return Lang.map2Object(map, CloseorderResp.class);
                    } else {
                        throw new Exception(Error.getError(map.getString("result_code")).toString());
                    }
                } else {
                    throw new Exception(map.getString("return_msg"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 申请退款
     * <p>
     * 当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，微信支付将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上。
     * <p>
     * 注意：
     * <p>
     * 1、交易时间超过一年的订单无法提交退款
     * <p>
     * 2、微信支付退款支持单笔交易分多次退款，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。申请退款总金额不能超过订单金额。 一笔退款失败后重新提交，请不要更换退款单号，请使用原商户退款单号
     * <p>
     * 3、请求频率限制：150qps，即每秒钟正常的申请退款请求次数不超过150次
     * <p>
     * 错误或无效请求频率限制：6qps，即每秒钟异常或错误的退款申请请求不超过6次
     * <p>
     * 4、每个支付订单的部分退款次数不能超过50次
     * <p>
     * 请求需要双向证书。 详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_3">证书使用</a>
     *
     * @param req 参数
     * @return 结果
     */
    public static RefundResp refund(RefundReq req) {
        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getMch_id())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getOut_refund_no()) && Strings.isBlank(req.getTransaction_id())) {
                throw new Exception("transaction_id与out_trade_no二选一");
            } else if (Strings.isBlank(req.getNonce_str())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (Lang.isEmpty(req.getTotal_fee())) {
                throw new NullPointerException("total_fee为空");
            } else if (Lang.isEmpty(req.getRefund_fee())) {
                throw new NullPointerException("refund_fee为空");
            } else if (!Strings.equalsIgnoreCase(req.getRefund_fee_type(), "CNY")) {
                throw new Exception("fee_type符合ISO 4217标准的三位字母代码，默认人民币：CNY，详细列表请参见货币类型");
            } else if (!Strings.equalsIgnoreCase(req.getSign_type(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSign_type(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_REFUND, Xmls.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Xmls.xmlToMap(xml);
                if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                    if (Strings.equalsIgnoreCase(map.getString("return_code"), "SUCCESS")) {
                        return Lang.map2Object(map, RefundResp.class);
                    } else {
                        throw new Exception(Error.getError(map.getString("result_code")).toString());
                    }
                } else {
                    throw new Exception(map.getString("return_msg"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
