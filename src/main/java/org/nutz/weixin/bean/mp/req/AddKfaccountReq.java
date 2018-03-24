package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class AddKfaccountReq {

    /**
     * 客服账户
     */
    private String kf_account;

    public String getKf_account() {
        return kf_account;
    }

    public void setKf_account(String kf_account) {
        this.kf_account = kf_account;
    }

    /**
     * 客户昵称
     */
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 客户密码
     */
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 	获取到的凭证
     */
    @JsonField(ignore = true)
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public AddKfaccountReq(String kf_account, String nickname, String password, String access_token) {
        this.kf_account = kf_account;
        this.nickname = nickname;
        this.password = password;
        this.access_token = access_token;
    }

    public AddKfaccountReq() {
    }
}
