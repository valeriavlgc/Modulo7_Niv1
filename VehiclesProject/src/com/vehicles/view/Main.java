package com.vehicles.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Main {

	public static void main(String[] args) {

		Car car1 = newCar();
		
		System.out.println("Información de ruedas delanteras:");
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		frontWheels = WheelsInformation();
		
		System.out.println("Información de ruedas traseras:");
		List<Wheel> backWheels = new ArrayList<Wheel>();
		backWheels = WheelsInformation();;
		
		try {
			car1.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	public static Car newCar() {
	Scanner sc = new Scanner(System.in);
	String plate, brand, color; 
	int i, counterDig = 0, counterLetter = 0;
	boolean end = true;
	
	do {
		System.out.println("Por favor, introduzca la matricula del coche");
		plate = sc.nextLine();
		
		
		for (i = 0; i < plate.length(); i++) {
			
			if (Character.isDigit(plate.charAt(i))) {
				counterDig += 1;
			} else if (Character.isLetter(plate.charAt(i))) {
				counterLetter += 1;
			}
		}
		
		
		if (counterDig != 4 || counterLetter < 2) {
			end = false;
			System.out.println("Una matrícula debe llevar 4 letras y un mínimo de 2 dígitos.");
		} else {
			end = true;
		}
		  
		  counterDig = 0; counterLetter = 0;

		} while (!end);
	
	
		System.out.println("Introduzca la marca del coche");
		brand = sc.nextLine();
		System.out.println("Introduzca el color del coche");
		color = sc.nextLine();
	
	Car car1 = new Car(plate, brand, color);
	
		return car1;
	}	
	
	public static List<Wheel> WheelsInformation() {
	Scanner sc = new Scanner(System.in);
	String brandWheel; double diameter;
	List<Wheel>twoWheels = new ArrayList<Wheel>();
		
	do {
		
		System.out.println("Introduzca el diámetro de las ruedas (0.4 - 4)");
		diameter = sc.nextDouble();
		sc.nextLine();
		
	} while(diameter < 0.4 || diameter > 4);
	
		System.out.println("Introduzca la marca");
		brandWheel = sc.nextLine();
	
	Wheel newWheel = new Wheel(brandWheel, diameter);
		twoWheels.add(newWheel); 
		twoWheels.add(newWheel);
	
		return twoWheels;
	}	

}
