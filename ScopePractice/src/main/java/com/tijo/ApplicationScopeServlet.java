package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ApplicationScopeServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 		      throws IOException, ServletException {
		 response.setContentType("text/html");
		 request.setAttribute("username", "Tijo");
		 HttpSession session = request.getSession();
		 session.setAttribute("username", "Tijo");
		 getServletContext().setAttribute("username", "Tijo");
		 String Requestusername =  request.getParameter("username");
		 String Sessionusername =(String)  request.getSession().getAttribute("username");
		 String Applicationusername =(String) getServletContext().getAttribute("username");
		 String Servletusername = getServletConfig().getInitParameter("username");
		 response.getWriter().println(Requestusername+" "+Sessionusername+" "+Applicationusername+" "+Servletusername+"<br>");
		 request.getRequestDispatcher("/Other").include(request, response);
	 }
}
