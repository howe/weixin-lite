package org.nutz.weixin.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class Comm {

    /**
     * 微信网关地址
     */
    public static String API_GATE = "https://api.weixin.qq.com";

    /**
     * 微信支付网关地址
     */
    public static String API_PAY_GATE = "https://api.mch.weixin.qq.com";

    /**
     * 企业微信网关地址
     */
    public static String QYAPI_GATE = "https://qyapi.weixin.qq.com";

    /**
     * 企业微信登录地址
     */
    public static String OPEN_WORK_GATE = "https://open.work.weixin.qq.com";

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
            Arrays.asList("updateAppMessageShareData", "updateTimelineShareData", "onMenuShareWeibo",
                    "onMenuShareQZone", "startRecord", "stopRecord", "onMenuShareTimeline", "onMenuShareAppMessage",
                    "onVoiceRecordEnd", "playVoice", "pauseVoice", "stopVoice", "onVoicePlayEnd", "onMenuShareQQ",
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

    /**
     * 用户支付完成后，获取该用户的 UnionId
     */
    public static String WXA_GET_PAID_UNIONID = "/wxa/getpaidunionid";

    /**
     * 企业微信获取access_token
     */
    public static String MP_GETTOKEN = "/cgi-bin/gettoken";

    /**
     * 构造独立窗口登录二维码
     */
    public static String WWOPEN_SSO_QRCONNECT = "/wwopen/sso/qrConnect";

    /**
     * userid转openid
     */
    public static String MP_USER_CONVERT_TO_OPENID = "/cgi-bin/user/convert_to_openid";

    /**
     * openid转userid
     */
    public static String MP_USER_CONVERT_TO_USERID = "/cgi-bin/user/convert_to_userid";

    /**
     * 获取访问用户身份
     */
    public static String MP_USER_GETUSERINFO = "/cgi-bin/user/getuserinfo";

    /**
     * 读取成员
     */
    public static String MP_USER_GET = "/cgi-bin/user/get";

    //微信小程序接口

    /**
     * 获取用户访问小程序日留存
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDDAILYRETAININFO = "/datacube/getweanalysisappiddailyretaininfo";

    /**
     * 获取用户访问小程序月留存
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDMONTHLYRETAININFO = "/datacube/getweanalysisappidmonthlyretaininfo";

    /**
     * 获取用户访问小程序周留存
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDWEEKLYRETAININFO = "/datacube/getweanalysisappidweeklyretaininfo";

    /**
     * 获取用户访问小程序数据概况
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDDAILYSUMMARYTREND = "/datacube/getweanalysisappiddailysummarytrend";

    /**
     * 获取用户访问小程序数据日趋势
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDDAILYVISITTREND = "/datacube/getweanalysisappiddailyvisittrend";

    /**
     * 获取用户访问小程序数据月趋势
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDMONTHLYVISITTREND = "/datacube/getweanalysisappidmonthlyvisittrend";

    /**
     * 获取用户访问小程序数据周趋势
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDWEEKLYVISITTREND = "/datacube/getweanalysisappidweeklyvisittrend";

    /**
     * 获取小程序新增或活跃用户的画像分布数据
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDUSERPORTRAIT = "/datacube/getweanalysisappiduserportrait";

    /**
     * 获取小程序新增或活跃用户的画像分布数据
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDVISITDISTRIBUTION = "/datacube/getweanalysisappidvisitdistribution";

    /**
     * 访问页面。目前只提供按 page_visit_pv 排序的 top200
     */
    public static String XCX_DATACUBE_GETWEANALYSISAPPIDVISITPAGE = "/datacube/getweanalysisappidvisitpage";

    /**
     * 发送客服消息给用户。详细规则见 <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/customer-message/send.html">发送客服消息</a>
     */
    public static String XCX_MESSAGE_CUSTOM_SEND = "/cgi-bin/message/custom/send";

    /**
     * 下发客服当前输入状态给用户。详见 <a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/customer-message/typing.html">客服消息输入状态</a>
     */
    public static String XCX_MESSAGE_CUSTOM_TYPING = "/cgi-bin/message/custom/typing";
}
