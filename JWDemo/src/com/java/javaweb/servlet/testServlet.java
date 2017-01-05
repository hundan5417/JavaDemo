package com.java.javaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.tomcat.websocket.AsyncChannelWrapper;

/**
 * Servlet implementation class TEST
 */
@WebServlet("/servlet/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
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
           String name = request.getParameter("name");
           String classes = request.getParameter("classes");
           String course = request.getParameter("course");
           String score = request.getParameter("score");
           List<String> ls = new ArrayList<String>();
           String st =  name  + classes  
           + course  + score;
           ls.add(st);
           request.getSession().setAttribute("list", ls);
           System.out.println(ls.get(0));
           System.out.println(request.getSession().getAttribute("list").toString());
       
      
           //response.sendRedirect("/JWDemo/test/index.jsp");
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/test/index.jsp");
           rd.forward(request, response);
           
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
