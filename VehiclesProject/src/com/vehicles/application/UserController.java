package com.vehicles.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.vehicles.project.Driver;
import com.vehicles.project.License;
import com.vehicles.project.Owner;

public class UserController {
	
	//private static List<Person> users =new ArrayList<Person>();
	
	public static Owner createOwner() throws ParseException {
	Scanner sc = new Scanner(System.in);
	String name, surname, garage, insurance, dateText;
	Date birthdate;
	License license;
	
		System.out.println("Introduzca nombre");
		name = sc.nextLine();
		System.out.println("Introduzca apellido");
		surname = sc.nextLine();
		System.out.println("Introduzca fecha de nacimiento");
		dateText = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		birthdate = sdf.parse(dateText);
		license = createLicense();
		System.out.println("¿Tiene garaje?");
		garage = sc.nextLine();
		System.out.println("¿Tiene seguro?");
		insurance = sc.nextLine();
		
		Owner owner = new Owner(name, surname, birthdate, license, garage, insurance);
		
		return owner;
	}
 	
	public static Driver createDriver() throws ParseException {
	Scanner sc = new Scanner(System.in);
	String name, surname, garage, insurance, dateText;
	Date birthdate;
	License license;
	
	        System.out.println("****Datos del conductor****");
			System.out.println("Introduzca nombre");
			name = sc.nextLine();
			System.out.println("Introduzca apellido");
			surname = sc.nextLine();
			System.out.println("Introduzca fecha de nacimiento");
			dateText = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			birthdate = sdf.parse(dateText);
			license = createLicense();
		
			
		Driver driver = new Driver(name, surname, birthdate, license);	
		return driver;
		
	}
	
    public static License createLicense() throws ParseException {
    Scanner sc = new Scanner(System.in);
    String id, fullName, expiringText;
    char type;
    Date expiringDate;
    
    System.out.println("Introduzca su ID");
    id = sc.nextLine();
    System.out.println("Introduzca el tipo de licencia que posee");
    type = sc.next().charAt(0);
    System.out.println("Introduzca su nombre completo");
    fullName = sc.nextLine();
    System.out.println("Introduzca la fecha de caducidad del ID");
    expiringText = sc.nextLine();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	expiringDate = sdf.parse(expiringText);
    
    License license = new License (id, type, fullName, expiringDate);	
    
    	return license;
    }
        
}
