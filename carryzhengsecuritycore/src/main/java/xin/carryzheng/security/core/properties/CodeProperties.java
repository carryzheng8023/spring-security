package xin.carryzheng.security.core.properties;

/**
 * @author zhengxin
 * @date 2018-02-24 14:40:03
 */
public class CodeProperties {

    private int length = 4;
    private int expireIn = 60;
    private String url = "";

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
