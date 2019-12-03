package com.tijo;
import java.util.function.*;
public class Accept {

	public static void main(String[] args) {
     
		Consumer<String> display = (String msg) -> {
			System.out.println("Hai Iam "+msg);
		};
		display.accept("Tijo");
		Consumer<Integer> check = new Accept()::evenOrOdd;
		check.accept(2);
		check.accept(5);
	} 
	
	public void evenOrOdd(int a)
	{
		if(a % 2 == 0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("odd");
		}
	}
}
