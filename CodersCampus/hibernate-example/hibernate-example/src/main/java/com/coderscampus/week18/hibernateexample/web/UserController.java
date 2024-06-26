package com.coderscampus.week18.hibernateexample.web;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.week18.hibernateexample.domain.User;
import com.coderscampus.week18.hibernateexample.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String getCreateUser (ModelMap model) {
		model.put("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String postCreateUser(User user) {
		System.out.println(user);
		userService.saveUser(user);
		return "redirect:/register";
	}
	
	@GetMapping("/users")
	public String getAllUsers (ModelMap model) {
//		List<User> users = userService.findByUsername("trevor@craftycodr.com");
//		List<User> users = userService.findByNameAndUsername("Trevor Page", "trevor@craftycodr.com");
//		List<User> users = userService.findByCreatedDateBetween(LocalDate.of(2020, 1,2, 0);
		Set<User> users = userService.findAll();
		
		model.put("users", users);
		if(users.size() == 1) {
			model.put("user", users.iterator().next());
		}
		return "users";
	}
	
	@GetMapping("/users/{userId}")
	public String getOneUser (ModelMap model, @PathVariable Long userId) {
//		User user = userService.findExactlyOneUserByUsername("trevor@craftycodr.com");
		User user = userService.findById(userId);
		model.put("users", Arrays.asList(user));
		model.put("user", user);
		return "users";
	}
	
	@PostMapping("/users/{userId}")
	public String PostOneUser (@PathVariable Long userId, User user) {
		userService.saveUser(user);
		return "redirect:/users/"+user.getUserId();
	}

	@PostMapping("/users/{userId}/delete")
	public String deleteOneUser (@PathVariable Long userId) {
			userService.delete(userId);
			return "redirect:/users";
	}
	
}
