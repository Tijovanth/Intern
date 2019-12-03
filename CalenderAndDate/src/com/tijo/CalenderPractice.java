package com.tijo;

import java.util.Calendar;
import java.util.Date;

public class CalenderPractice {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date d = c.getTime();
        System.out.println(d);
        int hour = c.get(Calendar.HOUR);
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        int dayOfWeekInMonth = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int min = c.get(Calendar.MINUTE);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        Date dateObj = new Date();
        c.setTime(dateObj);
        System.out.println(c.getTime());
        System.out.println(hour+" "+dayOfWeek+" "+dayOfWeekInMonth+" "+min+" "+dayOfYear);
        c.set(Calendar.MINUTE, 56);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH, 8);
        System.out.println(c.getTime());
        Calendar c1 = Calendar.getInstance();
        c1.set(2014,4,13);
        System.out.println(c.after(c1));
        
	}

}
