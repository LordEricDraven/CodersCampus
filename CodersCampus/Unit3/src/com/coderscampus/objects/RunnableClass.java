package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's an instantiation of a class
		
		// Data type, variable name, assignment operation
		int someNumber = 39;
		
		Human trevorPage = new Human();
		
		trevorPage.eyeColor = "brown";
		trevorPage.gender = "male";
		trevorPage.height = "5'10\"";
		trevorPage.weight = "160";
		
		System.out.println(trevorPage);
		
		Human elonMusk = new Human();
		
		elonMusk.eyeColor = "blue";
		elonMusk.gender = "male";
		elonMusk.height = "6'1\"";
		elonMusk.weight = "190";
		
		System.out.println(elonMusk);
	}

}
