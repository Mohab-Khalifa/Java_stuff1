package com.qa.garage;

// Parent class
public class Vehicle {
	
	// Fields
	private String travelType;
	private int numOfSeats;
	private boolean electric;
	private String colour;
	private int maxSpeed;
	private boolean damaged;
	
	// Method
	public void insertKey() {
		System.out.println("Systems ON!");
	}
	
	public void fixVehicle() {
		if (this.damaged == true) {
			System.out.println("Fix vehicle");
		} else {
			System.out.println("Repair not needed");
		}
	}
	
	// Getters & Setters
	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
		if(travelType != "Land") {
			System.out.println("Take precautions");
		}
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		if(maxSpeed > 200) {
			System.out.println("Travel Safe");
		}
	}
	
	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}

	// Constructor
	public Vehicle(String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed, boolean damaged) {
		super();
		this.travelType = travelType;
		this.numOfSeats = numOfSeats;
		this.electric = electric;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.damaged = damaged;
	}

	@Override
	public String toString() {
		return "Vehicle [travelType=" + travelType + ", numOfSeats=" + numOfSeats + ", electric=" + electric
				+ ", colour=" + colour + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
		
	

}
