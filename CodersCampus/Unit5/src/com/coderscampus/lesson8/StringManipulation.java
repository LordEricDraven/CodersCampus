package com.coderscampus.lesson8;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(String arg : args) {
			System.out.println(arg);
			// 1,2,3,4,5 -> [0]="1", [1]="2", [2]="3", [3]="4", [4]="5", 
			String[] numbersArray = arg.split(",");
			for(String number : numbersArray) {
				System.out.println(number);
			}

		}
		
		
		
	}

}
