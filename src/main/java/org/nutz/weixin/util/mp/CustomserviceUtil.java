package org.nutz.weixin.util.mp;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Dict;
import org.nutz.weixin.bean.mp.req.AddKfaccountReq;
import org.nutz.weixin.bean.mp.req.DelKfaccountReq;
import org.nutz.weixin.bean.mp.req.UpdateKfaccountReq;
import org.nutz.weixin.util.HttpUtil;

/**
 * 客服帐号管理
 * 开发者在根据开发文档的要求完成开发后，使用6.0.2版及以上版本的微信用户在与公众号进行客服沟通，公众号使用不同的客服账号进行回复后，用户可以看到对应的客服头像和昵称。
 * <p>
 * 请注意，必须先在公众平台官网为公众号设置微信号后才能使用该能力。
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class CustomserviceUtil {


    /**
     * 添加客服帐号
     * 开发者可以通过本接口为公众号添加客服账号，每个公众号最多添加10个客服账号。
     *
     * @param req 参数
     * @return 是否有效
     */
    public static boolean addKfaccount(AddKfaccountReq req) {
        try {
            if (Strings.isBlank(req.getKfAccount())) {
                throw new NullPointerException("kf_account为空");
            } else if ((Strings.isBlank(req.getNickname()))) {
                throw new NullPointerException("nickname为空");
            } else if ((Strings.isBlank(req.getPassword()))) {
                throw new NullPointerException("password为空");
            } else {
                String json = HttpUtil.post(Dict.API_GATE + Dict.MP_CUSTOMSERVICE_KFACCOUNT_ADD + "?access_token=" + req.getAccessToken(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Lang.equals(map.getInt("errcode"), 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 修改客服帐号
     * 开发者可以通过本接口为公众号修改客服账号。
     *
     * @param req 参数
     * @return 是否有效
     */
    public static boolean updateKfaccount(UpdateKfaccountReq req) {
        try {
            if (Strings.isBlank(req.getKfAccount())) {
                throw new NullPointerException("kf_account为空");
            } else if ((Strings.isBlank(req.getNickname()))) {
                throw new NullPointerException("nickname为空");
            } else if ((Strings.isBlank(req.getPassword()))) {
                throw new NullPointerException("password为空");
            } else {
                String json = HttpUtil.post(Dict.API_GATE + Dict.MP_CUSTOMSERVICE_KFACCOUNT_UPDATE + "?access_token=" + req.getAccessToken(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Lang.equals(map.getInt("errcode"), 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 删除客服帐号
     * 开发者可以通过该接口为公众号删除客服帐号。
     *
     * @param req 参数
     * @return 是否有效
     */
    public static boolean delKfaccount(DelKfaccountReq req) {
        try {
            if (Strings.isBlank(req.getKfAccount())) {
                throw new NullPointerException("kf_account为空");
            } else if ((Strings.isBlank(req.getNickname()))) {
                throw new NullPointerException("nickname为空");
            } else if ((Strings.isBlank(req.getPassword()))) {
                throw new NullPointerException("password为空");
            } else {
                String json = HttpUtil.post(Dict.API_GATE + Dict.MP_CUSTOMSERVICE_KFACCOUNT_DEL + "?access_token=" + req.getAccessToken(), Json.toJson(req));
                NutMap map = Json.fromJson(NutMap.class, json);
                if (Lang.equals(map.getInt("errcode"), 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
