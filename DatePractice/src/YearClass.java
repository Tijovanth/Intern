import java.time.*;
import java.util.Scanner;
public class YearClass {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Year");
      int year = sc.nextInt();
      Year obj = Year.of(year);
      if(obj.isLeap())
      {
    	 System.out.println("This is a leap Year");
      } else
      {
    	  System.out.println("No this is not a leap year");
      }
      sc.close();
	} 
}