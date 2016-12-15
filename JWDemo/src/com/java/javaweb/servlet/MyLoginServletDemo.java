package com.java.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServletDemo
 */
@WebServlet("/servlet/MyLoginServletDemo")
public class MyLoginServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoginServletDemo() {
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
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用了doget方法</H2>");
		out.println("<H2>用户输入信息如下</H2>");
		//request.setCharacterEncoding("GB2312");    第一种修改参数乱码方法：提前设定得到参数的编译方式
		String username = request.getParameter("username"); 
		String usename = new String(username.getBytes("iso8859-1"),"GB2312");
		
		if(null==username || username=="") 
			username="未输入";
		String password = request.getParameter("password"); 
		if(null==password || password=="") 
			password="未输入";
		out.println("<H2>用户名： "+ usename +"</H2>");
		out.println("<H2>密码： "+ password +"</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();	}

}
