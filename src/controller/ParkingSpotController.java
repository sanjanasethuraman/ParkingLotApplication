package controller;

import model.ParkingSpot;
import model.Vehicle;
import model.VehicleSize;
import view.ParkingSpotView;

public class ParkingSpotController {
	private ParkingSpot model;
	private ParkingSpotView view;
	
	ParkingSpotController(ParkingSpot model, ParkingSpotView view) {
		this.model = model;
		this.view = view;
	}
	
	public void addSlotId(String slotId) {
		model.setSlotId(slotId);
	}
	
	public void addOccupancyStatus(boolean occupancy) {
		model.setOccupied(occupancy);
	}
	
	public void addSlotSize(VehicleSize slotSize) {
		model.setVehicleSize(slotSize);
	}
	
	public void parkVehicle(Vehicle vehicle) {
		model.setVehicle(vehicle);
	}
	
	public void displaySlotDetails() {
		view.DisplaySpotDetails(model.getSlotId(), model.getOccupied(), model.getVehicleSize(), model.getVehicle());
	}
}
