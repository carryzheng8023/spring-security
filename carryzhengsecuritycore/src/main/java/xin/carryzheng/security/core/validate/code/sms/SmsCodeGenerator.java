package xin.carryzheng.security.core.validate.code.sms;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;
import xin.carryzheng.security.core.validate.code.ValidateCodeGenerator;
import xin.carryzheng.security.core.properties.SecurityProperties;

/**
 * @author zhengxin
 * @date 2018-02-24 13:00:35
 */
@Component("smsCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public SmsCode generate(ServletWebRequest request) {

        String code = RandomStringUtils.randomNumeric(securityProperties.getCode().getSms().getLength());

        int expireIn = securityProperties.getCode().getSms().getExpireIn();

        return new SmsCode(code, expireIn);
    }


    public SecurityProperties getSecurityProperties() {
        return securityProperties;
    }

    public void setSecurityProperties(SecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }
}
