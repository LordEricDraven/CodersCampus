package com.coderscampus.lesson1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {
	
	public static void main(String[] args) {
		
		Set<Person> people = new HashSet<>();
		
		people.add(new Person(111111111, "Trevor", "Page"));
		people.add(new Person(111111111, "Trevor2", "Page2"));
		people.add(new Person(111111112, "Trevor2", "Page2"));
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		
		//example1();
		
		}




	private static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>(); // LinkedHashSet - Sets do not allow duplicates & LinkedHashSet keeps items in order that they were added
		
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(1));
		
		printSetToConsole(uniqueNumbers);
		
		Set<String> uniqueNames = new HashSet<>(); // HashSet DOES NOT keep items in order that they were added.
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Elon Musk");
		uniqueNames.add("Jane Doe");
		uniqueNames.add("Josh Someone");
		uniqueNames.add("Chris Flamion");
		
		printHashSetToConsole(uniqueNames);
	}
	
	
	
	
	private static void printSetToConsole(Set<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}
		
	private static void printHashSetToConsole(Set<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}
	
}
