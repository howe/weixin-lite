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
    public static String WX_API_GATE = "https://api.weixin.qq.com";

    /**
     * 通过code获取access_token
     */
    public static String WX_SNS_OAUTH2_ACCESS_TOKEN = "/sns/oauth2/access_token";

    /**
     * 刷新或续期access_token使用
     */
    public static String WX_SNS_OAUTH2_REFRESH_TOKEN = "/sns/oauth2/refresh_token";

    /**
     * 检验授权凭证（access_token）是否有效
     */
    public static String WX_SNS_AUTH = "/sns/auth";

    /**
     * 获取用户个人信息（UnionID机制）
     */
    public static String WX_SNS_USERINFO = "/sns/userinfo";
}
