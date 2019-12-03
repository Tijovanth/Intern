import java.io.*;  

class Pare{  
  void msg()throws Exception{System.out.println("parent");}  
}  

public class MethodOverriding2 extends Pare {
	 void msg()throws Exception{System.out.println("child");}
	public static void main(String[] args) {
		
		Pare p=new MethodOverriding2();  
		   try{  
		   p.msg();  
		   }catch(Exception e){} 
	}

}
