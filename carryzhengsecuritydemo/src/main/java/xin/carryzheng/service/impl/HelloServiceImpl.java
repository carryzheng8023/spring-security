package xin.carryzheng.service.impl;

import org.springframework.stereotype.Service;
import xin.carryzheng.service.HelloService;

/**
 * @author zhengxin
 * @date 2018-02-23 10:41:27
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String greeting(String name) {

        System.out.println("greeting");

        return "hello " + name;
    }
}
