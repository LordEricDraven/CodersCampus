package com.coderscampus.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> chores = new ArrayList<String>();
		
		
		System.out.println("Array List created");
		
		printArrayListToConsole(chores);
		
		addChoreToList(chores);
		
		printArrayListToConsole(chores);
		
		removeChoreFromList(chores);
		
		printArrayListToConsole(chores);
		
		replaceChoreOnList(chores);
		
		printArrayListToConsole(chores);
		
		
	}
	
	private static List<String> addChoreToList(List<String> chores) {
		chores.add("Wash Dishes");
		chores.add("Fold Laundry");
		chores.add("Code For an Hour");
			
		return chores;
	}
	
	private static List<String> removeChoreFromList(List<String> chores) {
		chores.remove("Wash Dishes");
		return chores;
	}
	
	private static List<String> replaceChoreOnList(List<String> chores) {
		chores.remove("Code For an Hour");
		chores.add("Code All Day");
		return chores;
	}
	
	private static void printArrayListToConsole(List<String> chores) {
		for (String chore : chores) {
			System.out.println(chore);
		}
		System.out.println("-------------");
	}

}
