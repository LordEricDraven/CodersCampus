package com.coderscampus.lesson5;

public class EnumApplication {
	public static void main(String[] args) {
		User user = new User("Chris", "asdf;lkj");
		
		System.out.println(user);
		
		if ("A".equals(user.getStatus().getValue())) {
			System.out.println("User is Active");
		}
		
		if ("ACTIVE".equals(user.getStatus().name())){
			System.out.println("User is Active");
		}
		
		Card.ACE.getCardValue();
		System.out.println("Ace primary value: " + Card.ACE.getCardValue());
		System.out.println("Ace secondary value: " + Card.ACE.getCardSecondaryValue());
		
	}
}
