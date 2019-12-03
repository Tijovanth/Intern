package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		PrintWriter out = res.getWriter();
		DataStore dataobj = (DataStore)getServletContext().getAttribute("dataobj");
		if(dataobj.data.containsKey(username) && dataobj.data.containsValue(password))
		{
			req.getRequestDispatcher("Palindrome.html").forward(req, res);
		}else
		{
			out.println("Sorry...");
		}
	}
}
