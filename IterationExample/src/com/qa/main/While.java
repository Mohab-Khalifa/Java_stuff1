package com.qa.main;

public class While {
	
	// Iteration allows you to repeat blocks of code
	// UNTIL s specific condition is met
	
	// Within Java there are 4 basic types of loop
	
	// While - Run until a boolean condition is met
	// Do While - Runs once first THEN checks the boolean condition
	
	// For Loop - Run a predetermined (numerically) amount of iterations
	
	// If you know how long the loop should run -> For loop
	// if not, use a while / do while
	
	// Switch - In between conditionals and loops, replaces a nesting if else statement and loops the code
	
	
	public static void basicDemo() {
		
		System.out.println("Loop is about to start");
		
		int counter = 0;
		
		// while is the command word
		// Next is the query (exactly the same as an if statement)
		while(counter < 20) {
			System.out.println("Counter value: " + counter); //combining a String and an int to create a string
//			counter ++; // Increment counter by 1
			counter += 2; // Increments counter by 2
		}
	
		
		System.out.println("Lopp has ended");
	}




}
