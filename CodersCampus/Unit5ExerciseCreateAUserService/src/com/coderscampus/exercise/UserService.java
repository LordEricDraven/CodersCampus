package com.coderscampus.exercise;

public class UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		String stringInput[] = new String[3];
		
		stringInput[0] = "aUsernameHere";
		stringInput[1] = "aPasswordHere";
		stringInput[2] = "Somebodies Name";

		createUser(stringInput);
	}
	
		
	public static void createUser(String stringInput[]){
		
		String username = stringInput[0];
		String password = stringInput[1];
		String name = stringInput[2];		
		
		User user = new User(username, password, name);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		
		System.out.println("Username: " + username + "    Password: " + password + "    Name: " + name);
	}
	
}
