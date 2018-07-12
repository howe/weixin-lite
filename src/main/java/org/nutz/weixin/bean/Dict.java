package org.nutz.weixin.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class Dict {

    /**
     * 微信网关地址
     */
    public static String API_GATE = "https://api.weixin.qq.com";

    /**
     * 微信支付网关地址
     */
    public static String API_PAY_GATE = "https://api.mch.weixin.qq.com";

    /**
     * 通过code获取access_token
     */
    public static String SNS_OAUTH2_ACCESS_TOKEN = "/sns/oauth2/access_token";

    /**
     * 刷新或续期access_token使用
     */
    public static String SNS_OAUTH2_REFRESH_TOKEN = "/sns/oauth2/refresh_token";

    /**
     * 登录凭证校验
     */
    public static String SNS_JSCODE2SESSION = "/sns/jscode2session";

    /**
     * 检验授权凭证（access_token）是否有效
     */
    public static String SNS_AUTH = "/sns/auth";

    /**
     * 获取用户个人信息（UnionID机制）
     */
    public static String SNS_USERINFO = "/sns/userinfo";

    /**
     * 获取access_token
     */
    public static String MP_TOKEN = "/cgi-bin/token";

    /**
     * 发送模板消息
     */
    public static String MP_MESSAGE_WXOPEN_TEMPLATE_SEND = "/cgi-bin/message/wxopen/template/send";

    /**
     * 获取小程序模板库标题列表
     */
    public static String MP_WXOPEN_TEMPLATE_LIBRARY_LIST = "/cgi-bin/wxopen/template/library/list";

    /**
     * 获取模板库某个模板标题下关键词库
     */
    public static String MP_WXOPEN_TEMPLATE_LIBRARY_GET = "/cgi-bin/wxopen/template/library/get";

    /**
     * 组合模板并添加至帐号下的个人模板库
     */
    public static String MP_WXOPEN_TEMPLATE_ADD = "/cgi-bin/wxopen/template/add";

    /**
     * 获取帐号下已存在的模板列表
     */
    public static String MP_WXOPEN_TEMPLATE_LIST = "/cgi-bin/wxopen/template/list";

    /**
     * 删除帐号下的某个模板
     */
    public static String MP_WXOPEN_TEMPLATE_DEL = "/cgi-bin/wxopen/template/del";

    /**
     * 获取jsapi_ticket
     */
    public static String MP_TICKET_GETTICKET = "/cgi-bin/ticket/getticket";

    /**
     * 获取微信服务器IP地址
     */
    public static String MP_GETCALLBACKIP = "/cgi-bin/getcallbackip";

    /**
     * 添加客服帐号
     */
    public static String MP_CUSTOMSERVICE_KFACCOUNT_ADD = "/customservice/kfaccount/add";

    /**
     * 修改客服帐号
     */
    public static String MP_CUSTOMSERVICE_KFACCOUNT_UPDATE = "/customservice/kfaccount/update";

    /**
     * 删除客服帐号
     */
    public static String MP_CUSTOMSERVICE_KFACCOUNT_DEL = "/customservice/kfaccount/del";

    /**
     * 统一下单
     */
    public static String PAY_UNIFIEDORDER = "/pay/unifiedorder";

    /**
     * 查询订单
     */
    public static String PAY_ORDERQUERY = "/pay/orderquery";

    /**
     * 关闭订单
     */
    public static String PAY_CLOSEORDER = "/pay/closeorder";

    /**
     * 关闭订单
     */
    public static String PAY_REFUND = "/secapi/pay/refund";

    /**
     * 敏感文本检测接口
     */
    public static String WXA_MSG_SEC_CHECK = "/wxa/msg_sec_check";

    /**
     * 敏感图片检测接口
     */
    public static String WXA_IMG_SEC_CHECK = "/wxa/img_sec_check";

    /**
     * 微信JS接口
     */
    public static final List<String> jsApiList = new ArrayList<>(
            Arrays.asList("onMenuShareTimeline", "onMenuShareAppMessage", "onMenuShareQQ",
                    "onMenuShareWeibo", "onMenuShareQZone", "startRecord", "stopRecord",
                    "onVoiceRecordEnd", "playVoice", "pauseVoice", "stopVoice", "onVoicePlayEnd",
                    "uploadVoice", "downloadVoice", "chooseImage", "previewImage", "uploadImage",
                    "downloadImage", "translateVoice", "getNetworkType", "openLocation", "getLocation",
                    "hideOptionMenu", "showOptionMenu", "hideMenuItems", "showMenuItems", "hideAllNonBaseMenuItem",
                    "showAllNonBaseMenuItem", "closeWindow", "scanQRCode", "chooseWXPay", "openProductSpecificView",
                    "addCard", "chooseCard", "openCard")
    );


    //微信公众号接口

    /**
     * 设置所属行业
     */
    public static String MP_TEMPLATE_API_SET_INDUSTRY = "/cgi-bin/template/api_set_industry";

    /**
     * 获取设置的行业信息
     */
    public static String MP_TEMPLATE_GET_INDUSTRY = "/cgi-bin/template/get_industry";

    /**
     * 获得模板ID
     */
    public static String MP_TEMPLATE_API_ADD_TEMPLATE = "/cgi-bin/template/api_add_template";

    /**
     * 获取模板列表
     */
    public static String MP_TEMPLATE_GET_ALL_PRIVATE_TEMPLATE = "/cgi-bin/template/get_all_private_template";

    /**
     * 删除模板
     */
    public static String MP_TEMPLATE_DEL_PRIVATE_TEMPLATE = "/cgi-bin/template/del_private_template";

    /**
     * 发送模板消息
     */
    public static String MP_MESSAGE_TEMPLATE_SEND = "/cgi-bin/message/template/send";
}
