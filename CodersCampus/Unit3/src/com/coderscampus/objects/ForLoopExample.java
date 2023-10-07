package com.coderscampus.objects;

public class ForLoopExample {

	void forLoopExample () {
			//init; termination condition; increment
			for(int i = 1; i <= 100; i = i + 1) {
				System.out.print(i + ": ");
				System.out.println(i * i);
			}
			
			System.out.println("done");
		}
}
