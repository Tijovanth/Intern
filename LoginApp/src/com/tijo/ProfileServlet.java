package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
			response.setContentType("text/html");
			if(username != null)
			{
				response.getWriter().println("<form action='Login' method='POST'><button>Click</button></form>");
		    }
	}
}
