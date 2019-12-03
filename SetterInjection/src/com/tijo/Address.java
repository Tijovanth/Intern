package com.tijo;

public class Address {

	private String addressLine1,city,state,country;  
	
	public String getAddressLine1()
	{
		return addressLine1;
	}
	public void setAddressLine1(String a)
	{
		addressLine1 = a;
	}
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String c)
	{
		city = c;
	}
	
	public void setState(String s)
	{
		state = s;
	}
	public String getState()
	{
		return state;
	}
	
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String toString(){  
	    return addressLine1+" "+city+" "+state+" "+country;  
	}  
}
