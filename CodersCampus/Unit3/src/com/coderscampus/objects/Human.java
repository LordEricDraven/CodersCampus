package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (visibility modifier), return type, method name, parameters, scope
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Eye Color: "
				+ eyeColor + ", Weight " + weight;
	}
}
