import java.util.Scanner;
class RightAnglePrimeNumbers{
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
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime number you want to print");
		int count = sc.nextInt();
		int increament = 1;
		while(count > 0)
		{
	      if(count - increament >= increament+1 )
	      {
	    	  for(int i = 0; i < increament; i++)
	    	  {
	    		  printPrimeNumber();
	    	  }
	    	  System.out.println();
	      } else
	      {
	    	  for(int i = 0; i < count; i++)
	    	  {
	    		  printPrimeNumber();
	    	  }
	    	  count = 0;
	      }
	      count -= increament;
	      increament++;
		}
		sc.close();
		
	}
}