package com.tijo;
import java.util.*;
import java.util.function.*;

public class Demo {

	String dis(String msg)
	{
		return "received "+ msg;
	}
	public static void main(String[] args)
	{
	   Function<String,String> func = (x) -> {return "received "+x;};
	   System.out.println(func.apply("ti"));
	   Function<String,String> func1 = new Demo()::dis;
	   System.out.println(func.andThen(func1).apply("tijo"));
	   //Function<Integer, Integer> times2 = e -> e * 2;
	  //Function<Integer, Integer> squared = e -> e * e;  
	  //times2.compose(squared).apply(4);  
	 //times2.andThen(squared).apply(4);  
	}
}
