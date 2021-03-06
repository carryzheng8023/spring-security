package xin.carryzheng.security.core.validate.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;
import xin.carryzheng.security.core.validate.code.image.ImageCode;
import xin.carryzheng.security.core.validate.code.sms.SmsCode;
import xin.carryzheng.security.core.validate.code.sms.SmsCodeSender;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhengxin
 * @date 2018-02-24 11:03:00
 */

@RestController
public class ValidateCodeController  {


    public static final String IMAGE_SESSION_KEY = "SESSION_KEY_IMAGE_CODE";
    public static final String SMS_SESSION_KEY = "SESSION_KEY_SMS_CODE";

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Autowired
    private ValidateCodeGenerator imageCodeGenerator;

    @Autowired
    private ValidateCodeGenerator smsCodeGenerator;

    @Autowired
    private SmsCodeSender smsCodeSender;



    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException{

        ImageCode imageCode = (ImageCode) imageCodeGenerator.generate(new ServletWebRequest(request));

        sessionStrategy.setAttribute(new ServletWebRequest(request), IMAGE_SESSION_KEY, imageCode);

        ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());


    }

    @GetMapping("/code/sms")
    public void createSmsCode(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletRequestBindingException {

        SmsCode smsCode = (SmsCode)smsCodeGenerator.generate(new ServletWebRequest(request));

        sessionStrategy.setAttribute(new ServletWebRequest(request), SMS_SESSION_KEY, smsCode);

        String mobile = ServletRequestUtils.getRequiredStringParameter(request, "mobile");

        smsCodeSender.send(mobile,smsCode.getCode());

    }




}
