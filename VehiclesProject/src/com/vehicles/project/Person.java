package com.vehicles.project;

import java.util.Date;

public class Person {

	protected String name;
	protected String surname;
	protected Date birthdate;
	protected License license;
	
	
	public Person(String name, String surname, Date birthdate, License license) {
		this.name      = name;
		this.surname   = surname;
		this.birthdate = birthdate;
		this.license   = license;
	}
	
public License getLicense() {
		
		return license;
}	
	
public void checkLicense(char type, String tipo) throws Exception {
		
		if (tipo.equalsIgnoreCase("coche") &&  (type == 'b' || type == 'c')) {
				 System.out.println("Licencia correcta.");		 
		} else {
		     	throw new Exception("Error 101: El tipo " + type + " de licencia no es v�lido para coches.");
		} 	if (tipo.equalsIgnoreCase("moto") && (type == 'a' || type == 'b' || type == 'c')) {
			 	System.out.println("Licencia correcta.");		 	
		} else {
				throw new Exception("Error 101: El tipo " + type + " de licencia no es v�lido para motos.");			
		} if (tipo.equalsIgnoreCase("camion") && (type == 'c')) {
		 	System.out.println("Licencia correcta.");	 	
	    } else {
			throw new Exception("Error 101: El tipo " + type + " de licencia no es v�lido para camiones.");
	    }
}   
	
}
