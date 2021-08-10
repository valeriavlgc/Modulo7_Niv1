package com.vehicles.view;

import java.lang.ModuleLayer.Controller;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vehicles.application.UserController;
import com.vehicles.application.VehicleController;
import com.vehicles.project.Car;
import com.vehicles.project.Owner;
import com.vehicles.project.Wheel;

public class Main {

	public static void main(String[] args) throws Exception {
		Owner owner;
		VehicleController controller = new VehicleController();
		UserController usController = new UserController();
		
		owner = usController.createOwner();
	    controller.newVehicle(owner);
	    controller.getAllVehicles();
	      

   }

}
