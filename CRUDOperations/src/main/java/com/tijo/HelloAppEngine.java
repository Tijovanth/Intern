package com.tijo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  
	  response.getWriter().println("Welcome to DataStore");
	  DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
	//creating an Entity
    Entity user = new Entity("User",415);
    user.setProperty("Name","Tijo");
    user.setProperty("EmpId",415);
    user.setProperty("gotMobile", false);
    
    ds.put(user);
    
    //Updating the Entity
    Key key = KeyFactory.createKey("User",415);
    System.out.println(key);
    ds.put(user);
    
    //Retriving the Entity
    try {
		Entity entity = ds.get(key);
		System.out.println(entity);
		System.out.println(entity.getKind());
		System.out.println(entity.getKey());
		System.out.println(entity.getParent());
		System.out.println(entity.getNamespace());
		System.out.println(entity.getProperty("Name"));
	} catch (EntityNotFoundException e) {
		e.printStackTrace();
	}
    
    //deleting the key
    ds.delete(key);

  }
}