import java.util.*;
public class AddMethod {

	public static void main(String[] args) {
		
      Calendar c = Calendar.getInstance();
      System.out.println(c.getTime());
      System.out.println(c.getTimeZone());
      c.add(Calendar.MONTH, 10);
      System.out.println(c.getTime());
      c.add(Calendar.YEAR,-10);
      System.out.println(c.getTime());
      c.add(Calendar.DATE, -100);
      System.out.println(c.getTime());
      System.out.println("===========================");
      Calendar c1 = Calendar.getInstance();
      System.out.println(c1.getTime());
      c1.set(1998, 11, 10, 00, 00);
      System.out.println(c1.getTime());
      c1.set(Calendar.YEAR,1996);
      System.out.println(c1.getTime());
      System.out.println("===========================");
      Calendar c2 = Calendar.getInstance();
      Calendar c3 = Calendar.getInstance();
      Calendar c4 = new GregorianCalendar(1998,11,10);
      System.out.println(c3.compareTo(c2));
      System.out.println(c3.compareTo(c4));
      System.out.println(c2.compareTo(c4));
      System.out.println("===========================");
      Calendar c5 = Calendar.getInstance();
      System.out.println(c5.getTime());
      c5.set(Calendar.MONTH,Calendar.SEPTEMBER);
      System.out.println(c5.getTime());
      System.out.println(c5.isSet(Calendar.YEAR));
      System.out.println(c5.isSet(Calendar.MONTH));
      System.out.println(c5);
      c5.clear();
      System.out.println(c5.isSet(Calendar.MONTH));
      System.out.println(c5.isSet(Calendar.YEAR));
      System.out.println(c5);
      System.out.println("===========================");
      Calendar c6 = Calendar.getInstance();
      System.out.println(c6.getTime());
      c6.set(Calendar.YEAR,2007);
      c6.roll(Calendar.YEAR, true);
      System.out.println(c6.getTime());
      c6.roll(Calendar.YEAR, false);
      System.out.println(c6.getTime());
      System.out.println("===========================");
      Calendar c7 = Calendar.getInstance();
      System.out.println(c7.getTimeZone());
      TimeZone timezone =TimeZone.getTimeZone("GMT");
      System.out.println(timezone);
      c7.setTimeZone(timezone);
      System.out.println(c7.getTimeZone().getDisplayName());
      System.out.println("===========================");
      Calendar c8 = Calendar.getInstance();
      System.out.println(c8.get(Calendar.HOUR));
      System.out.println(c8.get(Calendar.HOUR_OF_DAY));
      System.out.println(Calendar.getAvailableCalendarTypes());
      }
}
