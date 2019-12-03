import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class StringDateConvertions {

	public static void main(String[] args) {
		String localDateTimeInString = "2016-03-04 11:30";
		DateTimeFormatter patternRequired = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		//string --->  date use LocalDateTime.parse method
		LocalDateTime convertedStringToLocalDateTime = LocalDateTime.parse(localDateTimeInString, patternRequired);
		System.out.println(convertedStringToLocalDateTime);
		//any date ---> string use format  method
        String convertedLocalDateTimeToString = patternRequired.format(convertedStringToLocalDateTime);
        System.out.println(convertedLocalDateTimeToString);

	}

}
