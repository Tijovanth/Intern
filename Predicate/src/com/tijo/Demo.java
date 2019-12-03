package com.tijo;
import java.util.function.Predicate;

public class Demo {

	static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
	
	public static void main(String[] args) {

		Predicate<Integer> pr = a -> (a > 18); 
        System.out.println(pr.test(10));
        Predicate<Integer> pr2 = Demo :: checkAge;
        System.out.println(pr2.test(20));
       // Predicate<Integer> pr3 = a 
	}
}
