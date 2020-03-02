package org.nutz.weixin.api.datacube;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.weixin.bean.Comm;
import org.nutz.weixin.bean.datacube.req.*;
import org.nutz.weixin.bean.datacube.resp.*;
import org.nutz.weixin.bean.datacube.Error;
import org.nutz.weixin.util.HttpUtil;

/**
 * 小程序数据分析
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class DatacubeApi {

    /**
     * 获取用户访问小程序日留存
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappiddailyretaininfoResp getweanalysisappiddailyretaininfo(GetweanalysisappiddailyretaininfoReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDDAILYRETAININFO + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappiddailyretaininfoResp resp = Json.fromJson(GetweanalysisappiddailyretaininfoResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序月留存
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidmonthlyretaininfoResp getweanalysisappidmonthlyretaininfo(GetweanalysisappidmonthlyretaininfoReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDMONTHLYRETAININFO + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappidmonthlyretaininfoResp resp = Json.fromJson(GetweanalysisappidmonthlyretaininfoResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序周留存
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidweeklyretaininfoResp getweanalysisappidweeklyretaininfo(GetweanalysisappidweeklyretaininfoReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDWEEKLYRETAININFO + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappidweeklyretaininfoResp resp = Json.fromJson(GetweanalysisappidweeklyretaininfoResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序数据概况
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappiddailysummarytrendResp getweanalysisappiddailysummarytrend(GetweanalysisappiddailysummarytrendReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDDAILYSUMMARYTREND + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("list") >= 0) {
                    GetweanalysisappiddailysummarytrendResp resp = Json.fromJson(GetweanalysisappiddailysummarytrendResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序数据日趋势
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappiddailyvisittrendResp getweanalysisappiddailyvisittrend(GetweanalysisappiddailyvisittrendReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDDAILYVISITTREND + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("list") >= 0) {
                    GetweanalysisappiddailyvisittrendResp resp = Json.fromJson(GetweanalysisappiddailyvisittrendResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序数据月趋势
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidmonthlyvisittrendResp getweanalysisappidmonthlyvisittrend(GetweanalysisappidmonthlyvisittrendReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDMONTHLYVISITTREND + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("list") >= 0) {
                    GetweanalysisappidmonthlyvisittrendResp resp = Json.fromJson(GetweanalysisappidmonthlyvisittrendResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户访问小程序数据周趋势
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidweeklyvisittrendResp getweanalysisappidweeklyvisittrend(GetweanalysisappidweeklyvisittrendReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDWEEKLYVISITTREND + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("list") >= 0) {
                    GetweanalysisappidweeklyvisittrendResp resp = Json.fromJson(GetweanalysisappidweeklyvisittrendResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取小程序新增或活跃用户的画像分布数据
     * <br />
     * 时间范围支持昨天、最近7天、最近30天。其中，新增用户数为时间范围内首次访问小程序的去重用户数，活跃用户数为时间范围内访问过小程序的去重用户数。
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappiduserportraitResp getweanalysisappiduserportrait(GetweanalysisappiduserportraitReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDUSERPORTRAIT + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappiduserportraitResp resp = Json.fromJson(GetweanalysisappiduserportraitResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 获取用户小程序访问分布数据
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidvisitdistributionResp getweanalysisappidvisitdistribution(GetweanalysisappidvisitdistributionReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDVISITDISTRIBUTION + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappidvisitdistributionResp resp = Json.fromJson(GetweanalysisappidvisitdistributionResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 访问页面
     * <br />
     * 目前只提供按 page_visit_pv 排序的 top200。
     *
     * @param req 参数
     * @return 结果
     */
    public static GetweanalysisappidvisitpageResp getweanalysisappidvisitpage(GetweanalysisappidvisitpageReq req) {
        try {
            if (Strings.isBlank(req.getAccess_token())) {
                throw new NullPointerException("access_token为空");
            } else if (Strings.isBlank(req.getBegin_date())) {
                throw new NullPointerException("开始日期为空");
            } else if (Strings.isBlank(req.getEnd_date())) {
                throw new NullPointerException("结束日期为空");
            } else {
                String json = HttpUtil.post(Comm.API_GATE + Comm.XCX_DATACUBE_GETWEANALYSISAPPIDVISITPAGE + "?access_token=" + req.getAccess_token(), Json.toJson(req));
                if (json.indexOf("ref_date") >= 0) {
                    GetweanalysisappidvisitpageResp resp = Json.fromJson(GetweanalysisappidvisitpageResp.class, json);
                    return resp;
                } else {
                    NutMap resp = Json.fromJson(NutMap.class, json);
                    throw new Exception(Error.getError(resp.getInt("errcode")).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}