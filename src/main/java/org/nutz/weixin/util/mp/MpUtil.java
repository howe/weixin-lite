package org.nutz.weixin.util.mp;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.mp.Error;
import org.nutz.weixin.bean.mp.req.GetcallbackipReq;
import org.nutz.weixin.bean.mp.req.GetticketReq;
import org.nutz.weixin.bean.mp.req.TokenReq;
import org.nutz.weixin.bean.mp.resp.GetcallbackipResp;
import org.nutz.weixin.bean.mp.resp.GetticketResp;
import org.nutz.weixin.bean.mp.resp.TokenResp;
import org.nutz.weixin.util.HttpUtil;

import java.util.List;

/**
 * 微信公众平台功能
 * Created on 2018/3/5
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class MpUtil {

    /**
     * 获取access_token
     * <p>
     * access_token是公众号的全局唯一接口调用凭据，公众号调用各接口时都需使用access_token。开发者需要进行妥善保存。
     * access_token的存储至少要保留512个字符空间。access_token的有效期目前为2个小时，需定时刷新，重复获取将导致上次获取的access_token失效。
     * <p>
     * 公众平台的API调用所需的access_token的使用及生成方式说明：
     * <p>
     * 1、建议公众号开发者使用中控服务器统一获取和刷新Access_token，其他业务逻辑服务器所使用的access_token均来自于该中控服务器，
     * 不应该各自去刷新，否则容易造成冲突，导致access_token覆盖而影响业务；
     * <p>
     * 2、目前Access_token的有效期通过返回的expire_in来传达，目前是7200秒之内的值。中控服务器需要根据这个有效时间提前去刷新新access_token。
     * 在刷新过程中，中控服务器可对外继续输出的老access_token，此时公众平台后台会保证在5分钟内，新老access_token都可用，这保证了第三方业务的平滑过渡；
     * <p>
     * 3、Access_token的有效时间可能会在未来有调整，所以中控服务器不仅需要内部定时主动刷新，还需要提供被动刷新access_token的接口，
     * 这样便于业务服务器在API调用获知access_token已超时的情况下，可以触发access_token的刷新流程。
     * <p>
     * 公众号可以使用AppID和AppSecret调用本接口来获取access_token。AppID和AppSecret可在“微信公众平台-开发-基本配置”页中获得（需要已经成为开发者，且帐号没有异常状态）。
     * 调用接口时，请登录“微信公众平台-开发-基本配置”提前将服务器IP地址添加到IP白名单中，点击查看设置方法，否则将无法调用成功。
     *
     * @param req 参数
     * @return 结果
     */
    public static TokenResp token(TokenReq req) {

        try {
            if (Strings.isBlank(req.getAppid())) {
                throw new NullPointerException("appid为空");
            } else if (Strings.isBlank(req.getSecret())) {
                throw new NullPointerException("secret为空");
            } else if (!Strings.equalsIgnoreCase(req.getGrantType(), "client_credential")) {
                throw new Exception("grant_type填client_credential");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.MP_TOKEN + "?appid=" + req.getAppid() +
                        "&secret=" + req.getSecret() + "&grant_type=" + req.getGrantType());
                if (json.indexOf("access_token") >= 0) {
                    TokenResp resp = Json.fromJson(TokenResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取微信服务器IP地址
     * <p>
     * 如果公众号基于安全等考虑，需要获知微信服务器的IP地址列表，以便进行相关限制，可以通过该接口获得微信服务器IP地址列表或者IP网段信息。
     *
     * @param req 参数
     * @return 结果
     */
    public static GetcallbackipResp getcallbackip(GetcallbackipReq req) {
        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("access_token为空");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.MP_GETCALLBACKIP + "?access_token=" + req.getAccessToken());
                if (json.indexOf("ip_list") >= 0) {
                    GetcallbackipResp resp = Json.fromJson(GetcallbackipResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取jsapi_ticket
     * <p>
     * 生成签名之前必须先了解一下jsapi_ticket，jsapi_ticket是公众号用于调用微信JS接口的临时票据。
     * 正常情况下，jsapi_ticket的有效期为7200秒，通过access_token来获取。
     * 由于获取jsapi_ticket的api调用次数非常有限，频繁刷新jsapi_ticket会导致api调用受限，影响自身业务，开发者必须在自己的服务全局缓存jsapi_ticket 。
     *
     * @param req 参数
     * @return 结果
     */
    public static GetticketResp getticket(GetticketReq req) {
        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("access_token为空");
            } else {

                String json = HttpUtil.get(Dict.API_GATE + Dict.MP_TICKET_GETTICKET + "?access_token=" + req.getAccessToken() + "&type=" + req.getType());
                if (json.indexOf("ticket") >= 0) {
                    GetticketResp resp = Json.fromJson(GetticketResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
