package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OtherServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		  HttpSession session = request.getSession();
		  response.setContentType("text/html");
		  if(session == null)
		  {
			  response.getWriter().println("Session Disable");
		  }else {
		  String uname = (String) session.getAttribute("uname");
		  response.getWriter().println("Welcome "+ uname + "<br>");
		  response.getWriter().println("Session Id"+ session.getId()+ "<br>");
		  response.getWriter().println("Session Creation Time"+ session.getCreationTime()+ "<br>");
		  response.getWriter().println("Last Accessed Time"+ session.getLastAccessedTime()+ "<br>");
		  }
	 }
}
