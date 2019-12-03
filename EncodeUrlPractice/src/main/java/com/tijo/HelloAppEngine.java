package com.tijo;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
	  String value = request.getParameter("value");
	  String uname = request.getParameter("uname");
	  if(value == "true")
	  {
		  getServletContext().setAttribute("NoSession",true);
		  response.sendRedirect("OtherServlet?value=" + URLEncoder.encode(uname,"UTF-8"));
	  }else
	  {
		  getServletContext().setAttribute("NoSession",false);
	  HttpSession session = request.getSession();
	  session.setAttribute("uname",uname);
	  response.sendRedirect("OtherServlet");
	  }
  }
}