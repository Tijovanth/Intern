import java.io.FileNotFoundException;
public class CheckedException  {
    
	void method3() throws FileNotFoundException {
		FileNotFoundException ex = new FileNotFoundException();
		throw ex;
	}
	void method2() throws FileNotFoundException
	{
		method3();
	}
	
	void method() throws FileNotFoundException
	{
		method2();
	}
	public static void main(String[] args) {
		
		 CheckedException obj = new CheckedException();
	       try
	       {
	    	   obj.method();
	       }catch(Exception e)
	       {
	    	   System.out.println("Caughted");
	       }
	}

}
