import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeException {

	public static void main(String[] args) {
		
//			LocalDate localDate = LocalDate.now();
//			LocalDateTime americaDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
//			System.out.println(americaDateTime);
			try {
		        return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString));
		    } catch (DateTimeException e) {
		        System.err.println("Invalid zone ID: " + zoneString + "; using the default time zone instead.");
		        return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
		    }
			
		

	}

}
