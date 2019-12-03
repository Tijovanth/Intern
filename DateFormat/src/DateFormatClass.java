import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateFormatClass {

	public static void main(String[] args) {
		
      Date d = new Date();
      String str = DateFormat.getInstance().format(d);
      System.out.println(str);
      
      Calendar c = Calendar.getInstance();
      SimpleDateFormat geek = new SimpleDateFormat("dd / MM / yy"); 
      String formattedDate = geek.format(c.getTime());
      System.out.println(formattedDate);
	}

}
