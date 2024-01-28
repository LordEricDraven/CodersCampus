package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		Optional<String> fullName = Optional.of("Trevor Page");
		
		System.out.println(fullName);
		
		String trevor = fullName.get();
		
		System.out.println(trevor);
	}

}
