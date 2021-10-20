package com.qa.main;

public class Turtle {
	
	int age;
	String skin = "Rough";
	String personality = "Shy";
	int speed;
	boolean plastic = false;
	boolean helpedNemo = false;
	int offspring = 12;
	
	
	public void flipper() {
		System.out.println("Flip Flip");
	}
	
	// when typing in conditionals, and = &&, or = ||
	
	public void speeding() {
		if (speed>35) {
			System.out.println("Why you coming fast?!");
		} else {
			System.out.println("Speed up a little");
		}
		
	}
	
	
	
	//CONSTRUCTOR
	
	public Turtle (int age, int speed, boolean plastic, String personality) {
		this.age = age;
		this.speed = speed;
		this.plastic = plastic;
		this.personality = personality;
		
	
		
	}
}