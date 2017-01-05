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
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

/**
 * Servlet Filter implementation class PassWord
 */
@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST,
				DispatcherType.ERROR,
				DispatcherType.FORWARD,
				DispatcherType.INCLUDE,
			}
		
		,urlPatterns={"/servlet/MyLoginServletDemo"})
public class PassWordFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PassWordFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("P密码销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("P密码运行");
		String password = request.getParameter("password");
		if (password != null && !"".equals(password)) {
			chain.doFilter(request, response);
		
		} else {
			HttpServletResponse hr = (HttpServletResponse)response;
			hr.sendRedirect("/JWDemo/Filter/PassWordLose.html");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("P密码初始化");
	}

}
