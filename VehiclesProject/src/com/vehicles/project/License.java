package com.vehicles.project;

import java.util.Date;

public class License {

	protected String id;
	protected char type;
	protected String fullName;
	protected Date expiringDate;
	
	public License(String id, char tipo, String fullName, Date expiringDate) {
		this.id           = id;
		this.type         = tipo;
		this.fullName     = fullName;
		this.expiringDate = expiringDate;
		
	}

	public char getType() {
		
		return type;
	}
	
	
}
