package org.nutz.weixin.bean.pay.biz;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class Store {

    /**
     * 门店唯一标识
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 门店名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 门店所在地行政区划码，详细见<a href="https://pay.weixin.qq.com/wiki/doc/api/download/store_adress.csv">《最新县及县以上行政区划代码》</a>
     */
    private String area_code;

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    /**
     * 门店详细地址
     */
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
