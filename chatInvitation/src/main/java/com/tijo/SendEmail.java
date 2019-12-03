package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendEmail extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email = request.getParameter("EmailId");
		SendMail mail = new SendMail();
		mail.send(email,"Send by Tijovanth","Got the Mail to Tijovanth");
		response.getWriter().println("Mail sent to "+email);
	}
}
