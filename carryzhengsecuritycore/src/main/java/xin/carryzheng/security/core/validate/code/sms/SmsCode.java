package xin.carryzheng.security.core.validate.code.sms;

import xin.carryzheng.security.core.validate.code.ValidateCode;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @author zhengxin
 * @date 2018-02-24 10:59:33
 */
public class SmsCode extends ValidateCode {


    public SmsCode(String code, int expireIn){
        super(code, expireIn);
    }

    public SmsCode(BufferedImage image, String code, LocalDateTime expireTime){
        super(code, expireTime);
    }


}
