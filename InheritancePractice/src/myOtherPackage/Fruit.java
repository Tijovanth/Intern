package myOtherPackage;

public class Fruit {
   
	public Fruit()
	{
		System.out.println("Fruit Class Constructor");
		System.out.println(this.hashCode());
		System.out.println(this.getClass().getName());
	}
	
	public int value = 10;
	
	public void display()
	{
		System.out.println("display");
	}
}

