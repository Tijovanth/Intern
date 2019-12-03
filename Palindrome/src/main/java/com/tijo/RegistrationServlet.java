package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	DataStore dataobj = new DataStore();
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		PrintWriter out = res.getWriter();
		if(dataobj.data.containsKey(username))
		{
			out.println("Username Already Exists");
		}else
		{
			dataobj.data.put(username, password);
			getServletContext().setAttribute("dataobj", dataobj);
			req.getRequestDispatcher("Login.html").forward(req, res);
		}
	}
}

class DataStore
{
	public HashMap<String,String> data =new HashMap<>();
}
