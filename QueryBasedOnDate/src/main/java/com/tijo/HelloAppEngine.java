package com.tijo;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  Entity entity = new Entity("User",1);
	  Date date = new Date();
	  entity.setProperty("DOB", date.getTime());
	  Entity entity1 = new Entity("User",2);
	  Date date1 = new Date(98, 11, 10);
	  entity1.setProperty("DOB", date1.getTime());
	  Entity entity2 = new Entity("User",3);
	  Date date2 = new Date(101, 10, 10);
	  entity2.setProperty("DOB", date2.getTime());
	  Entity entity3 = new Entity("User",4);
	  Date date3 = new Date(111, 5, 1);
	  entity3.setProperty("DOB", date3.getTime());
	  Entity entity4 = new Entity("User",5);
	  Date date4 = new Date(106, 8, 23);
	  entity4.setProperty("DOB", date4.getTime());
	  datastore.put(entity);
	  datastore.put(entity1);
	  datastore.put(entity2);
	  datastore.put(entity3);
	  datastore.put(entity4);
	  
	  Date testdate = new Date(98, 11, 10);
	  System.out.println(testdate.getTime());
	  System.out.println(date1.getTime());
	  Query query = new Query("User").addFilter("DOB", FilterOperator.EQUAL, testdate.getTime());
	  PreparedQuery preparedQuery =  datastore.prepare(query);
	  Entity testEntity = preparedQuery.asSingleEntity();
	  Long time = (Long) testEntity.getProperty("DOB");
	  Timestamp ts = new Timestamp(time);
	  response.getWriter().println(ts);
  }
}