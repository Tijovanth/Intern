package com.tijo;

public class User {

	private String username;
	private String password;
	
	public User() {}
	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	public void setUserName(String username)
	{
		this.username = username;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getUserName()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
}
