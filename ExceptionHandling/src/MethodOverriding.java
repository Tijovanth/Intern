import java.io.*;  

class Parent{  
  void msg(){System.out.println("parent");}  
}

public class MethodOverriding extends Parent{
     
	  void msg()throws NullPointerException{  
		    System.out.println("TestExceptionChild");  
		  }
	public static void main(String[] args) {
		Parent p=new MethodOverriding();  
		   p.msg(); 
	}

}
