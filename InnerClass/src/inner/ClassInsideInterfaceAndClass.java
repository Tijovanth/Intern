package inner;

class VehicleTypes
{
	interface Wheels{
		public int getNoOfWheels();
	}
	interface Seat
	{
		public String seatAdjust();
	}
	class Bus implements Wheels,Seat
	{
		public int getNoOfWheels()
		{
			return 6;
		}
		public String seatAdjust()
		{
			return "high";
		}
	}
}
class Bike implements VehicleTypes.Wheels
{
	public int getNoOfWheels()
	{
		return 2;
	}
}
public class ClassInsideInterfaceAndClass {
	public static void main(String[] args) {
      VehicleTypes v = new VehicleTypes();
      VehicleTypes.Bus b = v.new Bus();
      System.out.println(b.seatAdjust());
      System.out.println(b.getNoOfWheels());
	}

}
