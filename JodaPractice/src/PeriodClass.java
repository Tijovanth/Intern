import java.time.LocalDateTime;
import java.time.Period;
public class PeriodClass {

	public static void main(String[] args) {
		LocalDateTime birthday = LocalDateTime.of(1997,7,2,3,30,59);
		LocalDateTime localDateTime = LocalDateTime.now();
		Period age = Period.between(birthday.toLocalDate(), localDateTime.toLocalDate());
		System.out.printf("Your age is %d",age.getYears());

	}

}
