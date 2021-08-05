package com.vehicles.view;

import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vehicles.application.VehicleController;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Main {

	public static void main(String[] args) {
		
		VehicleController controller = new VehicleController();
		
	    controller.newVehicle();
	    controller.getAllVehicles();
	      

   }

}
