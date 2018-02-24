package xin.carryzheng.validator;

import org.springframework.beans.factory.annotation.Autowired;
import xin.carryzheng.service.HelloService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author zhengxin
 * @date 2018-02-23 10:37:57
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {


    @Autowired
    private HelloService helloService;


    @Override
    public void initialize(MyConstraint myConstraint) {

        System.out.println("my validator init");

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {


        helloService.greeting("tom");

        System.out.println(o);

        return false;
    }
}
