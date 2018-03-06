package org.nutz.weixin.bean.mp.resp;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

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
    @Param("ip_list")
    @JsonField("ip_list")
    private List<String> ipList;

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
}
