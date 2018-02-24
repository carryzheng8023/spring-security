package xin.carryzheng.code;

import org.springframework.web.context.request.ServletWebRequest;
import xin.carryzheng.security.core.ValidateCodeGenerator;
import xin.carryzheng.security.core.validate.code.image.ImageCode;

/**
 * @author zhengxin
 * @date 2018-02-24 13:14:13
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {


    @Override
    public ImageCode generate(ServletWebRequest request) {

        System.out.println("更高级的图形验证码");

        return null;
    }
}
