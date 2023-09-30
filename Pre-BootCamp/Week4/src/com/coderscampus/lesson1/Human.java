package com.coderscampus.lesson1;

public class Human {
	// class variables
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable
	int age;
	
	public String getStageOfLife () {
		if(age < TEENAGER_AGE) {
			return "Child";
		}
		else if (age < 19) {
			return "Teenager";
		}
		else if (age < 65) {
			return "Adult";
		}
		else {
			return "Senior";
		}
	}
	
}
