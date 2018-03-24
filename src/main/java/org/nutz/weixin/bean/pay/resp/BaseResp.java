package org.nutz.weixin.bean.pay.resp;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class BaseResp {

    /**
     * 返回状态码
     * <p>
     * SUCCESS/FAIL
     * <p>
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    private String return_code;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    /**
     * 返回信息
     * <p>
     * 返回信息，如非空，为错误原因
     */
    private String return_msg;

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }
}
