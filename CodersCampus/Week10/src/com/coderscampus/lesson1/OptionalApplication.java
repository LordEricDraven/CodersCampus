package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		// Lesson 1
		Optional<String> fullName = Optional.of("Trevor Page");
		System.out.println(fullName);
		String trevor = fullName.get();
		System.out.println(trevor);
		
		// Lesson 2+
		Recipe recipe = new Recipe();
		recipe.setName("Chocolate Chip Cookies");
		recipe.setInstructions("1. Pre-heat oven\n2. Put dough on baking sheet\n3. Cook dough for 15 minutes");

		System.out.println(recipe);
	}

}
