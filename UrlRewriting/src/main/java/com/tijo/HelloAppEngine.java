package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloAppEngine extends HttpServlet {
	DataStore dataobj = new DataStore();
	public void init()
	{
	getServletContext().setAttribute("dataobj", dataobj);
	}
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
	 String  username =  request.getParameter("uname");
	 String password = request.getParameter("pwd");
	 response.setContentType("text/html");
	 if(!dataobj.check(username))
	 {
		 dataobj.set(username, password);
		 request.getRequestDispatcher("Login.html").forward(request,response);
	 }else
	 {
		 response.getWriter().println("Username is already defined");
		 request.getRequestDispatcher("index.html").include(request,response);
	 } 
  }
}