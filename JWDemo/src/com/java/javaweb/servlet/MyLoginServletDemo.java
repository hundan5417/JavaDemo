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
		out.println("<HEAD><TITLE>��servlet����get/post����</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>������doget����</H2>");
		out.println("<H2>�û�������Ϣ����</H2>");
		//request.setCharacterEncoding("GB2312");    ��һ���޸Ĳ������뷽������ǰ�趨�õ������ı��뷽ʽ
		String username = request.getParameter("username"); 
		String usename = new String(username.getBytes("iso8859-1"),"GB2312");
		
		if(null==username || username=="") 
			username="δ����";
		String password = request.getParameter("password"); 
		if(null==password || password=="") 
			password="δ����";
		out.println("<H2>�û����� "+ usename +"</H2>");
		out.println("<H2>���룺 "+ password +"</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();	}

}
