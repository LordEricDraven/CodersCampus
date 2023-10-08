package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer guess;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100:");
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

		
	}

