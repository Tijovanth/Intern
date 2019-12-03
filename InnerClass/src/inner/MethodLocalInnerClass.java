package inner;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		Outer object = new Outer();
		object.method();
		Outer.method1(object);
	}

}

class Outer
{
	
	int x = 10;
	static int y = 20;
	public void method()
	{
		 int a = 343;
		class Inner
		{
			 final int a = 11;

			public void sum(int a, int b)
			{
				System.out.println(a + b);
				System.out.println(this.a);
			}
		}
		class Innerclass
		{
			public void method()
			{
				System.out.println("Iam not a static");
				System.out.println(x);
				System.out.println(y);
				//System.out.println(z);
			}
		}
		 new Inner().sum(10, 20);
		 new Innerclass().method();
	}
	public static void method1(Outer obj)
	{
		class Inner
		{
			 Inner()
			{
				System.out.println("Inner class Constructor");
			}
			public void main()
			{
				System.out.println("Iam a static");
				System.out.println(y);
				System.out.println(obj.x);
			}
		}
		new Inner().main();
	}
}
