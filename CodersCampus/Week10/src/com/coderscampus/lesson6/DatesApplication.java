package com.coderscampus.lesson6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatesApplication {

	public static void main(String[] args) {
//		Lesson6();
		
		// This is deprecated, don't use this approach, use Calendar instead
		Date jan012020 = new Date(124, 0, 1, 0, 0, 0);
		Calendar cal = Calendar.getInstance();
		System.out.println(jan012020);
		
		
		Date someOtherDate = cal.getTime();
		System.out.println(someOtherDate);
		cal.set(2020, 0, 1, 15, 1, 5);
		someOtherDate = cal.getTime();
		System.out.println(someOtherDate);
		
		cal.add(Calendar.HOUR, 2);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MINUTE, -1);
		System.out.println(cal.getTime());
		
		Date now = new Date();
		if(now.after(cal.getTime())) {
			System.out.println(now + " is after " + cal.getTime());
		}
	
	}

	private static void Lesson6() {
		Date now = new Date();
		System.out.println(now);
		
		java.sql.Date jan011970 = new java.sql.Date(86400000);
		System.out.println(jan011970);
	}

}
