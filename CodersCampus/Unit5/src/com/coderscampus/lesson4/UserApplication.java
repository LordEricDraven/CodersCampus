package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		
		// Arrays allow us to store multiple objects (or primitives) into One variable - Note: an Array is one type of Data Structure
		
		// [0], [1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11], [12], [13], [14] 
		User[] users = new User[15];
		
		for (int i = 0; i < 15; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1));
		}
		
		System.out.println(users);
		
	}

}
