package com.qa.car;

// child class
public class SportsCar extends Car {
	
	//Fields
	private boolean hybridEngine;
	private int horsePower;
	
	
	// Method
	public void startEngine() {
		System.out.println("VROOM VROOM");
	}


	// Getters & Setters
	public boolean getHybridEngine() {
		return hybridEngine;
	}


	public void setHybridEngine(boolean hybridEngine) {
		this.hybridEngine = hybridEngine;
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}


	// Constructor
	public SportsCar(String make, String model, int doors, boolean electric, String colour, boolean hybridEngine,
			int horsePower) {
		super(make, model, doors, electric, colour);
		this.hybridEngine = hybridEngine;
		this.horsePower = horsePower;
	}


	


	
	
	

}
