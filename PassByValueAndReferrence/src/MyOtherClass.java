

class Demo
{
	int i = 10;
	int j = 20;
}
public class MyOtherClass {

	
	 public static void swap(String i, String j)  
	   { 
	      String temp = new String(i); 
	      i = j; 
	      j = temp; 
	      System.out.println("i = " + i + ", j = " +j);
	   } 
	 
	 public static void change(Demo d)
	 {
		 d = new Demo();
		 d.i = 100;
		 d.j = 200;
	 }
	public static void main(String[] args) {

		String i = new String("10"); 
	      String j = new String("20"); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j);
	      Demo obj = new Demo();
	      System.out.println("i = " + obj.i + ", j = " +obj.j);
	      change(obj);	  
	      System.out.println("i = " + obj.i + ", j = " +obj.j);
	      
	}

}
