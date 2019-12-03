package com.tijo;

public class User {

	private String username;
	private String password;
	private String email;

	User(){}
	User(String username, String password, String email)
	{
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public void setUserName(String username)
	{
		this.username = username;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getUserName()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public String getEmail()
	{
		return email;
	}
}
