package com.qa.car;

// Parent class
public class Car {
	
	// Fields
	private String make;
	private String model;
	private int doors;
	private boolean electric;
	private String colour;

	// Method
	public void startEngine() {
		System.out.println("vroom vroom");
	}
	
	// Constructor
	public Car() {
		make = "Tesla";
		model = "Model X";
		doors = 5;
		electric = true;
		colour = "White";
	}

	
	// Constructor
	// right click -> source -> Generate Constructor Using Fields...
	public Car(String make, String model, int doors, boolean electric, String colour) {
		super(); // Within Java everything is an object of something - Java.lang.object object
		this.make = make;
		this.model = model;
		this.doors = doors;
		this.electric = electric;
		this.colour = colour;
		// this. - when creating THIS object 
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", doors=" + doors + ", electric=" + electric + ", colour="
				+ colour + "]";
	}
	

	
	// Getters & Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		
		if (make == "Peugeot") {
			System.out.println("Never buy a French car!");
			return;
		}
		
		this.make = make;			
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
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

	
	
	
}
