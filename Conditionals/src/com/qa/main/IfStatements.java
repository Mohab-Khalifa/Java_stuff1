package com.qa.main;

public class IfStatements {
	
	// Conditionals are used when developers want code to have multiple outcomes
	
	// If a variable is a certain value
	// do thing
	// else, do other thing

	
	public static void conditionalDemo() { 
		
		// Java uses if else statements (like basically every programming/scripting languages)
		// computing/programming is binary, either true or false
		
		boolean isKettleOn = true;
		
		// if is the command word
		// next to if within () is the statement
		// = = assignment
		// == comparison (checking the value)
		if (isKettleOn == true) {
			// this is the body
			// what the code does if the if statement is true
			System.out.println("I'll have a cuppa");
		} else if (isKettleOn == false) {
			System.out.println("Pop the kettle on!");
		}
		


		
		// code written like this is best practise
		boolean binsOut = true;
		
		if (binsOut) {
			System.out.println("Bins are out!");
		} else {
			System.out.println("Bins were forgotten");
		}
		
	}
	
	// Conditional Operators
	// == - equals
	// > - greater than
	// < - less than
	// >= - greater than OR equals
	// <= - less than OR equals
	// || - OR
	// && - AND
	// != - not equals
	
	public static String numberStatement() {
		
		int x = 12;
		
		if (x > 10) {
			return "greater than 10";
		} else if (x == 10) {
			return "equal to 10";
		} else {
			return "less than 10";
		}
		
		//always end an if block either with
		// else
		// return (outside the block)
	}
	
	public static void complexStatement() {
		
		boolean bool = true;
		String colour = "Red";
		
		// if bool is true OR if colour is red
		if (bool == true || colour == "Red") {
			System.out.println("bool is true or colour is red");
			// How can I tell whether it's bool being true OR colour being red that triggered this?
			
			if(bool == true && colour == "Red") {
				System.out.println("bool is true AND colour is red");
			} else if (bool == true) {
				System.out.println("bool is true and colour is not red");
			} else if (colour == "Red") {
				System.out.println("colour is red and bool is false");
			}
		}
	}
	
}
