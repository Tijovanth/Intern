package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloAppEngine extends HttpServlet {

   int i = 10;
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
      
	  response.setContentType("text/html");
	  response.getWriter().println("Hai Iam in cron job service");
      response.getWriter().println(i++);
      response.getWriter().println("<input type'button' value='click'>");
      request.getRequestDispatcher("Test.jsp").include(request,response);
  }
}