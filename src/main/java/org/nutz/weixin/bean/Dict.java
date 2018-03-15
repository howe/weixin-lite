package org.nutz.weixin.bean;

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
}
