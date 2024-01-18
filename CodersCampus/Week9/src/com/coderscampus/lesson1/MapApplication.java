package com.coderscampus.lesson1;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {

	public static void main(String[] args) {
		// Key = SSN (SIN)
		// Value = Person's Name
		
		Map<Integer, String> people = new HashMap<>();
		
		// HashMaps store data as Key / Value pairs
		//							K / V
		
		people.put(111111111, "Trevor Page");								// Create
		people.put(222222222, "Josh Someone");
		people.put(333333333, "Elon Musk");
		people.put(444444444, "Jane Doe");
		people.put(555555555, "Jeff Bezos");
		people.put(555555555, "John Doe");									// Update
		
		
		System.out.println("Get data using an invalid Key: ");
		System.out.println(people.get(123456789));							// Read
		
		System.out.println("Get data using a valid Key: ");
		System.out.println(people.get(333333333));
		
		System.out.println("Get data using a valid Key: ");
		System.out.println(people.get(555555555));
		
		people.remove(555555555);											// Delete
		
		System.out.println("Get data using an invalid Key: ");
		System.out.println(people.get(555555555));
		
		
		
	}

}
