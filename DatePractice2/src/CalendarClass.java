import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.*;
public class CalendarClass {

	public static void main(String[] args) throws ParseException {
		
      Calendar c =  Calendar.getInstance();
      System.out.println(c);
      Calendar c1 = Calendar.getInstance(Locale.TAIWAN);
      System.out.println(c1);
      ZoneId zone = ZoneId.systemDefault();
//      for(String x : zone.getAvailableZoneIds())
//      {
//    	  System.out.println(x);
//      }
      ZoneId america = ZoneId.of("America/Cuiaba");
     // Calendar c2 = Calendar.getInstance(america);
      Calendar c3 = Calendar.getInstance();
      c3.add(Calendar.DATE, -5);
      System.out.println(c3.get(Calendar.DAY_OF_WEEK_IN_MONTH));
      System.out.println(c3.get(Calendar.ERA));
      c3.set(Calendar.HOUR,6,Calendar.PM);
      System.out.println(c3.get(Calendar.HOUR));
      Calendar c4 =Calendar.getInstance();
      c4.set(1998,11,10);
      System.out.println(c4);
      System.out.println(c4.getTime());
      System.out.println(c4.get(Calendar.AM_PM));
      Date date = c4.getTime();
      System.out.println(date);
      Date date1 = new Date();
      c4.setTime(date1);
      System.out.println(c4.getTime());
      SimpleDateFormat simple = new SimpleDateFormat("E, Y-MM-d 'at' H:m:s a z");
      System.out.println(simple.format(date1));
      
      Date strdate = new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1998");
      System.out.println(strdate);
      Instant instant = Instant.now();
      System.out.println(instant);
      Date d5 = new Date();
      System.out.println(d5.toInstant());
      System.out.println(d5);
	}
}