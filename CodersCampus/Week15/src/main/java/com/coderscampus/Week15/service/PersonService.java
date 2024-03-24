package com.coderscampus.Week15.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Week15.repository.PersonRepository;
import com.coderscampus.Week15.web.domain.Person;

@Service
public class PersonService {

	Integer personId = 1;
	
	@Autowired
	PersonRepository personRepo;
	
	public Person save(Person person) {
		if(person.getId() == null)
			person.setId(personId++);
		
		return personRepo.save(person);
		
	}

	public Person findById(Integer personId) {
		return personRepo.findById(personId);		
	}

	public List<Person> findAll() {
		return personRepo.findAll();
	}

	public void delete(Integer personId) {
		personRepo.delete(personId);
	}
	
	
}
