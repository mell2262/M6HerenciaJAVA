package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	/*Modifica el proyecto anterior añadiendo los métodos necesarios a Bike, 
	 * de manera que se pueda añadir ruedas delanteras y traseras.*/
	

	@Override
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		if (frontWheels.size() != 1||backWheels.size() != 1)
			throw new Exception();
		wheels.add(frontWheels.get(0));
		wheels.add(backWheels.get(0));
	}
}
