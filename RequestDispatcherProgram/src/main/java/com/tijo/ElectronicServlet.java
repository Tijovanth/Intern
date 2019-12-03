package com.tijo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ElectronicServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		String[] items = request.getParameterValues("items");
		HttpSession session = request.getSession();
		session.setAttribute("items", items);
		request.getRequestDispatcher("HtmlFiles/Clothing.html").forward(request,response);
	 }
}
