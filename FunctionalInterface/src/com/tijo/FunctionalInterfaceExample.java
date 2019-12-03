package com.tijo;


interface Myinterface
{
	void say(String msg);
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
     
		Myinterface methodSay = (String msg) -> {
			System.out.println("Hai Iam "+msg);
		};
		methodSay.say("Tijo");
	}

}
