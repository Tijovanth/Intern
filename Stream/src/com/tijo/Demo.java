package com.tijo;
import java.util.*; 
import java.util.stream.*; 
 
public class Demo {

	public static void main(String[] args) {
 
		List<Integer> number = Arrays.asList(2,3,4,5,2,5); 
		Set set = number.stream().map((x) ->  x * x ).collect(Collectors.toSet());
		System.out.println(set);
		System.out.println(number);
		System.out.println("================");
		
		List<Integer> number1 = Arrays.asList(1,2,3,4,5,6,8,7);
		List list = number1.stream().filter(x ->  x % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("================");
		
		List<Integer> number2  = Arrays.asList(1,2,3,4,5,6,8,7);
		Map map = number2.stream().sorted().collect(Collectors.toMap(p->p,p->p));
		System.out.println(map);
		System.out.println("================");
		
		int x = number2.stream().sorted().reduce(0,(i,j) -> i+j);
		System.out.println(x);
		System.out.println("================");
		
		List<Integer> number3 = Arrays.asList(2,3,4,5,2,5); 
		number3.stream().map(x1 ->  x1 * x1 ).forEach(System.out::println);
		System.out.println("================");
		Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(5).forEach(System.out::println);  
	}
}
