package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;

public class StreamTutorial {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		populatePeopleData(people);
		
		
		List<Person> intermediateList = new ArrayList<>();
		List<String> intermediateList2 = new ArrayList<>();
		for (Person person : people) {
			if (person.getSsn() > 10) {
				intermediateList.add(person);
			}
		}
		
		for (Person person : intermediateList) {
			intermediateList2.add(person.getFirstName());
		}
		
		for (String firstName : intermediateList2) {
			System.out.println(firstName);
		}
		
		System.out.println();
		
		
		// **********************John1 Doe1, ssn = 0 -> false
		// **********************John2 Doe2, ssn = 1 -> false
		// **********************John3 Doe3, ssn = 2 -> false
		// ...
		// John12 Doe12, ssn = 11 -> true
		// John13 Doe13, ssn = 12 -> true
		// John14 Doe14, ssn = 13 -> true
		// ...
		// John20 Doe20, ssn = 19 -> true
		people.stream() // Stream<List<Person>>
						// intermediate operations: filter, map, flatMap, distinct
					// inputs: Person[John1] --> Person[John20]
					// outputs: Person[John12] --> Person[John20]
			  .filter(person -> person.getSsn() > 10)
			  // inputs: Person[John12] --> Person[John20]
			  // outputs: John12 --> John20
			  .map(person -> person.getFirstName())
			  .forEach(System.out::println); // terminal: forEach, Collect, Reduce
		
	}
	
	private static void populatePeopleData(List<Person> people) {
		for (int i = 0; i < 20; i++) {
			Person person = new Person(i, "John" + (i +1), "Doe" + (i + 1));
			people.add(person);
		}
	}

}
