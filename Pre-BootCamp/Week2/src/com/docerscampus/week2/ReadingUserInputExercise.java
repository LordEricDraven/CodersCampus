package com.docerscampus.week2;

import java.util.Scanner;

public class ReadingUserInputExercise {

	public static void main (String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300.");
		String userInput = scanner.nextLine();
		
		Integer convertedInput = Integer.parseInt(userInput);
		
		
		
		if( convertedInput >= 50 && convertedInput <= 300) {
			System.out.println("Yes!");
		}
		else {
			System.out.println("No!");
		}
	}	
}
