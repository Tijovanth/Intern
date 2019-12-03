package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
 
	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		 String option = request.getParameter("choose");
		 if(option.equals("Amazon"))
		 {
			 response.sendRedirect("https://www.amazon.com");
		 }else
		 {
			 request.getRequestDispatcher("HtmlFiles/Electronic.html").forward(request, response);
		 }
	 }
}