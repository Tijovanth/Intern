
public class MyClass {
	 int x = 5; 
	public static void main(String[] args) {
		 
	      MyClass obj = new MyClass();
	      change(obj.x); 
	      System.out.println(obj.x);
	      change(obj);
	      System.out.println(obj.x);
	}
	public static void change(int x) // It creates the copy of the memory and do manipulations in that copy so no changes reflected 
    { 
        x = 10; 
    }
	
//	public static void change(MyClass c) // It only passes references so value will be affected
//	{
//		c.x = 125;
//	}
    public static void change(MyClass c)
    {
    	c = new MyClass(); //here we are creating new object location so changes reflected
    	c.x = 456;
    }
}
