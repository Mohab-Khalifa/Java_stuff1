package com.qa.main;

public class Calculator {
	
	public static int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// first input subtracted by second input
	public static int subtraction(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	// first input times the second input
	public static int multiplication(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	// first input divided by second input
	public static int division(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	public static double indices(int num1, int num2) {
		double result = Math.pow(num1, num2);
		return result;
		
	}

}
