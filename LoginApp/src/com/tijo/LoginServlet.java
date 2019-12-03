package com.tijo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataStore dataobject = (DataStore) request.getServletContext().getAttribute("dataobject");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		  response.setContentType("text/html");
		if(dataobject.getUsername(username))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			request.getRequestDispatcher("/Profile").forward(request,response);
		}else
		{
		  response.getWriter().println("Invalid Username");
		  RequestDispatcher rd = request.getRequestDispatcher("HTMLFiles/Login.html");
		  rd.include(request,response);
		}
	}
}
