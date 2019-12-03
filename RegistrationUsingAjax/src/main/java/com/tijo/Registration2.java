package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		
		String num = request.getParameter("num");
		String value = request.getParameter("value");
		System.out.println(num);
		System.out.println(value);
		if(num.equals("1"))
		{
			if(!value.equals("Tijo"))
			{
				response.getWriter().println("Username is invalid");
			}
		}else
		{
			if(!value.equals("123"))
			{
				response.getWriter().println("Password is invalid");
			}
		}

	}
}
