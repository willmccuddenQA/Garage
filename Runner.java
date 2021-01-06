package com.qa.OOP;

public class Runner {
	
	public static void main(String[] args) {
		Car car1 = new Car(500,100,"VW","Black");
		Car car2 = new Car(650,120,"Ford","Blue");
		Motorbike moto1 = new Motorbike(200,130,false,"Kawasaki");
		Motorbike moto2 = new Motorbike(150,100,true,"Honda");
		Van van1 = new Van(800,90,230);
		Van van2 = new Van(700,110,300);
		
		Garage garage = new Garage();
		
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(moto1);
		garage.addVehicle(moto2);
		garage.addVehicle(van1);
		garage.addVehicle(van2);
		
		System.out.println(garage.garageCost());
		garage.emptyGarage();
		System.out.println(garage.garageCost());
	}
	

}
