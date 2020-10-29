package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		Pattern pat = Pattern.compile("^\\d{4}[A-Z]{3}");	//	1) Una matrícula debe tener 4 números y tres letras.
		Matcher mat = pat.matcher(plate);
		if (!mat.matches()) {
			throw new Exception();
		}
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
}
