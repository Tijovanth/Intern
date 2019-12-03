package inner;

public class NestingOfInnerclass {
    int a = 10;
    
    public void method()
    {
    	System.out.println("Iam in Outer class");
    }
	class Intermediate
	{
		int a = 100;
		public void method()
	    {
	    	System.out.println("Iam in intermediate class");
	    }
		class Inner
		{
			int a = 1000;
			public void method()
		    {
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(Intermediate.this.a);
				System.out.println(NestingOfInnerclass.this.a);
		    	System.out.println("Iam in Inner class");
		    }
		}
	}
	public static void main(String[] args) {
		new NestingOfInnerclass().new Intermediate().new Inner().method();
	}
}
