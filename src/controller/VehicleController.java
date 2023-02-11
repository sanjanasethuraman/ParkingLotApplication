package controller;

import model.Vehicle;
import model.VehicleSize;
import view.VehicleView;

public class VehicleController {
	private Vehicle model;
	private VehicleView view;
	
	VehicleController(Vehicle model, VehicleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void addVehicleNumber(String vehicleNumber) {
		model.setVehicleNumber(vehicleNumber);
	}
	
	public void addVehicleSize(VehicleSize vehicleSize) {
		model.setVehicleSize(vehicleSize);
	}
	
	public String displayVehicleNumber() {
		return model.getVehicleNumber();
	}
	
	public VehicleSize displayVehicleSize() {
		return model.getVehicleSize();
	}
	
	public void displayVehicleDetails() {
		view.displayCarDetails(model.getVehicleNumber(), model.getVehicleSize());
	}
}
