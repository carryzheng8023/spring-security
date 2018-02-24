package xin.carryzheng.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zhengxin
 * @date 2018-02-23 12:11:44
 */
//@Aspect
//@Component
public class TimeAspect {

    @Around("execution(* xin.carryzheng.web.controller.UserController.*(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp) throws Throwable{


        System.out.println("time aspect start");

        Object[] args = pjp.getArgs();

        for (Object arg : args){
            System.out.println("arg is : " + arg);
        }

        long start = System.currentTimeMillis();

        Object object = pjp.proceed();

        System.out.println("time aspect耗时: " + (System.currentTimeMillis() - start));

        System.out.println("time aspect end");

        return object;

    }

}
