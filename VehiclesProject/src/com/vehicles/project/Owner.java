package com.vehicles.project;

import java.util.Date;

public class Owner extends Person {
	
	protected String garage; //boolean?
	protected String insurance;
	
	public Owner(String name, String surname, Date birthdate, License license, String garage, String insurance) {
		super(name, surname, birthdate, license);
		this.garage    = garage; 
		this.insurance = insurance;
		
	}
	

}
