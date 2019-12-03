import java.time.*;
public class DateClass {

	public static void main(String[] args) {
		//		Date d1 = new Date();
//		System.out.println(d1);
//        Date d2 = new Date(98,11,10,07,45,01);
//        System.out.println(d2);
//        System.out.println(d2.after(d1));
//        System.out.println(d2.before(d1));
//        System.out.println(d1.compareTo(d2));
//        System.out.println(d2.getDate());
//        System.out.println(d2.getHours());
//        System.out.println(d2.getMinutes());
//        System.out.println(d2.getMonth());
//        System.out.println(d2.getSeconds());
//        System.out.println(d2.getTime());
//        System.out.println(d2.getYear());
//        System.out.println(d2.getTimezoneOffset());
//        System.out.println(d2.UTC(, 2, 01, 00, 00, 00));
//        System.out.println(d2.)
         LocalDate date = LocalDate.now();
         System.out.println(date);
         LocalTime time = LocalTime.now();
         System.out.println(time);
         int dd = date.getDayOfMonth();
         int mm = date.getMonthValue();
         int yyyy = date.getYear();
         System.out.printf("%d-%d-%d",dd,mm,yyyy);
         System.out.println();
         int s = time.getSecond();
         int m = time.getMinute();
         int h = time.getHour();
         int n = time.getNano();
         System.out.printf("%d:%d:%d:%d\n",h,m,s,n);
         System.out.println("=========================================");
         LocalDateTime dt = LocalDateTime.now();
         System.out.println(dt.getDayOfMonth());
         System.out.println(dt.getHour());
         System.out.println(dt.getMinute());
         System.out.println(dt.getMonthValue());
         System.out.println(dt.getMonth());
         System.out.println("=========================================");
         LocalDateTime dt1 = LocalDateTime.of(1998, Month.DECEMBER, 10, 12, 45);
         System.out.println(dt1.getMonthValue());
         System.out.println(dt1.getSecond());
         System.out.println(dt1.getNano());
         System.out.println(dt1);
         System.out.println("===========================================");
         System.out.println("After Six Months: "+dt1.plusMonths(6));
         System.out.println("Before Six Months: "+dt1.minusMonths(6));
         LocalDate birthday = LocalDate.of(1998, Month.DECEMBER,10);
         LocalDate today = LocalDate.now();
         Period age = Period.between(birthday, today);
         System.out.println("Your Age is: "+age.getYears());
;         
	}

}
