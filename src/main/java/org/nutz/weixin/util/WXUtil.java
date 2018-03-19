package org.nutz.weixin.util;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;
import org.nutz.lang.random.R;
import org.nutz.weixin.bean.pay.biz.TransferPayment;

/**
 * Created by Jianghao on 2018/3/19
 *
 * @howechiang
 */
public class WXUtil {

    /**
     * 小程序调起支付API
     *
     * @param appid    小程序ID
     * @param prepayId 统一下单返回
     * @param key      加密钥
     * @param signType 签名方式
     * @return
     */
    public static TransferPayment transferPayment(String appid, String prepayId, String key, String signType) {

        try {
            if (Strings.isBlank(appid)) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(prepayId)) {
                throw new NullPointerException("prepayId为空");
            } else if (Strings.isBlank(key)) {
                throw new NullPointerException("key为空");
            } else {
                TransferPayment tp = new TransferPayment();
                tp.setAppId(appid);
                tp.setNonceStr(R.UU32());
                tp.set$package("prepay_id=" + prepayId);
                tp.setSignType(signType);
                tp.setTimeStamp(Times.getTS());
                tp.setPaySign(Util.getSign(Lang.obj2nutmap(tp), key, signType, "paySign").toUpperCase());
                return tp;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
