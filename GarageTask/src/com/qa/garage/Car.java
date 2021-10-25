package com.qa.garage;

// Child Class
public class Car extends Vehicle{
	
	// Fields
	private int numOfWheels;
	private String make;
	
	// Method
	public void startEngine() {
		System.out.println("VROOM VROOM");
	}
	
	// Getters & Setters
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	// Constructor
	public Car(String travelType, int numOfSeats, boolean electric, String colour, int maxSpeed, boolean damaged,
			int numOfWheels, String make) {
		super(travelType, numOfSeats, electric, colour, maxSpeed, damaged);
		this.numOfWheels = numOfWheels;
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [numOfWheels=" + numOfWheels + ", make=" + make + ", toString()=" + super.toString() + "]";
	}

	
	

	
	
	
	

}
