package com.coderscampus.Week15.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Week15.service.PersonService;
import com.coderscampus.Week15.web.domain.Person;

@Controller
public class WelcomeController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("")
	public String getRootWebpage(ModelMap model) {
		// This is what gets returned/resolved when we
		//	return a String inside of a regular Controller GetMapping method
		// /src/main/resources/templates/{fileName}.html
		Person person = new Person();
		
		model.put("person", person);
		
		return "welcome";
	}
	
	@PostMapping("")
	public String postRootWebpage(Person person) {
		Person savedPerson = personService.save(person);
		System.out.println(savedPerson);
		return "redirect:/";
	}
	
}
