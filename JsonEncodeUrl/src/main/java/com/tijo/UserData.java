package com.tijo;

import java.util.HashMap;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

public class UserData {

	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	HashMap<String,Key> keys = new HashMap<>();
	static int id = 1;
	public void register(User userDetails)
	{
	 Entity user = new Entity("User");
	 user.setProperty("Username", userDetails.getUserName());
	 user.setProperty("Password", userDetails.getPassword());
	 ds.put(user);
	 Key key = KeyFactory.createKey("User",id);
	 System.out.println(id);
	 keys.put(userDetails.getUserName(),key);
	 id++;
	}
	public boolean check(User userDetails)
	{
	 Query query = new Query("User").addFilter("Username",FilterOperator.EQUAL,userDetails.getUserName());
	 PreparedQuery pq = ds.prepare(query);
	 if(pq.asSingleEntity() == null)
	 {
		 return false;
	 }else
	 {
		 return true;
	 }
	}
	 public boolean logincheck(User userDetails)
	 {
		 Query query = new Query("User").addFilter("Username",FilterOperator.EQUAL,userDetails.getUserName());
		 query.addFilter("Password",FilterOperator.EQUAL,userDetails.getPassword());
		 PreparedQuery pq = ds.prepare(query);
		 if(pq.asSingleEntity() == null)
		 {
			 return false;
		 }else
		 {
			 return true;
		 }
	 }
	 public boolean delete(User userDetails)
	 {
		 if(keys.containsKey(userDetails.getUserName()))
		 {
		 Key key = keys.get(userDetails.getUserName());
		 ds.delete(key);
		 return true;
		 }else
		 {
			 return false;
		 }
	 }
	 public void update(String currentName, User userDetails)
	 {
		 
		 Key key = keys.get(currentName);
		 try {
			Entity entity = ds.get(key);
			entity.setProperty("Username", userDetails.getUserName());
			entity.setProperty("Password", userDetails.getPassword());
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
	 }
}
