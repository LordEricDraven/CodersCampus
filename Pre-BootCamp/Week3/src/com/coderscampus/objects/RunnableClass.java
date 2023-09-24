package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's an instantiation of a Class
		
		// Data type, variable name, assignment operation
//		Random random = new Random();
//		
//		for (int i = 0; i < 20; i = i + 1) {
//			System.out.println("Random number is " + random.nextInt(10));
//		}
		
		// Call the no arg constructor
		Human someOtherHuman = new Human();
		
		// Call the 4 arg constructor
		Human trevorPage = new Human("male", "5'10\"", "160", "brown");
				
		System.out.println(trevorPage.getInfo());
		
		Human elonMusk = new Human("male", "6'1\"", "190", "blue");
		
		System.out.println(elonMusk.getInfo());
		
		Human christinaPage = new Human("female", "5'5\"", "130", "brown");
				
		System.out.println(christinaPage.getInfo())
		;
	}

}
