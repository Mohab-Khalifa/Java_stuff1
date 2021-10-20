package com.qa.main;

public class ForLoops {
	
	// For Loops primarily work with numerical values\
	// They will run for a set number of times, based on how they've been configures
	
	// For loops have four components to configure
	// Initialisation (initial value)
	// Condition (What we're checking for)
	// Iterator (How we loop through the code)
	//Body (What code are we looping)
	
	public static void countToTen() {
		// count to 10, printing out each number between
		
		
		
		for(  
				int i = 0; // initialisation - starting from the value 0
				i < 10;    // condition - do this code while i is less than 10
				i ++       // iterator - we're adding 1 to i after every loop
				) {
			System.out.println(i+1);
		}
		
		
	}
	
	//neater version of code below
	public static void countDownFromTen() {
		
		for(int i = 10; i >= 0; i--) {
			System.out.println("The value of i is " + i);
		}
	}
	
	public static void countInFours() {
		for(int x = 10; x < 100; x += 5) {
			System.out.println(x);
		}
	}
	
	public static void countWithParams(int a, int b, int c) {
		for(int y = 1; y < b; y += c) {
			System.out.println(y);
		}
	}

}
