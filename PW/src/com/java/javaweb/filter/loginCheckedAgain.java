package com.java.javaweb.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.util.Pool.Unmarshaller;

/**
 * Servlet Filter implementation class loginCheckedAgain
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/servlet/LoginCheck" })
public class loginCheckedAgain implements Filter {

    /**
     * Default constructor. 
     */
    public loginCheckedAgain() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    HttpServletRequest hsr = (HttpServletRequest)request;
	    String name = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		 
	    String nname = new String(name.getBytes("iso8859-1"),"UTF-8");
		
        if(null == nname || nname == "") 
			nname = "unname";
		if(null == pwd || pwd == "") 
			pwd = "unpwd";//让输入为空的时候有个值，便于之后判断
		if (!nname.equals("unname") && !pwd.equals("unpwd")) {//判断为当输入不为空
			System.out.println("判断");
			HttpSession hs = hsr.getSession();
			hs.setAttribute("userid", nname);
		}
		HttpSession hSession = hsr.getSession();
		String uname = (String)hSession.getAttribute("userid");
		if ("".equals(uname) || uname == null ) {
			System.out.println("拦截");
			HttpServletResponse hr = (HttpServletResponse)response;
			hr.sendRedirect("/PW/Login/logfail.jsp");
		} else {
			System.out.println("放行");
			chain.doFilter(request, response);
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
