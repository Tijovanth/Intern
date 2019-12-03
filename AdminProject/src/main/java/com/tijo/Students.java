package com.tijo;

import java.util.ArrayList;

public class Students {

	private String username;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;
	private ArrayList<Integer> marks;
	public Students()
	{
		
	}
	public Students(String username,String email, String phoneNumber, String address, String password)
	{
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}
	public String getUserName()
	{
		return username;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPassword()
	{
		return password;
	}
	public void setUserName(String username)
	{
		this.username = username;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setMarks(ArrayList<Integer> marks)
	{
		this.marks = marks;
	}
	public ArrayList<Integer> getMarks()
	{
		return marks;
	}
}
