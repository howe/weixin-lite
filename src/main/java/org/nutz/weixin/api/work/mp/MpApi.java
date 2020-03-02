package org.nutz.weixin.api.work.mp;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.work.mp.req.*;
import org.nutz.weixin.bean.work.mp.resp.*;
import org.nutz.weixin.bean.mp.Error;
import org.nutz.weixin.util.HttpUtil;
import org.nutz.weixin.util.Util;

/**
 * Created by Jianghao on 2019/9/13
 *
 * @author Freshplay Inc.
 */
public class MpApi {

    /**
     * 获取access_token是调用企业微信API接口的第一步，相当于创建了一个登录凭证，其它的业务API接口，都需要依赖于access_token来鉴权调用者身份。
     * 因此开发者，在使用业务接口前，要明确access_token的颁发来源，使用正确的access_token。
     * <p>
     * 请求方式： GET（HTTPS）
     * 请求地址： https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET
     * 注：此处标注大写的单词ID和SECRET，为需要替换的变量，根据实际获取值更新。其它接口也采用相同的标注，不再说明。
     *
     * @param req
     * @return
     */
    public static GettokenResp gettoken(GettokenReq req) {

        try {
            if (Strings.isBlank(req.getCorpid())) {
                throw new NullPointerException("corpid为空");
            } else if (Strings.isBlank(req.getCorpsecret())) {
                throw new NullPointerException("corpsecret为空");
            } else {
                String json = HttpUtil.get(Dict.QYAPI_GATE + Dict.MP_GETTOKEN + "?corpid=" + req.getCorpid() +
                        "&corpsecret=" + req.getCorpsecret());
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    GettokenResp resp = Lang.map2Object(map, GettokenResp.class);
                    return resp;
                } else {
                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * userid与openid互换
     * 该接口使用场景为企业支付，在使用企业红包和向员工付款时，需要自行将企业微信的userid转成openid。
     * <p>
     * 注：需要成员使用微信登录企业微信或者关注微工作台（原企业号）才能转成openid
     *
     * @param req
     * @return
     */
    public static ConvertToOpenidResp convert_to_openid(ConvertToOpenidReq req) {

        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getUserid())) {
                throw new NullPointerException("userid为空");
            } else {
                String json = HttpUtil.post(Dict.QYAPI_GATE + Dict.MP_USER_CONVERT_TO_OPENID + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    ConvertToOpenidResp resp = Lang.map2Object(map, ConvertToOpenidResp.class);
                    return resp;
                } else {
                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * openid转userid
     * 该接口主要应用于使用企业支付之后的结果查询。
     * 开发者需要知道某个结果事件的openid对应企业微信内成员的信息时，可以通过调用该接口进行转换查询。
     *
     * @param req
     * @return
     */
    public static ConvertToUseridResp convert_to_userid(ConvertToUseridReq req) {

        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getOpenid())) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.post(Dict.QYAPI_GATE + Dict.MP_USER_CONVERT_TO_USERID + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    ConvertToUseridResp resp = Lang.map2Object(map, ConvertToUseridResp.class);
                    return resp;
                } else {
                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取访问用户身份
     * 该接口用于根据code获取成员信息
     *
     * @param req
     * @return
     */
    public static GetuserinfoResp getuserinfo(GetuserinfoReq req) {

        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getCode())) {
                throw new NullPointerException("code为空");
            } else {
                String json = HttpUtil.get(Dict.QYAPI_GATE + Dict.MP_USER_GETUSERINFO + "?" + Util.buildParmas(Lang.obj2map(req)));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    GetuserinfoResp resp = Lang.map2Object(map, GetuserinfoResp.class);
                    return resp;
                } else {
                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 读取成员
     * 在通讯录同步助手中此接口可以读取企业通讯录的所有成员信息，而自建应用可以读取该应用设置的可见范围内的成员信息。
     *
     * @param req
     * @return
     */
    public static GetResp get(GetReq req) {

        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getUserid())) {
                throw new NullPointerException("userid为空");
            } else {
                String json = HttpUtil.get(Dict.QYAPI_GATE + Dict.MP_USER_GET + "?" + Util.buildParmas(Lang.obj2map(req)));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    GetResp resp = Lang.map2Object(map, GetResp.class);
                    return resp;
                } else {
                    throw new Exception(Error.getError(map.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
