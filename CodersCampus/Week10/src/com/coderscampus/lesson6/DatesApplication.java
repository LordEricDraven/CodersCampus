package com.coderscampus.lesson6;

import java.util.Date;

public class DatesApplication {

	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
		
		java.sql.Date jan011970 = new java.sql.Date(86400000);
		System.out.println(jan011970);
	}

}
