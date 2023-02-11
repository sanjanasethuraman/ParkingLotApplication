package main;

import java.util.ArrayList;
import java.util.List;
import model.ParkingSpot;

public class ParkingLot {
	private static ParkingLot parkingLot;
	private List <ParkingSpot> FourWheeler;
	private List <ParkingSpot> twoWheeler;
	
	private ParkingLot() {
		this.twoWheeler = new ArrayList<>();
		this.FourWheeler = new ArrayList<>();
	}
	
	public static ParkingLot initialiseParkingLot() {
		if (parkingLot == null) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}
}
