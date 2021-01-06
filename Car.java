package com.qa.OOP;

public class Car extends Vehicle {
	
	private String carMake = "";
	private String colour = "";
	
	public Car(int weight, int topSpeed, String carMake, String colour) {
		super(4, weight, topSpeed);
		this.carMake = carMake;
		this.colour = colour;
	}

	public Car(String carMake, String colour) {
		super();
		this.carMake = carMake;
		this.colour = colour;
		setWheels(4);
	}

	public Car() {
		setWheels(4);
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double getValue() {
		return (getTopSpeed() * 150) + (getWeight() * 20); 
	}
	
	
	
	
	
	
}
