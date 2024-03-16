package com.coderscampus.Week14;

import org.junit.jupiter.api.Test;

import com.coderscampus.Week14.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {

	/**
	 * JSON
	 * JavaScript Object Notation
	 * A simple String based way to notate data
	 *  - Key : Value pairs
	 *  - Key : Value pairs are separated by commas
	 *  - Objects are represented by { }
	 *  - Arrays are represented by [ ]
	 *  
	 *  Important note: JSON is NOT tied to JavaScript... it is 
	 *  	language agnostic (meaning it'll work in any language)
	 * 
	 * 	Person: name, age, gender
	 * 
	 * 	{
	 * 		"name" : "Trevor Page", 
	 * 		"age" : 37,
	 * 		"gender" : "Male"
	 * 	}	
	 * 
	 * 	List<Person> people
	 * 
	 * 	[
	 * 		{
	 * 			"name" : "Trevor Page", 
	 * 			"age" : 37,
	 * 			"gender" : "Male"
	 * 		},
	 * 		{
	 * 			"name" : "Jane Doe", 
	 * 			"age" : 29,
	 * 			"gender" : "Female"
	 * 		}
	 * 	]
	 * 
	 * 
	 * 	XML
	 * 
	 * 	<people>
	 * 		<person>
	 * 			<name>Trevor Page</name>
	 * 			<age>37</age>
	 * 			<gender>Male</gender>
	 * 		</person>
	 * 		<person>
	 * 			<name>Jane Doe</name>
	 * 			<age>29</age>
	 * 			<gender>Female</gender>
	 * 		</person>
	 * 	</people>
	 */
	
	@Test
	public void convertJsonStringToJavaObj() {
		String jsonString = "{\"name\" : \"Trevor Page\", \"age\" : 37, \"gender\" : \"Male\"}";
 		
		ObjectMapper mapper = new ObjectMapper();
		try {
			Person person = mapper.readValue(jsonString, Person.class);
			celebrateBirthday(person);
			
			System.out.println(mapper.writeValueAsString(person));
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void celebrateBirthday(Person person) {
		person.setAge(person.getAge()+1);
	}
}
