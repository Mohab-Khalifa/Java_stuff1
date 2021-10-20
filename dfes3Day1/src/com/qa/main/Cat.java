package com.qa.main;

public class Cat {
	
	//First we need its attributes
	
	int age;
	boolean isHairShort = true;
	String hairColour = "Ginger";
	String favouriteFood;
	
	//Methods - CAN DOS
	
	public void scratch() {
		System.out.println("I scwatch");
	}
	
	public int catDoesMath(int a, int b) {
		int z = a + b;
		System.out.println(z);
		return z;
	}
	
	public void kitCat() {
		if (age>10) {
			favouriteFood = "Potatoes";
		} else {
			favouriteFood = "Chips";
		}
		
	}
	

	//CONSTRUCTOR
	
	public Cat() {
		
	}
	
	@Override
	public String toString() {
		return "Cat [age=" + age + ", isHairShort=" + isHairShort + ", hairColour=" + hairColour + ", favouriteFood="
				+ favouriteFood + "]";
	}

	public Cat (int age, boolean isHairShort, String hairColour, String favouriteFood) {
		this.age = age;
		this.isHairShort = isHairShort;
		this.hairColour = hairColour;
		this.favouriteFood = favouriteFood;
	}
}
