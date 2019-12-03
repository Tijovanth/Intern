
public class NestedTry {

	public static void main(String[] args) {
	   
		try
		{
		int a=6/0;
		try {
		int b[]=new int[2];
		System.out.println(b[3]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex.getMessage());
		}

		}catch(ArithmeticException a) {
		System.out.println(a.getMessage());
		}

		}
		
	}


