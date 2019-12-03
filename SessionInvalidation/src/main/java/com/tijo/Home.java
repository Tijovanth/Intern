package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Home extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		 
		 HttpSession session = request.getSession();
		 if(session.getAttribute("username") == null)
		 {
			 response.sendRedirect("index.jsp");
		 }else
		 {
		 String username = (String) session.getAttribute("username");
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("Welcome "+username + "<br><br>");
		 out.println("<form action='Logout'><input type='submit' value='Logout'></form>");
		 }
	 }
}
