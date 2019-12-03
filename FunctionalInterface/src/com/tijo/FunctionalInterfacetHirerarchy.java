package com.tijo;

interface Doable
{
	default void doable()
	{
		System.out.println("This is a method from Doable");
	}
}

interface Sayable extends Doable
{
	void say(String msg);
}
public class FunctionalInterfacetHirerarchy {

	public static void main(String[] args) {

		Sayable methodSay = (String msg) -> {System.out.println("Hai Iam "+msg);};
		methodSay.doable();
		methodSay.say("Tijo");
	}
}
