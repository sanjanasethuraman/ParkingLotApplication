package view;

import model.Vehicle;
import model.VehicleSize;

public class ParkingSpotView {
	
	public void DisplaySpotDetails(String slotId, boolean occupied, VehicleSize slotSize, Vehicle vehicle) {
		System.out.println("Here are the spot's details");
		System.out.println("Slot Id is: " + slotId);
		System.out.println("Occupancy status: " + occupied);
		System.out.println("Vehicle Size is: " + slotSize);
		System.out.println("Vehicle's registration number: " + vehicle.getVehicleNumber());
	}
}
