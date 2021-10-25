package com.qa.main;

public class Returns {
	
	// Methods run blocks of repeatable code
	// Methods run the code until either
		// The body ends
		// The method RETURNS something
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
	
	// void = return nothing
	// Java is explicitly data typed, meaning you have to define what data it reurns
	public static String returnHello() {
		return "Hello There";	
	}
	
	
	
	public static int returnNum() {
		return 123;
	}
	
	public static String classString = "testString";
	
	
	// exercise: write methods that return char, float, boolean, double & string
	
	public static String stringingIt() {
		return "This is a practise exercise";
	}
	
	public static float piTastesGood() {
		return 3.14f;
	}

	public static double doubby() {
		return 4.3823782d;
	}
	
	public static char charTwice() {
		return 1;
	}
	
	public static boolean amIHuman() {
		return true;
	}
	
}
