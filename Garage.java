package com.qa.OOP;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public Garage() {
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removeVehicle(int ID) {
		vehicles.remove(ID);
	}
	
	public void removeVehicles(String type) {
		
		if(type.equals("Car")) {
			for(int i = 0; i < vehicles.size(); i ++) {
				if(vehicles.get(i) instanceof Car) {
					vehicles.remove(i);
				}
			}
		}
		
		if(type.equals("Van")) {
			for(int i = 0; i < vehicles.size(); i ++) {
				if(vehicles.get(i) instanceof Van) {
					vehicles.remove(i);
				}
			}
		}
		
		if(type.equals("Motorbike")) {
			for(int i = 0; i < vehicles.size(); i ++) {
				if(vehicles.get(i) instanceof Motorbike) {
					vehicles.remove(i);
				}
			}
		}
	}
	
	public void emptyGarage() {
		vehicles = new ArrayList<>();
	}
	
	
	public double garageCost() {
		double total=0;
		
		for(int i = 0; i < vehicles.size(); i ++) {
			if(vehicles.get(i) instanceof Car) {
				total += ((Car)vehicles.get(i)).getValue();
			}
			
			if(vehicles.get(i) instanceof Van) {
				total += ((Van)vehicles.get(i)).getValue();
			}
			
			if(vehicles.get(i) instanceof Motorbike) {
				total += ((Motorbike)vehicles.get(i)).getValue();
			}
		}
		
		return total;
	}
	
	

}
