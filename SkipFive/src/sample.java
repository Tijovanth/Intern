import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		long num = sc.nextLong();
		long rem,val = 0;
		while(num > 0)
		{
			rem = num % 10;
			if(rem != 5)
			{
			val = val * 10 + rem;
			}
			num = num / 10;
		}
		System.out.println(val);
	}
}
