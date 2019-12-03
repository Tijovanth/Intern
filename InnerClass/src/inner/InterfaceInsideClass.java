package inner;

interface Vehicle
{
	public int getNoWheels();
	int a = 10;
	class Bike implements Vehicle
	{
		 int a;
		Bike()
		{
			this.a = 200;
		}
		public int getNoWheels()
		{
			System.out.println(Vehicle.a);
			System.out.println(this.a);
			return 2;
		}
	}
}

class Bus implements Vehicle
{
	public int getNoWheels()
	{
		return 6;
	}	
}
public class InterfaceInsideClass {

	public static void main(String[] args) {
      Vehicle.Bike obj = new Vehicle.Bike();
      System.out.println(obj.getNoWheels());
      Bus ob = new Bus();
      System.out.println(ob.getNoWheels());
	}

}
