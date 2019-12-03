package com.tijo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

  @SuppressWarnings("deprecation")
@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.getWriter().print("Welcome to DataStore");
    DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
    
    Entity user = new Entity("User",415);
    user.setProperty("Name", "Tijovanth");
    user.setProperty("Email", "tijovanth83@gmail.com");
    user.setProperty("gotMobile",false);
    user.setProperty("Age", 20);
    
    Entity user1 = new Entity("User",416);
    user1.setProperty("Name", "Prathap");
    user1.setProperty("Email", "prathap83@gmail.com");
    user1.setProperty("gotMobile",true);
    user1.setProperty("Age", 19);
    
    Entity user2 = new Entity("User",417);
    user2.setProperty("Name", "Jaga");
    user2.setProperty("Email", "Jaga83@gmail.com");
    user2.setProperty("gotMobile",false);
    user2.setProperty("Age", 32);
    
    ds.put(user2);
    ds.put(user1);
    ds.put(user);
    
    Query query = new Query("User").addFilter("Age",FilterOperator.GREATER_THAN, 10);
    query.addFilter("Age", FilterOperator.LESS_THAN, 20);
    query.addSort("Age", Query.SortDirection.ASCENDING);
    PreparedQuery pq = ds.prepare(query);
    Iterator itr = pq.asIterator();
    while(itr.hasNext())
    {
    	Entity e = (Entity) itr.next();
    	System.out.println(e.getProperty("Name"));
    	System.out.println(e.getProperty("Email"));
    	System.out.println(e.getProperty("Age"));
    	System.out.println(e.getProperty("gotMobile"));
    }
  }
}