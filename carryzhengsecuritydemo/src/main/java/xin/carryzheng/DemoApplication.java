package xin.carryzheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhengxin
 * @date 2018-02-19 17:27:28
 */

@SpringBootApplication
@RestController
@EnableSwagger2
public class DemoApplication {


    public static void main(String[] args){

        SpringApplication.run(DemoApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello(){
        return "hello spring security";
    }

}
