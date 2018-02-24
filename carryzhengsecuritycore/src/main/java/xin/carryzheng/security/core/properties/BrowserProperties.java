package xin.carryzheng.security.core.properties;

/**
 * @author zhengxin
 * @date 2018-02-23 23:39:06
 */

public class BrowserProperties {

    private String loginPage = "/carryzheng-signIn.html";
    private LoginType loginType = LoginType.JSON;
    private int rememberMeSeconds = 3600;



    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }
}
