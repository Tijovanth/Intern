package com.tijo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
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

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    
    DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
    
    //Creating the Entity
    Entity e = new Entity("Person");
    e.setProperty("FirstName", "Tijo");
    e.setProperty("LastName", "vanth");
    
    Entity e1 = new Entity("User",10);
    e1.setProperty("Username","Tijovanth");
    e1.setProperty("CompanyName","FullCreative");
    ds.put(e1);
    
    //Creating a key
    Key key = KeyFactory.createKey("User",416);
    System.out.println("The Key is "+key);
    Key key1 = new KeyFactory.Builder("User","GrandFather").addChild("User","Father").getKey();
    System.out.println(key1);
    
    //Batch Entities
    Entity emp1 = new Entity("Emp1",12);
    Entity emp2 = new Entity("Emp2",13);
    Entity emp3 = new Entity("Emp3",13);
    
    List<Entity> arr =  Arrays.asList(emp1,emp2,emp3);
    ds.put(arr);
    
    response.getWriter().print("Welcome to Google Datastore Practice!! ");

  }
}