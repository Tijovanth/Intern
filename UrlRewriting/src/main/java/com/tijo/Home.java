package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		
		String username = request.getParameter("uname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Welcome "+username+"<br><br>");
		out.println("<a href='second?uname="+username+"'>Second Page</a>");
	}
}
