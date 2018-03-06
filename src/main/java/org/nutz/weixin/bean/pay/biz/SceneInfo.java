package org.nutz.weixin.bean.pay.biz;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class SceneInfo {

    @Param("store_info")
    @JsonField("store_info")
    private Store storeInfo;

    public Store getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(Store storeInfo) {
        this.storeInfo = storeInfo;
    }
}
