import java.time.Instant;
import java.util.*;
public class DateClass2 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("Current Date is:"+d1);
		Date d2 = new Date(98,11,10); // internally calls System.currentmilliseconds
		System.out.println("d2 is "+d2);
		Date d3 = new Date(98390824);
		System.out.println("d3 is "+d3);
		Date d4 = new Date(101,11,10,56,23);
		System.out.println("d4 is "+d4);
		   System.out.println(d2.after(d1));
	        System.out.println(d2.before(d1));
	        System.out.println(d1.compareTo(d2));
	        System.out.println(d2.getDate());
	        System.out.println(d2.getHours());
	        System.out.println(d2.getMinutes());
	        System.out.println(d2.getMonth());
	        System.out.println(d2.getSeconds());
	        System.out.println(d2.getTime());
	        System.out.println(d2.getYear());
		    d2.setMonth(4); 
		    d2.setYear(97);
		    d2.setHours(24);
		    d2.setDate(9);
		    System.out.println("===============");
		    System.out.println(d2.toString());
		    System.out.println(d2.getTime());
		    System.out.println(d2.hashCode());
		    Date d5 = (Date)d2.clone();
		    System.out.println(d5);
		    System.out.println(d5==d2);
		    System.out.println(d5.equals(d2));
		    Instant inst = Instant.now();
		    System.out.println(inst);
		    System.out.println(d2.from(inst));
	}

}
