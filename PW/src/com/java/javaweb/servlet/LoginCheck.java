package com.java.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/servlet/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName"); 
		String pwd = request.getParameter("passWord"); 
		if ("andy".equals(name)&&"123456".equals(pwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("id", name);
			ServletContext context =getServletContext();//实例化ServletContext接口
		    RequestDispatcher rd = context.getRequestDispatcher("/Login/welcome.jsp");//调用实例化的接口的方法得到跳转地址
		    rd.forward(request, response);
		    
      	    
 		}else {
 			ServletContext context =getServletContext();

		    RequestDispatcher rd = context.getRequestDispatcher("/Login/login.jsp");
		    rd.forward(request, response);
 			

		}
		

}
}