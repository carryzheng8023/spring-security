package xin.carryzheng.security.core.properties;

/**
 * @author zhengxin
 * @date 2018-02-24 12:22:38
 */
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();
    private SmsCodeProperties sms = new SmsCodeProperties();

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }

    public SmsCodeProperties getSms() {
        return sms;
    }

    public void setSms(SmsCodeProperties sms) {
        this.sms = sms;
    }
}
