package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
     
	  String uname = request.getParameter("uname");
	  HttpSession session = request.getSession();
	  session.setAttribute("uname",uname);
	  //session.setAttribute("uname", "Ajay");
	  request.getRequestDispatcher("/SecondServlet").forward(request, response);
  }
}