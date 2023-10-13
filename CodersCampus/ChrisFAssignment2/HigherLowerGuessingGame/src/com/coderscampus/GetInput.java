package com.coderscampus;

import java.util.Scanner;

public class GetInput {

	static Integer guesses = 4;
	static Integer guess;
	
	
	
	
	static void getUserInput () {
		if (guesses >= 1) {
			guesses = guesses - 1;
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			
			Integer convertedInput = Integer.parseInt(userInput);
			
		while (convertedInput <= 0 || convertedInput >= 101) {
			scanner = new Scanner(System.in);
			System.out.println("Your guess is not between 1 and 100, please try again:");
			userInput = scanner.nextLine();
			
			convertedInput = Integer.parseInt(userInput);
		}
		
		guess = convertedInput;
		
		CheckAnswer.playerGuess(guess);
		}
		else if (guesses <= 0) {
			System.out.println("You lose, the number to guess was " + CheckAnswer.answer);
		}
	}
}
