package xin.carryzheng.security.core.validate.code.sms;

/**
 * @author zhengxin
 * @date 2018-02-24 14:25:02
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
