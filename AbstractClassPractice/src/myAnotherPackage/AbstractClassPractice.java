package myAnotherPackage;
import myPackage.*;
public class AbstractClassPractice extends Vehicle{

	AbstractClassPractice(int speed, String name)
	{
		super(speed,name);
	}
	
//	public  String getName()
//	{
//		return "getName method from child";
//	}
	static void StaticMethod()
	{
		System.out.println("Statc");
	}
	public void show()
	{
		System.out.println("Show Method");
		StaticMethod();
		
	}
	public static void main(String[] args) {
		
    Vehicle object = new AbstractClassPractice(25,"car");
//    object.show();
//    System.out.println(object.getName());
//    System.out.println(object.getSpeed());
//		Vehicle object = null;
		object.speed;
	}
//we can't create abstract and final class both
// we can't create it is not possible to create abstract and final method both
//we can create constructor, fields non-abstract method  in abstract class
//we can have abstract class have without abstract method that method cannot be instantiated only inherited
// we can't instantiated the abstract class but we can make reference 
}
