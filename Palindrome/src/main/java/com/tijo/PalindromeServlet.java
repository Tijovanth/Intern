package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PalindromeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String pali = req.getParameter("pali");
		int num = Integer.parseInt(pali);
		int rem = 0;
		int temp = num;
		int rev = 0;
		while(num > 0)
		{
		  rem = num % 10;
		  rev = rev * 10 + rem;
		  num = num / 10;
		}
		if(rev == temp)
		{
			res.getWriter().println("It is a palindrome");
		}else
		{
			res.getWriter().println("It is not a palindrome");
		}
	}
}
