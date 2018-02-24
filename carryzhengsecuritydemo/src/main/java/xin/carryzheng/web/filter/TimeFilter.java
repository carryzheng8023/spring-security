package xin.carryzheng.web.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhengxin
 * @date 2018-02-23 11:36:34
 */

//@Component
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("my time filter init");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("my time filter start");

        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("my time filter耗时: " + (System.currentTimeMillis() - start));
        System.out.println("my time filter finish");
    }

    @Override
    public void destroy() {

        System.out.println("my time filter destroy");
    }
}
