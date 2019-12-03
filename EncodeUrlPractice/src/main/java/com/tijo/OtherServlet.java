package com.tijo;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OtherServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
	     
		 HttpSession session = request.getSession();
		 String uname = (String) session.getAttribute("uname");
		 if(uname == null)
		 {
			 response.sendRedirect("Register?value=true");
		 }else
		 {
			
			 response.getWriter().println("Welcome "+ uname);
			
//			 response.getWriter().println("<form action='Logout'><input type='submit' value='Logout'></form>");
		 }
	 }
}
