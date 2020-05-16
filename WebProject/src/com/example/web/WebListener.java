package com.example.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName: WebListener
 * @Description: listener
 * @Author: 阿康
 * @DateTime: 2020/5/1610:57
 */
@javax.servlet.annotation.WebListener
public class WebListener implements ServletContextListener {

    /**
     * web应用启动时调用方法
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Listener Start");
        ServletContext context = servletContextEvent.getServletContext();
        String userName = context.getInitParameter("username");
        System.out.println("The user who started the web is :"+userName);
    }

    /**
     * web应用关闭时调用方法
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Listener Shut");

        ServletContext context = servletContextEvent.getServletContext();
        String userName = context.getInitParameter("username");
        System.out.println("The user who shut down the web is :"+userName);

    }
}
