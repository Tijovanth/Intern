
public class UncheckedPropogation {
	
	int method3() {
		try
		{
			System.out.println("try");
		return 1;
		}catch(Exception e)
		{
			System.out.println("catch");
			return 0;
		}
		finally
		{
			System.out.println("finally");
		}
	}
	void method2()
	{
		method3();
	}
	
	void method()
	{
		method2();
	}

	public static void main(String[] args) {
		
       UncheckedPropogation obj = new UncheckedPropogation();
//       try
//       {
//    	   obj.method();
    	   System.out.println(obj.method3());
//       }catch(Exception e)
//       {
//    	   System.out.println("Exception");
//       }
//       finally
//       {
//    	   System.out.println("finnaly");
//       }
	}

}
