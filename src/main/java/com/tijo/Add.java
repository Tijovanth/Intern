package com.tijo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.AdminDatastoreService.KeyBuilder;

public class Add extends HttpServlet {
	static long id = 1;
	 public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		String name =  request.getParameter("uname");
		String joiningDate =  request.getParameter("joiningDate");
		String plan = request.getParameter("plan");
		SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date joinDate = formatter.parse(joiningDate);
			Key key = KeyFactory.createKey("Students", id);
			Entity entity = new Entity("Students", key);
			entity.setProperty("Name", name);
			entity.setProperty("JoiningDate", joinDate.getTime());
			entity.setProperty("Plan", plan);
			datastore.put(entity);
			id++;
		 } catch (ParseException e) {
			e.printStackTrace();
		}
		response.sendRedirect("Retrive.jsp");
	 }
}
