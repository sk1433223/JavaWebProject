package com.example.web.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeListennerImpl implements ServletContextAttributeListener {

    /**
     * 在ServletContext范围里,添加属性时刻 触发
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("添加的属性名:"+event.getName()+"::属性值"+event.getValue());

    }

    /**
     * 当从ServletContext对象属性空间移除键值对属性的时刻,被触发
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("移除的属性名:"+event.getName()+"::属性值"+event.getValue());

    }

    /**
     * ServletContext域对象里的值,被替换的时刻 触发
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("替换的属性名:"+event.getName()+"::属性值"+event.getValue());

    }
}
