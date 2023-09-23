package com.docerscampus.week2;

import java.util.Scanner;

public class ReadingUserInputExercise {

	public static void main (String[] args) {
	
		GetNumber userNumber = new GetNumber();
		
		//System.out.println("Type a number between 50 and 300.");
		//userNumber.getInput();
		//Integer convertedInput = Integer.parseInt(userInput);
		
		Integer methodOutput = userNumber.getInput();
		
		if( methodOutput >= 50 && methodOutput <= 300) {
			System.out.println("The number you typed in was: " + methodOutput);
		}
		else if( methodOutput == 0){
			System.out.println("The number you typed in was: null");
		}
		else {
			System.out.println("How did we get here?");
		}
		
		
	}	
}
