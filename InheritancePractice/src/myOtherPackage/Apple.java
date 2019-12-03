package myOtherPackage;

public class Apple extends Fruit
{
	public Apple()
	{
		System.out.println("Apple Class Constructor");
		System.out.println(this.hashCode());
		System.out.println(this.getClass().getName());
	}
	public int value = 20;
	
	public static void show()
	{
		System.out.println("Apple Class Show");
	}
}
