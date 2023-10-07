package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's an instantiation of a class
		
		// Data type, variable name, assignment operation
		int someNumber = 39;
		
		Human trevorPage = new Human();
		
		trevorPage.setProperties("male", "5'10\"",  "160", "brown");

		System.out.println(trevorPage.getInfo());
		
		Human elonMusk = new Human();
		
		elonMusk.setProperties("male", "6'1\"", "190", "blue");
		
		System.out.println(elonMusk.getInfo());
		
		Human christinaPage = new Human();
		
		christinaPage.setProperties("female", "5'5\"", "130", "brown");
		
		System.out.println(christinaPage.getInfo());
	}

}
