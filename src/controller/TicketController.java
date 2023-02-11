package controller;

import model.Ticket;
import view.TicketView;

public class TicketController {
	private Ticket model;
	private TicketView view;
	
	TicketController(Ticket model, TicketView view) {
		this.model = model;
		this.view = view;
	}
	
	public void addSlotId(String slotId) {
		model.setSlotId(slotId);
	}
	
	public void addVehicleNumber(String vehicleNumber) {
		model.setVehicleNumber(vehicleNumber);
	}
	
	public void displayTicketDetails() {
		view.displayTicketDetails(model.getSlotId(), model.getVehicleNumber(), model.getEntryTime());
	}
}
