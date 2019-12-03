
interface MyInterface extends MyAnotherInterface,MyOtherInterface {
	 int VARIABLE = 10; 
    void display();
    default void dis()
    {
    	System.out.println("dis");
    }
    static void show()
    {
    	System.out.println("Show");
    }
}
