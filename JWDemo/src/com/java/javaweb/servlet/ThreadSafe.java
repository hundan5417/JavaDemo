package com.java.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/servlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*String name = "";*/

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThreadSafe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected  void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*		protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
*/		
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>线程安全问题</title></head>");
		out.println("<body>");
		String username = request.getParameter("usname");
		String name = new String(username.getBytes("iso8859-1"), "GB2312");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<h3>" + name + "</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
