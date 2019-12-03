package com.tijo;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Retrive extends HttpServlet {

	  @SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		  response.setContentType("text/html");
		  int from = Integer.parseInt(request.getParameter("fromMonth"));
		  int to = Integer.parseInt(request.getParameter("toMonth"));
		  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		  Calendar calendar = Calendar.getInstance();
		  calendar.set(2019, from, 1);
		  Query query = new Query("Students");
		  query.addFilter("JoiningDate", FilterOperator.GREATER_THAN_OR_EQUAL, calendar.getTimeInMillis());
		  calendar.set(2019, to, 1);
		  int maxi = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		  calendar.set(2019, to, maxi);
		  query.addFilter("JoiningDate", FilterOperator.LESS_THAN_OR_EQUAL, calendar.getTimeInMillis());
		  PreparedQuery pq = datastore.prepare(query);
		  Iterator itr = pq.asIterator();
		  if(itr.hasNext())
		  {
			  response.getWriter().println("Students are:"+"<br>");
		    while(itr.hasNext())
		    {
		    	Entity e = (Entity)itr.next();	
		    	response.getWriter().println(e.getProperty("Name")+"<br>");
		    }
		  }else
		  {
			  response.getWriter().println("Sorry No such Results");
		  }
		  request.getRequestDispatcher("/Retrive.jsp").include(request, response);
	  }
	  
	  @SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		  response.setContentType("text/html");
		  String fromdate = request.getParameter("fromdate");
		  String todate = request.getParameter("todate");
		  SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd");
		  try {
			Date fromDate = formatter.parse(fromdate);
			Date toDate = formatter.parse(todate);
			DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
			Query query = new Query("Students");
			Calendar cal = Calendar.getInstance();
			cal.setTime(fromDate);
			query.addFilter("JoiningDate", FilterOperator.GREATER_THAN_OR_EQUAL, cal.getTimeInMillis());
			cal.setTime(toDate);
			query.addFilter("JoiningDate", FilterOperator.LESS_THAN_OR_EQUAL, cal.getTimeInMillis());
			PreparedQuery pq = datastore.prepare(query);
			Iterator itr = pq.asIterator();
			  if(itr.hasNext())
			  {
				  response.getWriter().println("Students are:"+"<br>");
			    while(itr.hasNext())
			    {
			    	Entity e = (Entity)itr.next();	
			    	response.getWriter().println(e.getProperty("Name")+"<br>");
			    }
			  }else
			  {
				  response.getWriter().println("Sorry No such Results");
			  }
			  request.getRequestDispatcher("/Retrive.jsp").include(request, response);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  
		 }
}
