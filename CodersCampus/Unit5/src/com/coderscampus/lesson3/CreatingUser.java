package com.coderscampus.lesson3;

public class CreatingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PojoUser newUser = new PojoUser();
		newUser.setUsername("LordEricDraven");
		System.out.println("The username is: " + newUser.getUsername());
		newUser.setPassword("P@$$w0rd!");
		System.out.println("The password is: " + newUser.getPassword());
		newUser.setName("Chris");
		System.out.println("The name is: " + newUser.getName());
		
		
		
	}

}
