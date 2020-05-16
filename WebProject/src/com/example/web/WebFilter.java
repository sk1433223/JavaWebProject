package com.example.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName: WebFilter
 * @Description: Filter实现拦截
 * @Author: 阿康
 * @DateTime: 2020/5/168:56
 */
public class WebFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");

        // 获取web配置的初始化值
        String username = filterConfig.getInitParameter("username");

        System.out.println(username);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter");

        // 注:对拦截器的请求链进行放行
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
