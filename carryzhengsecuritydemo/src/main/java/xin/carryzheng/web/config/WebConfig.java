package xin.carryzheng.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import xin.carryzheng.web.filter.TimeFilter;
import xin.carryzheng.web.interceptor.TimeInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengxin
 * @date 2018-02-23 11:44:15
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{


//    @Autowired
    private TimeInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(timeInterceptor);
    }

//    @Bean
    public FilterRegistrationBean timeFilter(){

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        TimeFilter timeFilter = new TimeFilter();

        registrationBean.setFilter(timeFilter);

        List<String> urls = new ArrayList<>();

        urls.add("/*");

        registrationBean.setUrlPatterns(urls);

        return registrationBean;
    }

}
