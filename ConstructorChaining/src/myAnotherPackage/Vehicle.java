package myAnotherPackage;

public class Vehicle {
	
	int speed;
	String name;
      Vehicle(String name)
     {
       this.name = name;
     }
     public Vehicle(int speed, String name)
     {
    	 this(name);
    	 this.speed = speed;
     }
     public void display()
     {
    	 System.out.println(speed+" "+name);
     }
     public String getName()
     {
    	 return name;
     }
     public int getSpeed()
     {
    	 return speed;
     }
}
