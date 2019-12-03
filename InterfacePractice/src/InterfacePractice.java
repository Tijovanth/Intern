
public class InterfacePractice implements MyInterface {
    
	public void display()
	{
		System.out.println("display");
	}
	public void print()
	{
		System.out.println("print");
	}
	public void someMethod() {
		System.out.println("Some Method");
	}
	public static void main(String[] args) {
       MyInterface object = new InterfacePractice();
       object.display();
       object.dis();
       MyInterface.show();
       object.print();
       object.someMethod();
       System.out.println(VARIABLE);
	}
}
