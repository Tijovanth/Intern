package com.tijo;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
   {
	 //int k = (int)req.getAttribute("k");
//	    int k = Integer.parseInt(req.getParameter("k"));
//	   HttpSession session = req.getSession();
//	   session.removeAttribute("k");
	  Cookie[] cookies =  req.getCookies();
	  int k = 0; 
	  for(Cookie c : cookies)
	  {
		  if(c.getName().equals("k"))
		  {
			  k = Integer.parseInt(c.getValue());
		  }
	  }
//	   int k = (int) session.getAttribute("k");
	 k = k * k;
	 res.getWriter().println("Square is "+k);
   }
}
