package org.nutz.weixin.util.wxa;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.weixin.bean.wxa.Error;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.wxa.req.ImgSecCheckReq;
import org.nutz.weixin.bean.wxa.req.MsgSecCheckReq;
import org.nutz.weixin.bean.wxa.resp.ImgSecCheckResp;
import org.nutz.weixin.bean.wxa.resp.MsgSecCheckResp;
import org.nutz.weixin.util.HttpUtil;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class WxaUtil {


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
                if (json.indexOf("ok") >= 0) {
                    MsgSecCheckResp resp = Json.fromJson(MsgSecCheckResp.class, json);
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
                if (json.indexOf("ok") >= 0) {
                    ImgSecCheckResp resp = Json.fromJson(ImgSecCheckResp.class, json);
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
