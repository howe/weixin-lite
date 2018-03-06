package org.nutz.weixin.bean.sns;

import org.nutz.lang.Lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jianghao on 2018/3/5
 *
 * @howechiang
 */
public class Error {

    /**
     * 返回码
     */
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 错误码描述
     */
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 说明
     */
    private String expl;

    public String getExpl() {
        return expl;
    }

    public void setExpl(String expl) {
        this.expl = expl;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", expl='" + expl + '\'' +
                '}';
    }

    public Error(int code, String desc, String expl) {
        this.code = code;
        this.desc = desc;
        this.expl = expl;
    }

    public Error() {
    }

    public static List<Error> list = new ArrayList<>(Arrays.asList(
            new Error(40001, "invalid credential", "不合法的调用凭证"),
            new Error(40002, "invalid grant_type", "不合法的grant_type"),
            new Error(40003, "invalid openid", "不合法的OpenID"),
            new Error(40004, "invalid media type", "不合法的媒体文件类型"),
            new Error(40007, "invalid media_id", "不合法的media_id"),
            new Error(40008, "invalid message type", "不合法的message_type"),
            new Error(40009, "invalid image size", "不合法的图片大小"),
            new Error(40010, "invalid voice size", "不合法的语音大小"),
            new Error(40011, "invalid video size", "不合法的视频大小"),
            new Error(40012, "invalid thumb size", "不合法的缩略图大小"),
            new Error(40013, "invalid appid", "不合法的AppID"),
            new Error(40014, "invalid access_token ", "不合法的access_token"),
            new Error(40015, "invalid menu type ", "不合法的菜单类型"),
            new Error(40016, "invalid button size", "不合法的菜单按钮个数"),
            new Error(40017, "invalid button type", "不合法的按钮类型"),
            new Error(40018, "invalid button name size", "不合法的按钮名称长度"),
            new Error(40019, "invalid button key size", "不合法的按钮KEY长度"),
            new Error(40020, "invalid button url size", "不合法的url长度"),
            new Error(40023, "invalid sub button size", "不合法的子菜单按钮个数"),
            new Error(40024, "invalid sub button type", "不合法的子菜单类型"),
            new Error(40025, "invalid sub button name size", "不合法的子菜单按钮名称长度"),
            new Error(40026, "invalid sub button key size", "不合法的子菜单按钮KEY长度"),
            new Error(40027, "invalid sub button url size", "不合法的子菜单按钮url长度"),
            new Error(40029, "invalid code", "不合法或已过期的code"),
            new Error(40030, "invalid refresh_token", "不合法的refresh_token"),
            new Error(40036, "invalid template_id size ", "不合法的template_id长度"),
            new Error(40037, "invalid template_id", "不合法的template_id"),
            new Error(40039, "invalid url size", "不合法的url长度"),
            new Error(40048, "invalid url domain", "不合法的url域名"),
            new Error(40054, "invalid sub button url domain", "不合法的子菜单按钮url域名"),
            new Error(40055, "invalid button url domain", "不合法的菜单按钮url域名"),
            new Error(40066, "invalid url", "不合法的url"),
            new Error(41001, "access_token missing", "缺失access_token参数"),
            new Error(41002, "appid missing", "缺失appid参数"),
            new Error(41003, "refresh_token missing", "缺失refresh_token参数"),
            new Error(41004, "appsecret missing ", "缺失secret参数"),
            new Error(41005, "media data missing", "缺失二进制媒体文件"),
            new Error(41006, "media_id missing", "缺失media_id参数"),
            new Error(41007, "sub_menu data missing", "缺失子菜单数据"),
            new Error(41008, "missing code", "缺失code参数"),
            new Error(41009, "missing openid", "缺失openid参数"),
            new Error(41010, "missing url", "缺失url参数"),
            new Error(42001, "access_token expired", "access_token超时"),
            new Error(42002, "refresh_token expired", "refresh_token超时"),
            new Error(42003, "code expired", "code超时"),
            new Error(43001, "require GET method", "需要使用GET方法请求"),
            new Error(43002, "require POST method", "需要使用POST方法请求"),
            new Error(43003, "require https", "需要使用HTTPS"),
            new Error(43004, "require subscribe", "需要订阅关系"),
            new Error(44001, "empty media data", "空白的二进制数据"),
            new Error(44002, "empty post data", "空白的POST数据"),
            new Error(44003, "empty news data", "空白的news数据"),
            new Error(44004, "empty content", "空白的内容"),
            new Error(44005, "empty list size", "空白的列表"),
            new Error(45001, "media size out of limit", "二进制文件超过限制"),
            new Error(45002, "content size out of limit", "content参数超过限制"),
            new Error(45003, "title size out of limit", "title参数超过限制"),
            new Error(45004, "description size out of limit", "description参数超过限制"),
            new Error(45005, "url size out of limit", "url参数长度超过限制"),
            new Error(45006, "picurl size out of limit", "picurl参数超过限制"),
            new Error(45007, "playtime out of limit", "播放时间超过限制（语音为60s最大）"),
            new Error(45008, "article size out of limit", "article参数超过限制"),
            new Error(45009, "api freq out of limit", "接口调动频率超过限制"),
            new Error(45010, "create menu limit", "建立菜单被限制"),
            new Error(45011, "api limit", "频率限制"),
            new Error(45012, "template size out of limit", "模板大小超过限制"),
            new Error(45016, "can't modify sys group", "不能修改默认组"),
            new Error(45017, "can't set group name too long sys group", "修改组名过长"),
            new Error(45018, "too many group now, no need to add new", "组数量过多"),
            new Error(50001, "api unauthorized", "接口未授权")
    ));

    public static Error getError(int code) {
        for (Error error : list) {
            if (Lang.equals(code, error.getCode())) {
                return error;
            }
        }
        return new Error(-99, "unknown", "未知");
    }
}
