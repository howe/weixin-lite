package org.nutz.weixin.bean.datacube.biz;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class Visit_uv_new {

    /**
     * 分布类型
     */
    private Integer index;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 省份，如北京、广东等
     */
    private List<Province> province;

    public List<Province> getProvince() {
        return province;
    }

    public void setProvince(List<Province> province) {
        this.province = province;
    }

    /**
     * 城市，如北京、广州等
     */
    private List<City> city;

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    /**
     * 性别，包括男、女、未知
     */
    private List<Gender> genders;

    public List<Gender> getGenders() {
        return genders;
    }

    public void setGenders(List<Gender> genders) {
        this.genders = genders;
    }

    /**
     * 终端类型，包括 iPhone，android，其他
     */
    private List<Platform> platforms;

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    /**
     * 机型，如苹果 iPhone 6，OPPO R9 等
     */
    private List<Device> devices;

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * 年龄，包括17岁以下、18-24岁等区间
     */
    private List<Age> ages;

    public List<Age> getAges() {
        return ages;
    }

    public void setAges(List<Age> ages) {
        this.ages = ages;
    }
}
