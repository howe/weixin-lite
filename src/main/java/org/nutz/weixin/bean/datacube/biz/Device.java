package org.nutz.weixin.bean.datacube.biz;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class Device {

    /**
     * 属性值id
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 属性值名称，与id对应。如属性为 devices 时，返回的属性值名称包括「OPPO R9」等。
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 该场景访问uv
     */
    private Long access_source_visit_uv;

    public Long getAccess_source_visit_uv() {
        return access_source_visit_uv;
    }

    public void setAccess_source_visit_uv(Long access_source_visit_uv) {
        this.access_source_visit_uv = access_source_visit_uv;
    }
}
