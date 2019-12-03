package com.tijo;

import java.util.HashMap;

public class DataStore {

private HashMap<String,String> registry =new  HashMap<>(); 
	
	public void set(String username, String password)
	{
		registry.put(username, password);
	}
	
	public boolean Logincheck(String username,String password)
	{
		System.out.println(registry.isEmpty());
		if(registry.isEmpty())
		{
			return false;
		}else
		{
          if(check(username))
          {
        	return registry.get(username).equals(password);
          }else
          {
        	return false;
           }
		}
	}
	
	public boolean check(String username)
	{
		return registry.containsKey(username);
	}
}
