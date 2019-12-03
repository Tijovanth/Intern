package com.tijo;

public class User {

	private int id;
	private String name;
	
	User(int id,String name)
	{
		System.out.println("two args");
		this.id = id;
		this.name = name;
	}
	User(int id)
	{
		System.out.println("one args");
		this.id = id;
	}
	User(String name)
	{
		System.out.println("one args");
		this.name = name;
	}
	User(){System.out.println("no args");};
	public String toString()
	{
		return id+" "+name;
	}
}
