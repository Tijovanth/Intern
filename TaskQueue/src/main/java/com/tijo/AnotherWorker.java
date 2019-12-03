package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnotherWorker extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		String key = request.getParameter("Key");
		response.getWriter().println(key);
	}
}
