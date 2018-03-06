package org.nutz.weixin.util.pay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.pay.Error;
import org.nutz.weixin.bean.pay.req.CloseorderReq;
import org.nutz.weixin.bean.pay.req.OrderqueryReq;
import org.nutz.weixin.bean.pay.req.UnifiedorderReq;
import org.nutz.weixin.bean.pay.resp.CloseorderResp;
import org.nutz.weixin.bean.pay.resp.OrderqueryResp;
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
            } else if (Strings.isBlank(req.getMchId())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getNonceStr())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSignType(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSignType(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else if (Strings.isBlank(req.getBody())) {
                throw new NullPointerException("body为空");
            } else if (Strings.isBlank(req.getOutTradeNo())) {
                throw new NullPointerException("out_trade_no为空");
            } else if (!Strings.equalsIgnoreCase(req.getFeeType(), "CNY")) {
                throw new Exception("fee_type符合ISO 4217标准的三位字母代码，默认人民币：CNY，详细列表请参见货币类型");
            } else if (Lang.isEmpty(req.getTotalFee())) {
                throw new NullPointerException("total_fee为空");
            } else if (Strings.isBlank(req.getSpbillCreateIp())) {
                throw new NullPointerException("spbill_create_ip为空");
            } else if (Strings.isBlank(req.getNotifyUrl())) {
                throw new NullPointerException("onotify_url为空");
            } else if (Strings.isBlank(req.getTradeType())) {
                throw new NullPointerException("trade_type为空");
            } else if (!Strings.equalsIgnoreCase(req.getTradeType(), "JSAPI")
                    && !Strings.equalsIgnoreCase(req.getTradeType(), "NATIVE")
                    && !Strings.equalsIgnoreCase(req.getTradeType(), "APP")) {
                throw new Exception("JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付，统一下单接口trade_type的传参可参考这里");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_UNIFIEDORDER, Util.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Util.xmlToMap(xml);
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
            } else if (Strings.isBlank(req.getMchId())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getTransactionId()) && Strings.isBlank(req.getOutTradeNo())) {
                throw new Exception("transaction_id与out_trade_no二选一");
            } else if (Strings.isBlank(req.getNonceStr())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSignType(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSignType(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_ORDERQUERY, Util.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Util.xmlToMap(xml);
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
            } else if (Strings.isBlank(req.getMchId())) {
                throw new NullPointerException("mch_id为空");
            } else if (Strings.isBlank(req.getOutTradeNo())) {
                throw new Exception("out_trade_no为空");
            } else if (Strings.isBlank(req.getNonceStr())) {
                throw new NullPointerException("nonce_str为空");
            } else if (Strings.isBlank(req.getSign())) {
                throw new NullPointerException("sign为空");
            } else if (!Strings.equalsIgnoreCase(req.getSignType(), "MD5")
                    && !Strings.equalsIgnoreCase(req.getSignType(), "HMAC-SHA256")) {
                throw new Exception("sign_type默认为MD5，支持HMAC-SHA256和MD5");
            } else {
                String xml = HttpUtil.postXml(Dict.API_GATE + Dict.PAY_CLOSEORDER, Util.mapToXml(Lang.obj2nutmap(req)));
                NutMap map = Util.xmlToMap(xml);
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
}
