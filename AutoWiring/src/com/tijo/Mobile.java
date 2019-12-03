package com.tijo;

public class Mobile {

	User user;
	String mobileName;
	
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
	public void setMobileName(String m)
	{
		mobileName = m;
	}
	public String getMobileName()
	{
		return mobileName;
	}
	public void print()
	{
		System.out.println(user);
		System.out.println(mobileName);
	}
}
