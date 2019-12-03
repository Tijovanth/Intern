package com.tijo;

import java.util.Iterator;
import java.util.List;

public class StudentFriends {

	private List<String> friendsName;
	
	public StudentFriends(List<String> friendsName)
	{
		this.friendsName = friendsName;
	}
	
	public void displayFriendsName()
	{
		Iterator itr = friendsName.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}
