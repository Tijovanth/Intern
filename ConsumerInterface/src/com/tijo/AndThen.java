package com.tijo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class AndThen {

	public static void main(String[] args) {

		Consumer<List<Integer>> modify = (list) -> {
			 
			for(int i = 0; i < list.size(); i++)
			{
				System.out.println(2 * list.get(i));
			}
		};
		
		Consumer<List<Integer>> displayList = (list) ->{
			
			for(int i = 0; i < list.size(); i++)
			{	
				System.out.println(list.get(i));
			}
		};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		displayList.andThen(modify).accept(list);
 	}

}
