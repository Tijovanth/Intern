package com.tijo;

import java.io.IOException;
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

public class Retrive extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		  response.setContentType("text/html");
		  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		  String name = request.getParameter("name");
		  String month = request.getParameter("month");
		  Query query = new Query("Students");
		  query.addFilter("Name", FilterOperator.EQUAL,name);
		  query.addFilter("Joining Month",FilterOperator.EQUAL,month);
		  PreparedQuery pq  = datastore.prepare(query);
		  if(pq.asSingleEntity() != null)
		  {
		  Entity entity = pq.asSingleEntity();
		  response.getWriter().println(entity.getProperty("Name"));
		  request.getRequestDispatcher("/Retrive.jsp").include(request, response);
		  }else
		  {
			  response.getWriter().println("Sorry No Results");
			  request.getRequestDispatcher("/Retrive.jsp").include(request, response);
		  }
	  }
	  public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException, ServletException {
		  response.setContentType("text/html");
		  String month = request.getParameter("month");
		  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		  Query query = new Query("Students");
		  query.addFilter("Joining Month",FilterOperator.EQUAL,month);
		  PreparedQuery pq  = datastore.prepare(query); 
		  Iterator itr = pq.asIterator();
		  if(itr.hasNext())
		  {
		    while(itr.hasNext())
		    {
		    	Entity e = (Entity)itr.next();
		    	response.getWriter().println(e.getProperty("Name"));
		    }
		    request.getRequestDispatcher("/Retrive.jsp").include(request, response);
		  }else
		  {
			  response.getWriter().println("Sorry No such Results");
			  request.getRequestDispatcher("/Retrive.jsp").include(request, response);
		  }
	  }
}
