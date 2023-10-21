package com.coderscampus.lesson8;

public class ExceptionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String someString = null;
		
		try {
			String[] stringArray = someString.split(",");			
			System.out.println(stringArray);
		}
		catch(NullPointerException e) {
			System.out.println("oops, there was a null pointer exception");
		}
		
		
	}

}
