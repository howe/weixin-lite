package org.nutz.weixin.util.pay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Xmls;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.pay.Error;
import org.nutz.weixin.bean.pay.req.UnifiedorderReq;
import org.nutz.weixin.bean.pay.resp.UnifiedorderResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class PayUtil {

    /**
     * 统一下单
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
                String xml = HttpUtil.postXml(Dict.WX_API_GATE + Dict.WX_PAY_UNIFIEDORDER, Xmls.mapToXml(Lang.obj2nutmap(req)));
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
            return null;
        }
    }
}
