package com.tijo;

public class Address {

	private String city;
	private String state;
	private String country;
	
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.country = country;
		this.state = state;
	}
	
	public String toString()
	{
		return city+" "+state+" "+country;
	}
}
