package com.tijo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  Entity entity = new Entity("Students",1);
	  Date date = new Date(119,0,10);
	  entity.setProperty("Name","Tijovanth");
	  entity.setProperty("JoiningDate", date.getTime());
	  Entity entity1 = new Entity("Students",2);
	  Date date1 = new Date(119, 2, 23);
	  entity1.setProperty("JoiningDate", date1.getTime());
	  entity1.setProperty("Name","Jagadish");
	  Entity entity2 = new Entity("Students",3);
	  Date date2 = new Date(119, 4, 19);
	  entity2.setProperty("JoiningDate", date2.getTime());
	  entity2.setProperty("Name","Kamesh");
	  Entity entity3 = new Entity("Students",4);
	  Date date3 = new Date(119, 6, 6);
	  entity3.setProperty("JoiningDate", date3.getTime());
	  entity3.setProperty("Name","Ajay");
	  Entity entity4 = new Entity("Students",5);
	  Date date4 = new Date(119, 7, 29);
	  entity4.setProperty("JoiningDate", date4.getTime());
	  entity4.setProperty("Name","Mojo");
	  datastore.put(entity);
	  datastore.put(entity1);
	  datastore.put(entity2);
	  datastore.put(entity3);
	  datastore.put(entity4);
	  response.sendRedirect("Retrive.jsp");
  }
}