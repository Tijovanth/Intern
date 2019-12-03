package com.tijo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;  
	private String name;  
	private Map<Answer,User> answers;
	
	public Question(int id, String name, Map<Answer, User> answers) {  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	} 
	
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers...."); 
	    Set<Map.Entry<Answer, User>> set = answers.entrySet();
	    Iterator itr = set.iterator();
	    while(itr.hasNext())
	    {
	    	Entry<Answer, User> entry = (Entry<Answer, User>) itr.next();
	    	System.out.println("Answer Information");
	    	System.out.println(entry.getKey());
	    	System.out.println("Posted By");
	    	System.out.println(entry.getValue());
	    }
	}
	
}
