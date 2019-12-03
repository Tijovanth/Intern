package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		 Cookie cookie[] = request.getCookies();
		 response.setContentType("text/html");
		 if(cookie == null)
		 {
			 response.getWriter().println("No Cookie");
		 }else
		 {
			 for(int i = 0;i < cookie.length; i++)
			 {
		     response.getWriter().println("Welcome :"+cookie[i].getValue());
		     cookie[i].setMaxAge(0);
			 }
		 }
	 }
}
