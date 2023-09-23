package com.docerscampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		
		// java.lang is by default imported for us/////
		java.lang.String aString = "Hello World";    //
		String anotherString = "Another String";     //
		///////////////////////////////////////////////
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if(name.equals("Chris") && age.equals("35")) {
			System.out.println("Holy cow it's me!");
		}
		else {
			System.out.println("Hello: " + name);
		}
		
		
		scanner.close();
	}
	
}
