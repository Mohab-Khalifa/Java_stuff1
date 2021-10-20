package com.qa.main;

public class Operators {
	
	// Operators are functions you can use to change numerical values
	// add      +
	// sub      -
	// Multiply *
	// Divide   /
	// Modulus  %
	
	// Modulus can be used to see if a number is odd or even
	// any Number % 2 = 0 (even)
	
	public static int addMethod() {
		
		int result = 5 + 5;
		return result;
	}
	
	
	public static float divideMethod() {
		float result = 10.0f / 3;
		return result;
	}
	
	// This method will take in two numbers, add them and return the result
	public static int addNums(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}

}
