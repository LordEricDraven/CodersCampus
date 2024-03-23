package com.coderscampus.Week15.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Week15.service.PersonService;
import com.coderscampus.Week15.web.domain.Person;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public String getPeople(ModelMap model) {
		// This is what gets returned/resolved when we
		//	return a String inside of a regular Controller GetMapping method
		// /src/main/resources/templates/{fileName}.html
		Person person = new Person();
		
		model.put("person", person);
		
		return "people";
	}
	
	@GetMapping("/persons/{personId}")
	public String getPerson(@PathVariable Integer personId, ModelMap model) {
		Person person = personService.findById(personId);
		model.put("person", person);
		return "people";
	}
	
	@PostMapping("/persons")
	public String postPeople (Person person) {
		Person savedPerson = personService.save(person);
		System.out.println(savedPerson);
		return "redirect:/persons";
	}
	
	@PostMapping("/persons/{personId}")
	public String postPerson (Person person) {
		Person savedPerson = personService.save(person);
		System.out.println(savedPerson);
		return "redirect:/persons/" + savedPerson.getId();
	}
	
}
