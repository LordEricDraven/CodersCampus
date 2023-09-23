package com.docerscampus.week2;

import java.util.Scanner;

public class GetNumber {

	Integer userInput;
	Integer _methodOutput;
	
	
	Integer getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300.");
		String userInput = scanner.nextLine();
		
		Integer convertedInput = Integer.parseInt(userInput);
		
		if (convertedInput >= 50 && convertedInput <= 300) {
			_methodOutput = convertedInput;
			return _methodOutput;
		}
		else {
			return 0;
		}
		
	}
	
	
	
}
