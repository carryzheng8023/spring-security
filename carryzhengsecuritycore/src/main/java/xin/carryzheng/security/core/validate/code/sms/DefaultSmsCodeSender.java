package xin.carryzheng.security.core.validate.code.sms;

/**
 * @author zhengxin
 * @date 2018-02-24 14:25:46
 */
public class DefaultSmsCodeSender implements SmsCodeSender {


    @Override
    public void send(String mobile, String code) {
            System.out.println("向手机：" + mobile + "，发送验证码：" + code);
    }
}
