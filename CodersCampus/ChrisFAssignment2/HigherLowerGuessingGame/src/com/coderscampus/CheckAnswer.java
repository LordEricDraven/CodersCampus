package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class CheckAnswer {

	
	
	static Random random = new Random();
	static Integer answer = random.nextInt(100) + 1;
	
	
	public static void playerGuess (Integer guess) {

			if(guess <= 0 || guess >= 101) {
				System.out.println("How did we get here?");
			}
			else if (guess == answer) {
				System.out.println("You win!");
			}
			else if (guess > answer) {
				System.out.println("Please pick a lower number.");
				GetInput.getUserInput();
			}
			else if (guess < answer) {
				System.out.println("Please pick a higher number.");
				GetInput.getUserInput();
			}
			else {
				System.out.println("What happened here?");
			}
		}
}
