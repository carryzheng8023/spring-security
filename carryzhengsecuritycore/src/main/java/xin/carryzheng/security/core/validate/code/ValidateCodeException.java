package xin.carryzheng.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author zhengxin
 * @date 2018-02-24 11:35:23
 */
public class ValidateCodeException extends AuthenticationException {


    public ValidateCodeException(String msg) {
        super(msg);
    }
}
