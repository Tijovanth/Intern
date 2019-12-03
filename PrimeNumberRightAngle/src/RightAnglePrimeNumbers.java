import java.util.Scanner;
public class RightAnglePrimeNumbers {
	
	static int startvalue = 2;
	public static void printPrimeNumber()
	{ 
		int flag = 0;
		boolean value = true;
		while(value)
		{
		for(int i = 2; i <= startvalue/2; i++)
		{
			if(startvalue % i == 0)
			{
				flag = 1;
				startvalue++;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.print(startvalue + " ");
			startvalue++;
			value = false;
		}
		flag = 0;
		}
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter How many rows you want");
       int row = sc.nextInt();
       for(int i = 0; i < row; i++)
       {
    	   for(int j = 0; j <= i; j++)
    	   {
    		   printPrimeNumber();
    	   }
    	   System.out.println();
       }
       sc.close();
	}

}
