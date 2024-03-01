package com.coderscampus.lesson1;

public class TaskDto {

	private Double value;
	private boolean finished = false;

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TaskDto [value=" + value + ", finished=" + finished + "]";
	}
	
}
