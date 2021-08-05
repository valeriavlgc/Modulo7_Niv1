package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", diameter=" + diameter;
	}
	
	

}
