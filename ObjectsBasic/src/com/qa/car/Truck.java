package com.qa.car;

// child class
public class Truck extends Car {
	
	// Fields
	private int numOfEngines;
	private boolean eighteenWheeler;
	
	// Method 
	public void reverseTruck() {
		System.out.println("BEEP BEEP BEEP");
	}

	// Getters & Setters
	public int getNumOfEngines() {
		return numOfEngines;
	}

	public void setNumOfEngines(int numOfEngines) {
		this.numOfEngines = numOfEngines;
	}

	public boolean isEighteenWheeler() {
		return eighteenWheeler;
	}

	public void setEighteenWheeler(boolean eighteenWheeler) {
		this.eighteenWheeler = eighteenWheeler;
	}

	// Constructor
	public Truck(String make, String model, int doors, boolean electric, String colour, int numOfEngines,
			boolean eighteenWheeler) {
		super(make, model, doors, electric, colour);
		this.numOfEngines = numOfEngines;
		this.eighteenWheeler = eighteenWheeler;
	}

	@Override
	public String toString() {
		return "Truck [numOfEngines=" + numOfEngines + ", eighteenWheeler=" + eighteenWheeler + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
