package com.qa.OOP;

public class Vehicle {
	private int wheels;
	private int weight;
	private int topSpeed;
	
	public Vehicle(int wheels, int weight, int topSpeed) {
		this.wheels = wheels;
		this.weight = weight;
		this.topSpeed = topSpeed;
	}

	public Vehicle() {
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	
	
	
}
