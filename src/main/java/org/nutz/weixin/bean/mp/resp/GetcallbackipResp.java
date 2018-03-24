package org.nutz.weixin.bean.mp.resp;

import java.util.List;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class GetcallbackipResp {

    /**
     * 微信服务器IP地址列表
     */
    private List<String> ip_list;

    public List<String> getIp_list() {
        return ip_list;
    }

    public void setIp_list(List<String> ip_list) {
        this.ip_list = ip_list;
    }
}
