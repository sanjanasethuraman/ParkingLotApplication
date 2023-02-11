package view;

import model.VehicleSize;

public class VehicleView {
	
	public void displayCarDetails(String vehicleNumber, VehicleSize vehicleSize) {
		System.out.println("Hello there!");
		System.out.println("Vehicle's registration number is: " + vehicleNumber);
		System.out.println("Vehicle's size is: " + vehicleSize);
	}
}
