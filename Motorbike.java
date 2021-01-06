package com.qa.OOP;

public class Motorbike extends Vehicle {
	
	private boolean offRoad;
	
	private String make;
	
	public Motorbike(int weight, int topSpeed, boolean offRoad, String make) {
		super(2, weight, topSpeed);
		this.offRoad = offRoad;
		this.make = make;
	}

	public Motorbike(boolean offRoad, String make) {
		this.offRoad = offRoad;
		this.make = make;
		setWheels(2);
	}
	
	public Motorbike() {
		setWheels(2);
	}
	
	public boolean isOffRoad() {
		return offRoad;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public double getValue() {
		if(isOffRoad()) {
			return (getTopSpeed() * 120) + (getWeight() * 35); 
		}
		else {
			return (getTopSpeed() * 120) + (getWeight() * 40) + 500;
		}
	}
	
	
	
	

}
