import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class TimeZoneClass {

	public static void main(String[] args) {
		
         String zone[] = TimeZone.getAvailableIDs();
//         for(String x : zone)
//         {
//        	 System.out.println(x);
//         }
         System.out.println(TimeZone.getTimeZone("Africa/Tripoli").getID());
         System.out.println(TimeZone.getTimeZone("Africa/Tripoli").getDisplayName());
         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Africa/Tripoli"));
         Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("PST"));
         System.out.println("TimeZone "+calendar.getTimeZone());
         System.out.println(c.get(Calendar.MINUTE)+" "+c.get(Calendar.HOUR_OF_DAY));
         System.out.println(c.getTime());
        // ZonedDateTime zone1 = ZonedDateTime.now(TimeZone.getTimeZone("Africa/Asmara"));
         //System.out.println(zone1);
         Date date = new Date();
         LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("Africa/Tripoli"));
         System.out.println(ldt);
         System.out.println(ldt.getHour());
         System.out.println(ldt.getMonthValue());
         System.out.println(ldt.getMonth());
         Date out = Date.from(ldt.atZone(ZoneId.of("Africa/Tripoli")).toInstant());
         System.out.println(out);
         Calendar c1 = Calendar.getInstance();
         LocalDateTime ldt1 = LocalDateTime.ofInstant(c1.toInstant(),ZoneId.of("Africa/Tripoli"));
         System.out.println(ldt1);
         Calendar c2 = Calendar.getInstance();
         c2.set(ldt.getYear(), ldt.getMonthValue()-1, ldt.getDayOfMonth());
         System.out.println(c2.getTime());
        
	}
}
