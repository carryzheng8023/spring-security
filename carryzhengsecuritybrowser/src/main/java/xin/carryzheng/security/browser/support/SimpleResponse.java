package xin.carryzheng.security.browser.support;

/**
 * @author zhengxin
 * @date 2018-02-23 23:30:19
 */
public class SimpleResponse {


    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
