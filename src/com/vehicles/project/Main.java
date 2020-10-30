package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
//////////////0) Preguntar al usuario si desea crear un coche o una moto.
		System.out.println("quiere un auto(1) o moto(2)");
		String selection=scan.next();
		
//////////// 1) Pedir al usuario la matrícula del coche, la marca y su color.
		System.out.println("introduzca matricula, marca y color");
		String plate = scan.next();
		String brand = scan.next();
		String color = scan.next();

////////////2) Crear el vehículo con los datos * anteriores..
		switch (selection) {
		case "1":
			Car coche = new Car(plate, brand, color);
			
			System.out.println("introduzca marca y diametro para ruedas traseras");
			String brandWheels = scan.next();
			double diameters = scan.nextDouble();
			List<Wheel> listWheels = new ArrayList<Wheel>();
			listWheels.add(new Wheel(brandWheels, diameters));
			listWheels.add(new Wheel(brandWheels, diameters));
			
			System.out.println("introduzca marca y diametro para ruedas delanteras");
			String brandWheels2 = scan.next();
			double diameters2 = scan.nextDouble();
			List<Wheel> listWheels2 = new ArrayList<Wheel>();
			listWheels2.add(new Wheel(brandWheels2, diameters2));
			listWheels2.add(new Wheel(brandWheels2, diameters2));
			
			coche.addWheels(listWheels, listWheels2);
			break;
		case "2":
			Bike moto = new Bike(plate, brand, color);
			
			System.out.println("introduzca marca y diametro para rueda trasera");
			String brandWheel = scan.next();
			double diameterB = scan.nextDouble();
			List<Wheel> listWheel = new ArrayList<Wheel>();
			listWheel.add(new Wheel(brandWheel, diameterB));
			
			System.out.println("introduzca marca y diametro para ruedas delanteras");
			String brandWheel2 = scan.next();
			double diameterB2 = scan.nextDouble();
			List<Wheel> listWheel2 = new ArrayList<Wheel>();
			listWheel2.add(new Wheel(brandWheel2, diameterB2));
			
			moto.addWheels(listWheel, listWheel2);			
			break;
		default:
			break;
		}
	}

}
