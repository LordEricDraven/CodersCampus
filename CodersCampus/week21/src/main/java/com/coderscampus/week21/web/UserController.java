package com.coderscampus.week21.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week21.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/exists")
	public Boolean getExists(String username, String password) {
		System.out.println("Username = " + username + ", Password = " + password);
		return true;
	}
	
	@PostMapping("/exists")
	public Boolean postExists(@RequestBody User user) {
		System.out.println("Username = " + user.getUsername() + ", Password = " + user.getPassword());
		return true;
	}
	
	@GetMapping("/validateUsername")
	public Boolean getvalidUsername(String name) {
		return true;
	}
	
	@GetMapping("/validatePassword")
	public Boolean getValidUsername(String password) {
		return true;
	}
}
