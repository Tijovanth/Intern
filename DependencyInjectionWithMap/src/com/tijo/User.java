package com.tijo;

public class User {

	private int id;  
	private String name,email;  
	public User(int id, String name, String email) {   
	    this.id = id;  
	    this.name = name;  
	    this.email = email;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Name:"+name+" Email Id:"+email;  
	}  
}
