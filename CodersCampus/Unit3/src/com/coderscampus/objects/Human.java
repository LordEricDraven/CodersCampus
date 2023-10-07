package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// Call the no arg constructor
	Human () {
		System.out.println("A human is being created");
	}
	
	// Call the 4 arg constructor
	Human (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	// (visibility modifier), return type, method name, parameters, scope
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Eye Color: "
				+ eyeColor + ", Weight " + weight;
	}
	
}
