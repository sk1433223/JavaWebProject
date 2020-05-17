package com.example.web.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    /**
     * 销毁时调用
     */
    @Override
    public void requestDestroyed(ServletRequestEvent event) {
        ServletRequest servletRequest = event.getServletRequest();
    }

    /**
     * Web工程启动时调用
     */
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

    }
}
