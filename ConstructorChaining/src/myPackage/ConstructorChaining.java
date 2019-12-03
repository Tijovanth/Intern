package myPackage;
import myAnotherPackage.*;
public class ConstructorChaining extends Vehicle {
     
	ConstructorChaining(int speed, String name)
	{
		super(speed,name);
	}
	
	ConstructorChaining(ConstructorChaining object)
	{
		super(object.getSpeed(),object.getName());
	}
	public static void main(String[] args) {
		ConstructorChaining object = new ConstructorChaining(25,"car");
		object.display();
		ConstructorChaining object2 = new ConstructorChaining(object);
		object2.display();
	}
}
