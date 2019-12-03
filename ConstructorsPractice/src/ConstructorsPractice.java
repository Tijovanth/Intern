//import java.util.*;

public class ConstructorsPractice extends Vehicle{
	ConstructorsPractice(String name, int speed)
	{
		super(speed,name);
		return;
	}
	
	ConstructorsPractice()
	{
		//super();
		return;
	}
	ConstructorsPractice(int speed)
	{
		super(speed);
	}
	public static void main(String[] args) {
		ConstructorsPractice object = new ConstructorsPractice("car",25);
		object.getSpeedAndName();
		ConstructorsPractice object2_ = new ConstructorsPractice(25);
		object2_.getSpeedAndName();
	}
}
