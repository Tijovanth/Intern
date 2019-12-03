public class StaticKeyword {

    static String name;
    int number = 20;
    static
    {
    	System.out.println("Static block");
    }
    static int returnNumber(StaticKeyword sk)
    {
    	sk.number = 300;
    	System.out.println("Inside return Number");
    	sk.display();
    	return 20;
    }
    
    void display()
    {
    	System.out.println("Iam Display");
    }
	public static void main(String[] args) {
       System.out.println("Iam Main");
       StaticKeyword object = new StaticKeyword();
       System.out.println(object.number);
       System.out.println(returnNumber(object));
       System.out.println(object.number);
	}
}