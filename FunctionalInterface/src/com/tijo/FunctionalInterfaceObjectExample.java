package com.tijo;


interface Myinterface1
{
	void say(String msg);
	
}
public class FunctionalInterfaceObjectExample {

	void say(String msg)
	{
		System.out.println("Hai Iam " + msg);
	}
	public static void main(String[] args) {

		Myinterface1 methodSay = new FunctionalInterfaceObjectExample() :: say;
		methodSay.say("Tijo");
	}

}
