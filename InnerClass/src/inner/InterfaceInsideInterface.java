package inner;

interface Outside
{
	public void method();
	interface Inner
	{
		public void method();
	}
}
class MyImplementation implements Outside
{
	public void method()
	{
		System.out.println("Outer Interface Method");
	}
}
class MyImplementation2 implements Outside.Inner
{
	public void method()
	{
		System.out.println("Inner Interface Method");
	}
}
public class InterfaceInsideInterface {

	public static void main(String[] args) {
		
   MyImplementation obj = new MyImplementation();
   MyImplementation2 ob = new MyImplementation2();
   obj.method();
   ob.method();
	}

}
