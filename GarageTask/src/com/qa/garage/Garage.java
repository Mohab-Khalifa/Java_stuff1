package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	
	public ArrayList<Vehicle> garageList;
	
	// Adding vehicles to garage
	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}
	
	// Removing vehicles from garage 
	public void removeVehicle(Vehicle vehicle) {
		garageList.remove(vehicle);
	}
	
	// Updating vehicles from garage
	public void updateVehicle(int index, Vehicle vehicle) {
		garageList.set(index, vehicle);
	}
	
	// Reading vehicle
	public Vehicle getVehicle(int index) {
		return garageList.get(index);
	}
	
	// Removing all vehicles from garage
	public void clearGarage() {
		garageList.clear();
	}
	
	// Running vehicle.fixVehicle() custom method
	public void fixVehicle(int index) {
		getVehicle(index).fixVehicle();
	}

	public Garage() {
		super();
		this.garageList = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Garage= ");
		builder.append(garageList);
		return builder.toString();
	}

}
