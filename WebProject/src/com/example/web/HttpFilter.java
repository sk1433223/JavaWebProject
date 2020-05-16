package com.example.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName:  HttpFilter
 * @Description: 提供给继承的 HttpFilter
 * @Author: 阿康
 * @DateTime: 2020/5/168:58
 */
public class HttpFilter implements Filter {

    private FilterConfig filterConfig;

    /**
     * Constructs an {@code IOException} with {@code null}
     * as its error detail message.
     */
    public FilterConfig getFilterConfig() {
        return this.filterConfig;
        
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        init();
    }

    /**
     * 这个init方法,提供给子类覆盖的方法
     */
    private void init() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        doFilter((HttpServletRequest)request,(HttpServletResponse)response,chain);
    }

    /**
     * 这个doFilter,是提供给子类覆盖的方法
     */
    protected void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain){

    }

    @Override
    public void destroy() {

    }
}
