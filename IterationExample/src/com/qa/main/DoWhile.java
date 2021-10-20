package com.qa.main;

public class DoWhile {
	
	public static void basicExample() {
		
		boolean testBool = true;
		
		System.out.println("Before Loop");
		// While testBool is false testBool == false
		while(!testBool) {
			System.out.println("Will this ever print??");
		}
		
		System.out.println("After Loop");
		
		// Do While - Will always run once before checking the code
		
		// do first with no condition, and a method body
		// followed by our while (with a condition)
		do {
			System.out.println("printed from the Do While loop");
		} while(!testBool);
		
	}

}
