package org.nutz.weixin.bean.pay.req;

import org.nutz.weixin.bean.pay.biz.SceneInfo;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class UnifiedorderReq extends BaseReq {

    /**
     * 设备号
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 商品描述
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 商品详情
     */
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 附加数据
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 商户订单号
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 货币类型
     * <p>
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">货币类型</a>
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 总金额
     * <p>
     * 订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=4_2">支付金额</a>
     */
    private int total_fee;

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 终端IP
     */
    private String spbill_create_ip;

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    /**
     * 交易起始时间
     */
    private String time_start;

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    /**
     * 交易结束时间
     */
    private String time_expire;

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    /**
     * 订单优惠标记
     */
    private String goods_tag;

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    /**
     * 通知地址
     */
    private String notify_url;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 交易类型
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * 指定支付方式
     */
    private String limit_pay;

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    /**
     * 用户标识
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 场景信息
     */
    private SceneInfo scene_info;

    public SceneInfo getScene_info() {
        return scene_info;
    }

    public void setScene_info(SceneInfo scene_info) {
        this.scene_info = scene_info;
    }

    public UnifiedorderReq(String device_info, String body, String detail, String attach, String out_trade_no, String fee_type, int total_fee, String spbill_create_ip, String time_start, String time_expire, String goods_tag, String notify_url, String trade_type, String limit_pay, String openid, SceneInfo scene_info) {
        this.device_info = device_info;
        this.body = body;
        this.detail = detail;
        this.attach = attach;
        this.out_trade_no = out_trade_no;
        this.fee_type = fee_type;
        this.total_fee = total_fee;
        this.spbill_create_ip = spbill_create_ip;
        this.time_start = time_start;
        this.time_expire = time_expire;
        this.goods_tag = goods_tag;
        this.notify_url = notify_url;
        this.trade_type = trade_type;
        this.limit_pay = limit_pay;
        this.openid = openid;
        this.scene_info = scene_info;
    }

    public UnifiedorderReq() {
    }
}
