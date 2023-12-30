package com.coderscampus.lesson7;

public class regExApplication {

	public static void main(String[] args) {
		//"valid" email address: fake.email@gmail.com
		//invalid email address: trevorcraftycodr.com
		//invalid email address: trevor@craftycodr.thisisntarealdomain
		//valid email address: trevor@craftycodr.com
		//valid email address: trevor-page.2@gmail.com
		//valid email address: Trevor@CraftyCodr.com
		
		String input = "fake.email@gmail.com";
		boolean matchFound = input.matches("[a-z]+.?[a-z]+@[a-z]+.[a-z]{1,5}");
		
		System.out.println(matchFound);
	}

}
