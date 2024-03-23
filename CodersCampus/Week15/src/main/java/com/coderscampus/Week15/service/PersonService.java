package com.coderscampus.Week15.service;

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
	
	
}
