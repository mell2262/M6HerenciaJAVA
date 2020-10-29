package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {


		Scanner scan=new Scanner(System.in);
		
//////////// 1) Pedir al usuario la matrícula del coche, la marca y su color.
		System.out.println("introduzca matricula, marca y color");
		String plate=scan.next();
		String brand=scan.next();
		String color=scan.next();
		
////////////		2) Crear el coche con los datos anteriores.
		Car coche=new Car(plate, brand, color);
		
///////////////		3) Añadirle dos ruedas traseras pidiendo al usuario la marca y el diámetro.
		System.out.println("introduzca marca y diametro para ruedas traseras");
		
		
		
		String brandWheel=scan.next();
		double diameter=scan.nextDouble();
		List<Wheel> listWheel= new ArrayList<Wheel>();
		listWheel.add(new Wheel(brandWheel, diameter));
		listWheel.add(new Wheel(brandWheel, diameter));
		coche.addTwoWheels(listWheel);
		
///////////////4) Añadirle dos ruedas delanteras pidiendo al usuario la marca y el diámetro.
		System.out.println("introduzca marca y diametro para ruedas delanteras");
		String brandWheel2=scan.next();
		double diameter2=scan.nextDouble();
		
		List<Wheel> listWheel2= new ArrayList<Wheel>();
		listWheel2.add(new Wheel(brandWheel2, diameter2));
		listWheel2.add(new Wheel(brandWheel2, diameter2));
		coche.addTwoWheels(listWheel2);
		
		
	}

}
