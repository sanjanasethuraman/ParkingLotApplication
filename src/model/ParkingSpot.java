package model;

public class ParkingSpot {
	private String slotId;
	private boolean occupied;
	private VehicleSize slotSize;
	private Vehicle vehicle;
	
	ParkingSpot(String slotId, boolean occupied, VehicleSize slotSize) {
		this.slotId = slotId;
		this.occupied = occupied;
		this.slotSize = slotSize;
	}
	
	public String getSlotId() {
		return slotId;
	}
	
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	
	public boolean getOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public VehicleSize getVehicleSize() {
		return slotSize;
	}
	
	public void setVehicleSize(VehicleSize slotSize) {
		this.slotSize = slotSize;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
