package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		
		String username = request.getParameter("uname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Home Page</h2> <br><br>");
		out.println("Welcome "+username+"<br><br>");
		out.println("<form action='second' method='POST'>");
		out.println("<input type='hidden' name='uname' value='"+username+"'>");
		out.println("<input type='submit' value='click'>");
		out.println("</form>");
	}
}
