package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextPractice extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		response.setContentType("text/html");
		ServletContext context = getServletContext();
		int majorVersion = context.getMajorVersion();
		String path = context.getContextPath();
		String info = context.getServerInfo();
		context.setAttribute("Tijo", "is a good boy");
		//context.setInitParameter("Kama", "He is a Bad Boy");
	    //context.setInitParameter("vishali", "vishali is a girl");
		PrintWriter out = response.getWriter();
		out.println("Major Version :"+ majorVersion + "<br>");
		out.println("path :" + path + "<br>");
		out.println("info :" + info + "<br>");
		String Tijo = (String) context.getAttribute("Tijo");
		String temp = (String) context.getAttribute("Kama");
		String kama = context.getInitParameter("Kama");
		String temp1 = context.getInitParameter("Ajay");
		//out.println(context.setInitParameter("Kama", "He is my friend"));
		//out.println(context.setInitParameter("Kama","He is a Bad Boy"));
		context.setAttribute("Tijo","Ya Iam Tijo");
		String Tijo1 = (String) context.getAttribute("Tijo");
		out.println("Tijo " + Tijo + "<br>");
		out.println("Tijo1 "+ Tijo1+ "<br>");
		out.println("temp "+ temp+ "<br>");
		out.println("kama "+kama+ "<br>");
		out.println("Ajay "+temp1+ "<br>");
	
	}
}
