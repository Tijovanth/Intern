package myPackage;

import myOtherPackage.Apple;
import myOtherPackage.Fruit;

public class InheritancePractice extends Apple {
	int value = 10000;
   InheritancePractice()
   {
	   System.out.println("Child Class Constructor");
	   System.out.println(this.hashCode()+" "+super.hashCode());
		System.out.println(this.getClass().getName()+" "+super.getClass().getName());
   }
   public void display()
	{
		System.out.println("dis");
	}
   public static void show() {
	   System.out.println("Inheritance Show"); 
   }
   public void dis()
   {
	   display();
   }
	public static void main(String[] args) {
		InheritancePractice object = new InheritancePractice();
		System.out.println(object.value);
		//object.display();
		object.dis();
	    show();
	}

}
