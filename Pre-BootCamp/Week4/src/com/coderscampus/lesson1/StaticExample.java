package com.coderscampus.lesson1;

public class StaticExample {

	// static = belongs to the class, not an instance of the class
	// non-static = belongs to the instance of the class (not the class itself)
	int someNumber = 10;
	
	public static void main(String[] args) {
		StaticExample staticObject = new StaticExample();
		
		if (staticObject.someNumber > 11) {
			System.out.println("say something");
		}
		
		Human aChild = new Human();
		aChild.age = 12;
		System.out.println(aChild.getStageOfLife());
		
		Human anAdult = new Human ();
		anAdult.age = 19;
		System.out.println(anAdult.getStageOfLife());
	}

}
