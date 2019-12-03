package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClothingServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		String[] items = request.getParameterValues("items");
		HttpSession session = request.getSession();
		String[] electronicItems = (String[]) session.getAttribute("items");
		response.setContentType("text/html");
		response.getWriter().println("<h3>What you purchased</h3>");
		
		for(String x : electronicItems)
		{
			response.getWriter().println("<h2>"+x+"</h2>");
		}
		for(String x : items)
		{
			response.getWriter().println("<h2>"+x+"</h2>");
		}
		request.getRequestDispatcher("HtmlFiles/Clothing.html").include(request,response);
	 }
}
