import java.util.*;
public class CalenderClass {

	public static void main(String[] args) {
		
       Calendar c = Calendar.getInstance();
       System.out.println(c);
       System.out.println(c.getTime());
       System.out.println(c.get(Calendar.MINUTE));
       System.out.println(c.get(Calendar.YEAR));
       System.out.println(c.get(Calendar.WEEK_OF_MONTH));
       System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
       System.out.println(c.get(Calendar.DAY_OF_WEEK));
       System.out.println(c.get(Calendar.WEEK_OF_YEAR));
       System.out.println(c.get(Calendar.MONTH));
       System.out.println(c.get(Calendar.DATE));
//       System.out.println(c.get(Calendar.SEPTEMBER));
//       System.out.println(c.get(Calendar.AUGUST));
//       System.out.println(c.get(Calendar.DECEMBER));
//       System.out.println(Calendar.DECEMBER);
       System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK));
       System.out.println(c.getMaximum(Calendar.WEEK_OF_MONTH));
       System.out.println(c.getMaximum(Calendar.DAY_OF_YEAR));
       System.out.println(c.getMaximum(Calendar.MONTH));
       System.out.println(c.getMaximum(Calendar.DAY_OF_MONTH));
       System.out.println();
       System.out.println(c.getMinimum(Calendar.DAY_OF_WEEK));
       System.out.println(c.getMinimum(Calendar.WEEK_OF_MONTH));
       System.out.println(c.getMinimum(Calendar.DAY_OF_YEAR));
       System.out.println(c.getMinimum(Calendar.MONTH));
       System.out.println(c.getMinimum(Calendar.DAY_OF_MONTH));
	}

}
