package view;

import java.time.LocalTime;

public class TicketView {
	
	public void displayTicketDetails(String slotId, String vehicleNumber, LocalTime entryTime) {
		System.out.println("The slot Id is: " + slotId);
		System.out.println("The vehicle's registration number is: " + vehicleNumber);
		System.out.println("The time of entry is: " + entryTime);
	}
}
