package com.coderscampus.Week15.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.coderscampus.Week15.web.domain.Person;

@Repository
public class PersonRepository {

	private Map<Integer, Person> people = new HashMap();
	
	public Person save (Person person) {
		people.put(person.getId(), person);
		return person;
	}
	
	public Person findById (Integer personId) {
		return people.get(personId);
	}

	public List<Person> findAll() {
		return people.entrySet()
					 .stream()
					 .map(Entry::getValue)
					 .collect(Collectors.toList());
	}

	public void delete(Integer personId) {
		people.remove(personId);
	}
	
}
