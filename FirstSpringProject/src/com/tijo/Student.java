package com.tijo;

import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int id;
	private Address address;
	private List<StudentFriends> friends;
	public Student(int id)
	{
		this.id = id;
	}
	public Student(String name)
	{
		this.name = name;
	}
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	public Student(Address address)
	{
		this.address = address;
	}
	public Student(String name, int id, Address address, List<StudentFriends> friends)
	{
		this.name = name;
		this.id = id;
		this.address = address;
		this.friends = friends;
	}
	public String getName() {  
	    return name;  
	}   
	public void setName(String name) {  
	    this.name = name;  
	}  
	public int  getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public void displayInfo(){  
	   System.out.println("Student name: "+name);
	   System.out.println("Student id: "+id);
	   System.out.println("Student Address: "+address.toString());
	   Iterator<StudentFriends> itr = friends.iterator();
	   while(itr.hasNext())
	   {
		   StudentFriends stufri= (StudentFriends)itr.next();
		   stufri.displayFriendsName();
	   }
	}  
}
