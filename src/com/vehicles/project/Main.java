package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*Nos piden crear una clase Main que realice los siguientes pasos:

1) Pedir al usuario la matr�cula del coche, la marca y su color.
2) Crear el coche con los datos anteriores.
3) A�adirle dos ruedas traseras pidiendo al usuario la marca y el di�metro.
4) A�adirle dos ruedas delanteras pidiendo al usuario la marca y el di�metro.

*/
		Scanner scan=new Scanner(System.in);
		
		System.out.println("introduzca matricula, marca y color");
		String plate=scan.next();
		String brand=scan.next();
		String color=scan.next();
////////////		
		Car coche=new Car(plate, brand, color);
///////////////		
		System.out.println("introduzca marca y diametro para ruedas traseras");
		String brandWheel=scan.next();
		double diameter=scan.nextDouble();
		
		List<Wheel> listWheel= new ArrayList<Wheel>();
		listWheel.add(new Wheel(brandWheel, diameter));
		listWheel.add(new Wheel(brandWheel, diameter));
		coche.addTwoWheels(listWheel);
///////////////
		System.out.println("introduzca marca y diametro para ruedas delanteras");
		String brandWheel2=scan.next();
		double diameter2=scan.nextDouble();
		
		List<Wheel> listWheel2= new ArrayList<Wheel>();
		listWheel2.add(new Wheel(brandWheel2, diameter2));
		listWheel2.add(new Wheel(brandWheel2, diameter2));
		coche.addTwoWheels(listWheel2);
		
		
	}

}
