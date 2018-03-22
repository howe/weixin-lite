package org.nutz.weixin.bean.mp.req;

import org.nutz.json.JsonField;
import org.nutz.mvc.annotation.Param;

/**
 * Created by Jianghao on 2018/3/6
 *
 * @howechiang
 */
public class AddKfaccountReq {

    /**
     * 客服账户
     */
    @Param("kf_account")
    @JsonField("kf_account")
    private String kfAccount;

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
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
    @Param("access_token")
    @JsonField(value = "access_token", ignore = true)
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AddKfaccountReq(String kfAccount, String nickname, String password, String accessToken) {
        this.kfAccount = kfAccount;
        this.nickname = nickname;
        this.password = password;
        this.accessToken = accessToken;
    }

    public AddKfaccountReq() {
    }
}
