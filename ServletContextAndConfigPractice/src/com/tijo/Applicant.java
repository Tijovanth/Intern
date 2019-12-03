package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Applicant extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String Website = req.getServletContext().getInitParameter("WebSiteName");
		String email = getServletConfig().getInitParameter("Email");
		res.getWriter().println("<html><body><center><h1>" + Website 
                + "</h1></center><br><p>Contact us:"
                + email+"</p></body></html>");
	}
}
