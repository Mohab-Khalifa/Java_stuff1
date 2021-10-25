package com.qa.main;

public class ForLoopsExercise {
	
	
	public static void flowChartOne() {
		
		for(int A = 100; A < 201; A++) {
			System.out.println(A);
		}
	}
	
	public static void flowChartTwo() {
		
		for(int B = 100; B <= 200; B++) {
			if (B % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	// Create a method that can print out the numbers 1-10 10 times each.
	public static void oneToTenTen() {
		
		for(int i = 1; i <= 10; i++) {
			int x = 0;
			while (x < 10) {
				System.out.println(x);
				x++;
			}
		}
	}
	
	public static void oneToTenTenV2() {
		
		for(int i = 1; i <= 10; i++) {
			for(int y = 0; y < 10; y++) {
				System.out.println(y);
			}			
		}
	}
	
	
	// Create a method to print the numbers 1 to 10 as many times as the value of that number.
	// For example; you will print 1 once, and 10 ten times.
	public static void flowChartDemo() {
		
		for (int i = 1; i < 11; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.println("Value of i is " + i);
			}
		}
	}
	

	
	public static void changeMethod(float price, float amountPaid) {
		
		float change = amountPaid - price;
		
		int twenty = 0;
		int tenner = 0;
		int fiver = 0;
		int twoPound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		
		// While the amount of change is greater than 20 (our first currency value)
		while(change >= 20) {
			change -= 20;
			twenty++;
		}
		
		while(change >= 10) {
			change -= 10;
			tenner++;
		}
		
		while(change >= 5) {
			change -= 5;
			fiver++;
		}
		
		while(change >= 2) {
			change -= 2;
			twoPound++;
		}
		
		while(change >= 1) {
			change -= 1;
			onePound++;
		}
		
		System.out.println("Number of twenty pound notes " + twenty);
		System.out.println("Number of ten pound notes " + tenner);
		System.out.println("Number of five pound notes " + fiver);
		System.out.println("Number of two pound coins " + twoPound);
		System.out.println("Number of one pound coins " + onePound);
	}





}
