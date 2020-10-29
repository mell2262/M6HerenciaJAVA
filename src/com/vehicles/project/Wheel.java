package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		this.brand = brand;
		if ((diameter<0.4)||(diameter>4)) {//		2) Un diámetro de la rueda debe ser superior a 0.4 e inferior a 4
			throw new Exception();
		}
		this.diameter = diameter;
	}
}
