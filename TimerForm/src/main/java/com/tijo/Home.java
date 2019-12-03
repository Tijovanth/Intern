package com.tijo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Timer; 
import java.util.TimerTask; 

public class Home extends HttpServlet {

	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		 
		 HttpSession session = request.getSession();
		 if(session.getAttribute("username") == null)
		 {
			 response.sendRedirect("index.jsp");
		 }else
		 {
		 String username = (String) session.getAttribute("username");
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
//		 Timer timer = new Timer(); 
//	        TimerTask task = new Helper();    
//	        timer.schedule(task, 2000, 1000); 
//	        while(Helper.i < 60)
//	        {
//	        out.println(Helper.i);
//	        }
		 out.println("Welcome "+username + "<br><br>"+"Click Below Button <br><br>");
		 out.println("<form action='FormPage.jsp'><input type='submit' value='FormPage'></form>");
		 out.println("<br><br><form action='Logout'><input type='submit' value='Logout'></form>");
		 }
	 }
}

class Helper extends TimerTask 
{ 
    public static int i = 0; 
    public void run() 
    { 
    	i=i+1;
       System.out.println(i);
    } 
} 
  
