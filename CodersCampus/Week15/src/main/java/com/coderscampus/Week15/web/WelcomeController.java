package com.coderscampus.Week15.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("")
	public String getRootWebpage(ModelMap model) {
		// This is what gets returned/resolved when we
		//	return a String inside of a regular Controller GetMapping method
		// /src/main/resources/templates/{fileName}.html
		String firstName = "Chris";
		String lastName = "Flamion";
		model.put("firstName", firstName);
		model.put("lastName", lastName);
		
		return "welcome";
	}
	
}
