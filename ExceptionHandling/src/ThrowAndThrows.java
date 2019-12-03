
public class ThrowAndThrows {
     
	void method() //throws ArithmeticException
	{
	int a = 10 / 0;
	}
	public static void main(String[] args) {
		
		NullPointerException ex = new NullPointerException();

		ThrowAndThrows obj = new ThrowAndThrows();
		try
		{
		throw ex;
//					obj.method();
		}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		System.out.println(e);
		}
		catch(NullPointerException ex1) {
		System.out.println(ex1);
		}

	}

}
