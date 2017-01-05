package com.java.javaweb.listener;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineUser
 *
 */
@WebListener
public class OnlineUser implements HttpSessionListener, ServletContextListener, HttpSessionAttributeListener {

    private ServletContext app = null;
    
    public OnlineUser() {
        // TODO Auto-generated constructor stub
    }
    public void contextInitialized(ServletContextEvent arg0)  { 
        this.app = arg0.getServletContext();
        this.app.setAttribute("online", new TreeSet());
   }
    public void attributeAdded(HttpSessionBindingEvent event)  { 
        Set all = (Set)this.app.getAttribute("online");
        all.add(event.getValue());
        this.app.setAttribute("online", all);
    }
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
        Set all = (Set)this.app.getAttribute("online");
        all.remove(event.getValue());
        this.app.setAttribute("online", all);


    }


	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	  Set all = (Set)this.app.getAttribute("online");
          all.remove(event.getSession().getAttribute("userid"));
          this.app.setAttribute("online", all);

    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    
	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
   

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
	
}
