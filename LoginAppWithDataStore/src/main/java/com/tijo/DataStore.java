package com.tijo;

import java.util.HashMap;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
public class DataStore {

	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	static int id = 1;
	HashMap<String,Key> keys = new HashMap<>();
	
	public void register(String name, String pass)
	{
	 Entity user = new Entity("User",id);
	 user.setProperty("Username", name);
	 user.setProperty("Password", pass);
	 ds.put(user);
	 Key key = KeyFactory.createKey("User",id);
	 System.out.println(key);
	 keys.put(name,key);
	 id++;
	}
	public boolean check(String name, String pass)
	{
	 Query query = new Query("User").addFilter("Username",FilterOperator.EQUAL, name);
	 PreparedQuery pq = ds.prepare(query);
	 if(pq.asSingleEntity() == null)
	 {
		 return false;
	 }else
	 {
		 return true;
	 }
	}
	 public boolean logincheck(String name, String pass)
	 {
		 Query query = new Query("User").addFilter("Username",FilterOperator.EQUAL, name);
		 query.addFilter("Password",FilterOperator.EQUAL,pass);
		 PreparedQuery pq = ds.prepare(query);
		 if(pq.asSingleEntity() == null)
		 {
			 return false;
		 }else
		 {
			 return true;
		 }
	 }
	 public boolean delete(String name)
	 {
		 if(keys.containsKey(name))
		 {
		 Key key = keys.get(name);
		 ds.delete(key);
		 return true;
		 }else
		 {
			 return false;
		 }
	 }
	 public void update(String currentName, String name, String pass)
	 {
		 
		 Key key = keys.get(currentName);
		 System.out.println(key);
		 try {
			Entity entity = ds.get(key);
			System.out.println(entity.getProperty("Username"));
			System.out.println(entity.getProperty("Password"));
			entity.setProperty("Username", name);
			entity.setProperty("Password", pass);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
