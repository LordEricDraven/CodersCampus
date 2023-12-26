package com.coderscampus.lesson5;

import java.util.Arrays;
import java.util.Comparator;

public class SortingApplication {

	public static void main(String[] args) {
		String[] names = new String[5];

		names[0] = "Chris Flamion";
		names[1] = "Amanda Flamion";
		names[2] = "Lydia Flamion";
		names[3] = "Elon Musk";
		names[4] = "Trevor Page";
		System.out.println("Pre-sorting");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----");
		
		Arrays.sort(names);
		System.out.println("Post-sorting");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----");
		
		Person[] people = new Person[5];
		
		people[0] = new Person("Chris Flamion", 71);
		people[1] = new Person("Lydia Flamion", 49);
		people[2] = new Person("Amanda Flamion", 61);
		people[3] = new Person("Trevor Page", 70);
		people[4] = new Person("Melanie Yoder", 61);
		Arrays.sort(people);
		
		for(Person person : people) {
			System.out.println(person.getName());
		}
		System.out.println("-----");
		Arrays.sort(people, new PersonHeightComparator());
	
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getHeight() + " inches tall.");
		}
		
		System.out.println("-----");
		Arrays.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				return person2.getHeight().compareTo(person1.getHeight());
			}
			
		});
	
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getHeight() + " inches tall.");
		}
		
	}

}
