
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
public class LocalDateTimeClass {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now(); //gives date without time zone
		System.out.println(localDate);
		LocalTime localTime = LocalTime.now();//give time without time zone
		System.out.println(localTime);
		LocalDateTime localDateTime = LocalDateTime.now(); //give date and time without timezone.
		System.out.println(localDateTime);
		LocalDate dateFromDateAndTime = localDateTime.toLocalDate();
		System.out.println(dateFromDateAndTime);
		LocalTime timeFromDateandTime = localDateTime.toLocalTime();
		System.out.println(timeFromDateandTime);
		LocalDateTime americaDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(americaDateTime);
		System.out.println("month day "+localDateTime.getDayOfMonth());
		System.out.println(" year day "+localDateTime.getDayOfYear());
		System.out.println("month "+localDateTime.getMonthValue());
		System.out.println("hour "+localDateTime.getHour());
		System.out.println("minute "+localDateTime.getMinute());
		System.out.println("nanoseconds "+localDateTime.getNano());
		System.out.println("seconds "+localDateTime.getSecond());
		System.out.println("year "+localDateTime.getYear());
		LocalDateTime customLocalDateTime = LocalDateTime.of(1997,7,2,3,30,59);
		System.out.println(customLocalDateTime);

	}

}
