package com.coderscampus.lesson2;

public class Frame implements Part{

	public Frame() {
		System.out.println("A Car's Frame is being constructed.");
	}
	
	
	@Override
	public Integer getSize() {
		return 10;
	}

	@Override
	public Integer getBuildTime() {
		return 10;
	}

}
