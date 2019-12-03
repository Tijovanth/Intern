import java.time.*;
public class ZoneClass {

	public static void main(String[] args) {
		
     ZoneId zone = ZoneId.systemDefault();
     System.out.println(zone.getId());
     System.out.println(zone);
     System.out.println(zone.getRules());
     for(String x : zone.getAvailableZoneIds())
     {
    	 System.out.println(x);
     }
     ZoneId africa = ZoneId.of("Africa/Tripoli");
     ZonedDateTime time = ZonedDateTime.now(africa);
     System.out.println(time);
	}
}