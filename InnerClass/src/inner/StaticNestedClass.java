package inner;

public class StaticNestedClass {
     static int a=10;
     static final int b = 20;
     final int c = 30;
	static class NestedClass
	{
		static int a;
		static final int b = 10;
		final int c;
		StaticNestedClass obj;
		NestedClass(int b,StaticNestedClass ob)
		{
			this.c = b;
			obj = ob;
		}
		
		static void dis()
		{
			System.out.println("Static dis");
		}
		void show()
		{
			System.out.println("non-static show");
			System.out.println(StaticNestedClass.a);
			System.out.println(a);
			System.out.println(b);
			System.out.println(StaticNestedClass.b);
			System.out.println(c);
			System.out.println(obj.c);
		}
		static void main(String... args)
		{
			System.out.println("Iam a Static Nested Class main method");
		}
	}
	public static void main(String[] args) {
		StaticNestedClass obj = new StaticNestedClass();
         NestedClass n = new NestedClass(1,obj);
         System.out.println(NestedClass.a);	
         System.out.println(NestedClass.b);
         System.out.println(NestedClass.class);
         NestedClass.dis();
         n.show();
         System.out.println(n.c);
         NestedClass.main("1","2","3");
	}

}
