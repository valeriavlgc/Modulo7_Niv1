package com.vehicles.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vehicles.project.Bike;
import com.vehicles.project.Car;
import com.vehicles.project.Vehicle;
import com.vehicles.project.Wheel;

public class VehicleController {

	private static List<Vehicle> vehicles =new ArrayList<Vehicle>();
	
	public static void newVehicle() {
		Scanner sc = new Scanner(System.in);
		String plate, brand, color;
		String tipo;
		int i, counterDig = 0, counterLetter = 0;
		boolean end = true;
		
		System.out.println("Qué tipo de vehiculo desea crear (coche/moto)");
	    tipo = sc.nextLine();
		
		do {
			System.out.println("Por favor, introduzca la matricula");
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
		
		
			System.out.println("Introduzca la marca");
			brand = sc.nextLine();
			System.out.println("Introduzca el color");
			color = sc.nextLine();
			
			
			if (tipo.equalsIgnoreCase("coche")) {
				createCar(plate, brand, color);
		    	
		    } else if (tipo.equalsIgnoreCase("moto")) {
		    	createBike(plate, brand, color);
		    }
	
		}	
	
	
	public static void createCar(String plate, String brand, String color) {
		String tipo = "car";
		
		Car car1 = new Car(plate, brand, color);
				
		System.out.println("Información de ruedas delanteras:");
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		frontWheels = WheelsInformation(tipo);
		
		System.out.println("Información de ruedas traseras:");
		List<Wheel> backWheels = new ArrayList<Wheel>();
		backWheels = WheelsInformation(tipo);
		
		try {
		car1.addWheels(frontWheels, backWheels);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
		
		
		vehicles.add(car1);

		
	}
	
	public static void createBike(String plate, String brand, String color) {
		String tipo = "bike";
		
		Bike bike1 = new Bike(plate, brand, color);
		
		System.out.println("Información de rueda delantera:");
		List<Wheel> frontWheel = new ArrayList<Wheel>();
		frontWheel = WheelsInformation(tipo);
		Wheel frontWheel1 = frontWheel.get(0);
		bike1.addFrontWheel(frontWheel1);
		
		System.out.println("Información de rueda trasera:");
		List<Wheel> backWheel = new ArrayList<Wheel>();
		backWheel = WheelsInformation(tipo);
		Wheel backWheel1 = backWheel.get(0);
		bike1.addBackWheel(backWheel1);
		
		vehicles.add(bike1);
		
	}
	
	
	public static List<Wheel> WheelsInformation(String tipo) {
		Scanner sc = new Scanner(System.in);
		String brandWheel; double diameter;
		List<Wheel>setWheels = new ArrayList<Wheel>();
			
		do {
			
			System.out.println("Introduzca el diámetro(0.4 - 4)");
			diameter = sc.nextDouble();
			sc.nextLine();
			
		} while(diameter < 0.4 || diameter > 4);
		
			System.out.println("Introduzca la marca");
			brandWheel = sc.nextLine();
		
		Wheel newWheel = new Wheel(brandWheel, diameter);
		
		
		if (tipo.equalsIgnoreCase("bike")) {
			
				setWheels.add(newWheel); 
				
		} else if (tipo.equalsIgnoreCase("car")) {
			
		    setWheels.add(newWheel); 
			setWheels.add(newWheel);
		}
		
			return setWheels;
		}	


public void getAllVehicles() {
	
	for (Vehicle e : vehicles) {
		System.out.println(e.toString());
	}
}
	
}
