package model;

import java.time.LocalTime;

public class Ticket {
	private String slotId;
	private String vehicleNumber;
	private LocalTime entryTime;
	
	Ticket(String slotId, String vehicleNumber) {
		this.slotId = slotId;
		this.vehicleNumber = vehicleNumber;
		this.entryTime = LocalTime.now();
	}
	
	public String getSlotId() {
		return slotId;
	}
	
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public LocalTime getEntryTime() {
		return entryTime;
	}
}
