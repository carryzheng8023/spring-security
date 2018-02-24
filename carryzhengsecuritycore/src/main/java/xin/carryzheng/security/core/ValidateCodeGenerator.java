package xin.carryzheng.security.core;

import org.springframework.web.context.request.ServletWebRequest;
import xin.carryzheng.security.core.validate.code.ValidateCode;

/**
 * @author zhengxin
 * @date 2018-02-24 12:59:37
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
