package com.coderscampus.lesson7;

public class regExApplication {

	public static void main(String[] args) {
		//"valid" email address: fake.email@gmail.com
		//invalid email address: trevorcraftycodr.com
		//invalid email address: trevor@craftycodr.thisisntarealdomain
		//valid email address: trevor@craftycodr.com
		//valid email address: trevor-page.2@gmail.com
		//valid email address: Trevor@CraftyCodr.com
		
		
		inputMatchesRegExPattern("fake.email@gmail.com");
		inputMatchesRegExPattern("trevorcraftycodr.com");
		inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");
		inputMatchesRegExPattern("trevor@craftycodr.com");
		inputMatchesRegExPattern("trevor-page.2@gmail.com");
		inputMatchesRegExPattern("Trevor@CraftyCodr.com");
		
	}

	private static void inputMatchesRegExPattern(String input) {
		boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$");
		
		System.out.println("For Input " + input + ", match found = " + matchFound);
	}

}
