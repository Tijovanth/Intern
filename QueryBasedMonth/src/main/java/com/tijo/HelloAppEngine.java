package com.tijo;

import java.io.IOException;

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
	  entity.setProperty("Name","Tijovanth");
	  entity.setProperty("Joining Month", "December");
	  Entity entity2 = new Entity("Students",2);
	  entity2.setProperty("Name","Vicky");
	  entity2.setProperty("Joining Month", "November");
	  Entity entity3 = new Entity("Students",3);
	  entity3.setProperty("Name","Jaga");
	  entity3.setProperty("Joining Month", "January");
	  Entity entity4 = new Entity("Students",4);
	  entity4.setProperty("Name","Kamesh");
	  entity4.setProperty("Joining Month", "March");
	  datastore.put(entity);
	  datastore.put(entity2);
	  datastore.put(entity3);
	  datastore.put(entity4);
	  response.sendRedirect("Retrive.jsp");
  }
}