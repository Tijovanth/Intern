//import java.util.*;
class Vehicle {
	int speed;
	String name;
	 Vehicle()
	{
		System.out.println("No-args");
		return;
	}
	Vehicle(int speed, String name)
	{
		this.speed = speed;
		this.name = name;
	}
	Vehicle(int speed)
	{
		this.speed = speed;
		name = "bike";
	}
	public void getSpeedAndName()
	{
		System.out.println("Speed is "+speed);
		System.out.println("Name is "+name);
	}
}
