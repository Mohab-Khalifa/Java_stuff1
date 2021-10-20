package com.qa.main;

public class IfElseTask {
	
	public static void ifElse(int num) {
		
		
		if (num > 10) {
			System.out.println("Number is greater than 10");
		} else if (num == 10) {
			System.out.println("Number is 10");
		} else {
			System.out.println("Number is less than 10");
		}
		
	}
	
	public static void stretchTask(int A) {
		
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else if (A <= 6000) { 
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else if (A <= 4000) {
					System.out.println("E");
				}
			}
		}
	}

}
