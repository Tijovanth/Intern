import java.time.ZoneId;
import java.time.ZonedDateTime;
public class TimeZoneClass {

	public static void main(String[] args) {
		ZoneId systemZoneId = ZoneId.systemDefault();
		System.out.println(systemZoneId);
        ZoneId americaLosAngelesZoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dateTimeInAmericaLosAngeles = ZonedDateTime.now(americaLosAngelesZoneId);
        System.out.println(dateTimeInAmericaLosAngeles);
	}
}