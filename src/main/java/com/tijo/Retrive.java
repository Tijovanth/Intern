package com.tijo;

import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

public class Retrive extends HttpServlet {

	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		response.setContentType("text/html");
		int from = Integer.parseInt(request.getParameter("fromMonth"));
		int to = Integer.parseInt(request.getParameter("toMonth"));
		String plan = request.getParameter("plan");
			DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
			Query query = new Query("Students");
			Calendar calendar = Calendar.getInstance();
			calendar.set(2019, from, 1);
			query.addFilter("JoiningDate", FilterOperator.GREATER_THAN_OR_EQUAL, calendar.getTimeInMillis());
			calendar.set(2019, to, 1);
			int maxi = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			calendar.set(2019, to, maxi);
			query.addFilter("JoiningDate", FilterOperator.LESS_THAN_OR_EQUAL, calendar.getTimeInMillis());
			query.addFilter("Plan", FilterOperator.EQUAL, plan);
			PreparedQuery pq = datastore.prepare(query);
			Iterator itr = pq.asIterator();
			if(itr.hasNext())
			{
				response.getWriter().println("Students are:<br>");
				    while(itr.hasNext())
				    {
				    	Entity e = (Entity)itr.next();	
				        response.getWriter().println(e.getProperty("Name")+"<br>");
				    }
			}else
			{
				response.getWriter().println("No Such Results");
			}
		request.getRequestDispatcher("/Retrive.jsp").include(request, response);
	}
}
