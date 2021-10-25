package com.qa.main;

public class Penguin {
	
	// Encapsulation - Limiting & controlling who/what has access to our data
	// Limiting the type of data that can be used to replace existing data
	
	// Public - means accessible by everything within this package
	// Private - means data is only accessible by THIS CLASS
	
	//Fields
	private String name;
	private boolean eatenFish;
	private String noise;
	private boolean happyFeet;
	
	// Constructor
	public Penguin(String name, boolean eatenFish, String noise, boolean happyFeet) {
		super();
		this.name = name;
		this.eatenFish = eatenFish;
		this.noise = noise;
		this.happyFeet = happyFeet;
	}

	

	// Getters & Setters
	// Getters - Return the data
	// Setters - Allow you to update the data
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name == "Pingu") {
			System.out.println("Don't do that, we'll get sued!");
			return; // return is used to finish a method
		}
		
		this.name = name;
	}

	public boolean isEatenFish() {
		return eatenFish;
	}

	public void setEatenFish(boolean eatenFish) {
		this.eatenFish = eatenFish;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public boolean isHappyFeet() {
		return happyFeet;
	}

	public void setHappyFeet(boolean happyFeet) {
		this.happyFeet = happyFeet;
	}
	
	
	
	
	
	
	

}
