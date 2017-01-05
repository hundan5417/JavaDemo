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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			/* HttpSession session = request.getSession();
			session.setAttribute("id", name);*/
		
		ServletContext context = getServletContext();// ʵ����ServletContext�ӿ�
		RequestDispatcher rd = context.getRequestDispatcher("/Login/welcome.jsp");// ����ʵ�����Ľӿڵķ����õ���ת��ַ
		rd.forward(request, response);
		 /*else {
			ServletContext context = getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/Login/andy.jsp");
			// RequestDispatcher rd =
			// context.getRequestDispatcher("/index.html");
			rd.forward(request, response);
			// response.sendRedirect("/PW/index.html");

		}
*/
	}
}