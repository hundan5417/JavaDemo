package com.java.javaweb.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequestListenerDemo
 *
 */
@WebListener
public class ServletRequestListenerDemo implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletRequestListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
      
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
        System.out.println("**删除request属性，属性名称:" + arg0.getName() + "属性内容:" + arg0.getValue());

    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
        System.out.println("**增加request属性，属性名称:" + arg0.getName() + "属性内容:" + arg0.getValue());
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
        System.out.println("**替换request属性，旧属性名称:" + arg0.getName() + "属性内容:" + arg0.getValue());
        System.out.println(arg0.getServletRequest().getAttribute(arg0.getName()));
    }
	
}
