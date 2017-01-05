package com.java.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;

/**
 * Application Lifecycle Listener implementation class LoginUser
 *
 */
//@WebListener
public class LoginUser implements HttpSessionBindingListener, HttpSessionIdListener {
    private String name;
	public String getName(){
		return name;
	}
    
    public LoginUser(String name) {
       this.setName(name);
    }

	public void setName(String name) {
		this.name = name;
		
	}

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
       System.out.println("**在session中保存的loginuser name是:" + this.getName() + "session id 是 :" +paramHttpSessionBindingEvent.getSession().getId());
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent paramHttpSessionEvent, String paramString)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
    }
	
}
