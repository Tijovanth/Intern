
public class ChainedException {
	
	void method() throws ArithmeticException{
		method1();
	}
    
	void method1() throws ArithmeticException
	{
		method2();
	}
	
	void method2()
	{
		int a = 10 / 0;
	}
	public static void main(String[] args) {
	  ChainedException obj = new ChainedException();
		try
		{
			obj.method();
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.getCause());
		}

	}

}
