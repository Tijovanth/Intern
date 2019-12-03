package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.getWriter().println("<html><body><h1>Hai Tijo</h1></body></html>");
	}
}
