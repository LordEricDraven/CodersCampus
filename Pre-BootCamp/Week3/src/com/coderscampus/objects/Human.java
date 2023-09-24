package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	Human () {
		System.out.println("A human is being created");
	}
	
	Human (String gender, String height, String weight, String eyeColor){
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;

	}
	
	
	// (visibility modifier), return type, method name, parameters, scope
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + 
			   ", Eye Color: " + eyeColor + ", Weight: " + weight;
	}
	
	
}
