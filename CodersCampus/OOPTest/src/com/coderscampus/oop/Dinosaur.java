package com.coderscampus.oop;

public class Dinosaur {

	String weight;
	String color;
	String length;
	
	String getDetails() {
		return "Weight: " + weight + "       Color: " + color + "       Length: " + length;
	}
	
	void setDetails(String weight, String color, String length) {
		this.weight = weight;
		this.color = color;
		this.length = length;
	}
}
