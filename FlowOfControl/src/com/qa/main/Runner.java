package com.qa.main;

public class Runner {
	
	// main method is what runs
	// don't write code in main, link to methods
	public static void main(String[] args) {
		
//		// Code runs FROM main, top to bottom
//		System.out.println("3");
//		System.out.println("2");
//		System.out.println("1");
//		
//		// Tell my main method to run newMethod
//		// type in the name of the method to run + () + ;
//		newMethod();
//		
//		
//		// Reference the class . the method
//		Demo.imFirst();
//	}
//	
//	// New method
//	// All methods should be 'public static void' (but will change)
//	public static void newMethod() {
//		// method body - this is what runs when we say 'run this method'
//		System.out.println("Hello World!");
//		
//		
		
//	System.out.println("main started");
//	System.out.println(MethodStack.firstLayer());
//	System.out.println("main ended");

	System.out.println(DiceRoller.threeSidedDie());
	System.out.println(DiceRoller.fourSidedDie());
	System.out.println(DiceRoller.sixSidedDie());
	System.out.println(DiceRoller.eightSidedDie());
	System.out.println(DiceRoller.tenSidedDie());
	
	System.out.println(DiceRoller.fourBySixSides());
	System.out.println(DiceRoller.doubleDice());
	System.out.println(DiceRoller.sumOfEachDice());
	
	
	}
	

}
