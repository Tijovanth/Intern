

public class LambdaPractice2 {
	interface Calculations
	{
		int mul(int x, int y);
	}
	interface Message
	{
		void printMessage();
	}
	public static void main(String[] args) {
  
		Message obj = () -> System.out.println("Print Message");
		obj.printMessage();
		Calculations ob = (int x, int y) -> {return (x*y);};
		Calculations ob1 = (int x, int y) -> {return (x+y);};
		System.out.println(ob.mul(3, 4));
		System.out.println(ob1.mul(5, 10));
	}
}