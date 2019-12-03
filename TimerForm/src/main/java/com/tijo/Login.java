package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
			 String  username =  request.getParameter("uname");
			 String password = request.getParameter("pwd");
			 HttpSession session = request.getSession();
			 System.out.println(session.getAttribute("username"));
			 DataStore dataobj = (DataStore) getServletContext().getAttribute("dataobj");
			 if(dataobj.Logincheck(username, password))
			 {
				 session.setAttribute("username", username);
				 response.sendRedirect("Home");
			 }else
			 {
				 response.setContentType("text/html");
				 response.getWriter().println("Username or password is invalid");
				 request.getRequestDispatcher("/index.jsp").include(request, response);
			 } 
	  }
}
