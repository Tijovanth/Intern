
public class UsingInstanceOf {

	public static void main(String[] args) {
		
		 try { 
			 int arr[] = new int[3];
			 arr[5] = 10/0;
		 }
		 catch(Exception e)
		 {
			 if (e instanceof ArithmeticException) 
	                System.out.println("Can't divide by 0"); 
	            if (e instanceof ArrayIndexOutOfBoundsException) 
	                System.out.println("This index doesn't exist in this array");
		 }
	}

}
