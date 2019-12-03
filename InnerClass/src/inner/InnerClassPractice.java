package inner;

public class InnerClassPractice {
    int a = 100;static int y = 30;
	class Inner{
		int a = 10;
		Inner()
		{
			System.out.println("Inner class Constructor");
		}
		public void method()
		{
			int a = 1000;
			System.out.println("Iam in inner class method");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(y);
			System.out.println(InnerClassPractice.this.a);
		}
	}
	public static void main(String[] args) {
    System.out.println("Iam in main"); 
         new InnerClassPractice().new Inner().method();
//      InnerClassPractice outer = new InnerClassPractice();
//      InnerClassPractice inner = outer.new Inner(); //we can create and access inner class members like this also
//      inner.method();
         Test test = new Test();
         test.m1();
	}
}

class Test
{
	void m1()
	{
		new InnerClassPractice().new  Inner().method();
	}
}
