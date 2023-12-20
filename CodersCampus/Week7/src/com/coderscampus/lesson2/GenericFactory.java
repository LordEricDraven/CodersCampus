package com.coderscampus.lesson2;

public abstract class GenericFactory {

	protected Integer totalCapacity;
	
	public abstract Product build(Part[] parts);
	
	public Integer getTotalCapacity() {
		return totalCapacity;
	}
}
