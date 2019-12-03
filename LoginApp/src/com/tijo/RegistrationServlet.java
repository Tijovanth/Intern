package com.tijo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.awt.datatransfer.DataTransferer.ReencodingInputStream;

public class RegistrationServlet extends HttpServlet{
     DataStore dataobject = new DataStore();
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		 res.setContentType("text/html");
		if(validate(username,password,email))
		{
			 req.getServletContext().setAttribute("dataobject", dataobject);
			 RequestDispatcher rd = req.getRequestDispatcher("HTMLFiles/Login.html");
			 rd.forward(req,res);
		}else
		{
			res.getWriter().println("Username Already in there");
			Enumeration<String> head = req.getHeaderNames();
			String headname;
			 while(head.hasMoreElements())
			 {
				  headname = head.nextElement();
				 res.getWriter().println(headname);
				 res.getWriter().println(req.getHeader(headname));
				 res.getWriter().println();
			 }
			 RequestDispatcher rd = req.getRequestDispatcher("Registration.html");
			 rd.include(req,res);
		}
	}
	boolean validate(String username, String password, String email)
	{
		if(!dataobject.getUsername(username))
		{
			dataobject.set(username, password, email);
			return true;
		}else
		{
			return false;
		}
	}
}

class DataStore
{
	private HashMap<String,String[]> data = new HashMap<>();
	
	public void set(String username, String password, String email)
	{
		data.put(username,new String[] {password,email});
	}
	public boolean getUsername(String username)
	{
		if(data.containsKey(username))
			return true;
		else
			return false;
	}
}