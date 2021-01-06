package com.qa.OOP;

public class Van extends Vehicle{
	
	private int carryCapacity;
	
	public Van(int weight, int topSpeed, int carryCapacity) {
		super(4, weight, topSpeed);
		this.carryCapacity = carryCapacity;
	}

	public Van(int carryCapacity) {
		this.carryCapacity = carryCapacity;
		setWheels(4);
	}

	public Van() {
		setWheels(4);
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	public double getValue() {
		return (getTopSpeed() * 10) + (getWeight() * 30) + (getCarryCapacity()*50); 
	}

}
