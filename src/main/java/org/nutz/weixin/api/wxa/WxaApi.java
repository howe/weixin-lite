package org.nutz.weixin.api.wxa;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.weixin.bean.wxa.Error;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.wxa.req.GetpaidunionidReq;
import org.nutz.weixin.bean.wxa.req.ImgSecCheckReq;
import org.nutz.weixin.bean.wxa.req.MsgSecCheckReq;
import org.nutz.weixin.bean.wxa.resp.GetpaidunionidResp;
import org.nutz.weixin.bean.wxa.resp.ImgSecCheckResp;
import org.nutz.weixin.bean.wxa.resp.MsgSecCheckResp;
import org.nutz.weixin.util.HttpUtil;
import org.nutz.weixin.util.Util;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class WxaApi {


    /**
     * 敏感文本检测接口
     * <p>
     * 这是接口基于HTTPS协议。开发者服务器可以调用此接口校验一段文本是否含有敏感信息。
     * <p>应用场景举例
     * 用户个人资料违规文字检测；媒体新闻类用户发表文章，评论内容检测；游戏类用户编辑上传的素材(如答题类小游戏用户上传的问题及答案)检测等。
     * <p>频率限制
     * 单个appid调用上限为2000次/分钟，1,000,000次/天
     *
     * @param req 参数
     * @return 结果
     */
    public static MsgSecCheckResp msgSecCheck(MsgSecCheckReq req) {
        try {
            if (Strings.isBlank(req.getContent())) {
                throw new NullPointerException("content为空");
            } else {
                String json = HttpUtil.post(Dict.API_GATE + Dict.WXA_MSG_SEC_CHECK + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    MsgSecCheckResp resp = Lang.map2Object(map, MsgSecCheckResp.class);
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
     * 敏感图片检测接口
     * <p>
     * 这是接口基于HTTPS协议。开发者服务器可以调用此接口校验一张图片是否含有敏感信息。
     * <p>应用场景举例
     * 1）图片智能鉴黄：涉及拍照的工具类应用(如美拍，识图类应用)用户拍照上传检测；电商类商品上架图片检测；媒体类用户文章里的图片检测等。
     * <p>
     * 2）敏感人脸识别：用户头像；媒体类用户文章里的图片检测；社交类用户上传的图片检测等。
     * <p>频率限制
     * 单个appid调用上限为2000次/分钟，1,000,000次/天
     *
     * @param req 参数
     * @return 结果
     */
    public static ImgSecCheckResp imgSecCheck(ImgSecCheckReq req) {
        try {
            if (Lang.isEmpty(req.getMedia())) {
                throw new NullPointerException("media为空");
            } else {
                String json = HttpUtil.upload(Dict.API_GATE + Dict.WXA_IMG_SEC_CHECK + "?access_token=" + req.getAccess_token(), req.getMedia().getName(), req.getMedia());
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    ImgSecCheckResp resp = Lang.map2Object(map, ImgSecCheckResp.class);
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
     * 用户支付完成后，获取该用户的 UnionId，无需用户授权。本接口支持第三方平台代理查询。
     * <p>
     * 注意：调用前需要用户完成支付，且在支付后的五分钟内有效。
     *
     * @param req 参数
     * @return 结果
     */
    public static GetpaidunionidResp getpaidunionid(GetpaidunionidReq req) {
        try {
            if (Strings.isBlank(req.getOpenid())) {
                throw new NullPointerException("openid为空");
            } else {
                String json = HttpUtil.get(Dict.API_GATE + Dict.WXA_GET_PAID_UNIONID + "?access_token=" + req.getAccess_token() + "&" + Util.buildParmas(Lang.obj2map(req)));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Strings.equalsIgnoreCase(map.getString("errcode"), "0")) {
                    GetpaidunionidResp resp = Lang.map2Object(map, GetpaidunionidResp.class);
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
