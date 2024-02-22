package com.coderscampus.lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDatesApplication {

	public static void main(String[] args) {
//		Lesson9();		
//		Lesson10();
		try{
			LocalDateTime jan1 = LocalDateTime.parse("2020-01-01 3:00 PM", DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
			System.out.println(jan1);
			
			LocalDate endOfFeb = LocalDate.of(2020,  02, 5).with(TemporalAdjusters.lastDayOfMonth());
			System.out.println(endOfFeb);
			
		} catch(DateTimeParseException e) {
			System.out.println("Oops it doesn't look like your Date/Time is formatted correctly.");
		}
		
	}

	private static void Lesson10() {
		LocalDateTime jan1 = LocalDateTime.of(2020,  1, 1, 13, 30, 0);
		System.out.println(jan1.format(DateTimeFormatter.ofPattern("yyy-MM-dd h:mm:ss a")));
		
		LocalDateTime jan2 = LocalDateTime.of(2020, 1, 2, 9, 0, 0);
		System.out.println("Is jan1 before jan2? " + jan1.isBefore(jan2));
		
		LocalDateTime jan3 = jan1.plusDays(2);
		System.out.println("Is jan3 before jan2? " + jan3.isBefore(jan2));
		
		jan3 = jan3.minus(1, ChronoUnit.DAYS);
		System.out.println(jan3);
	}

	private static void Lesson9() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
	}

}
