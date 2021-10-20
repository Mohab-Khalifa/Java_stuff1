package com.qa.main;

import java.util.Random;

public class DoWhileExercise {
	
	public static void bankAccount() {
		
		System.out.println("Current Balance: 300");
		
		int balance = 300;
		
		do {
			balance -= new Random().nextInt(60);
			System.out.println("Current balance: " + balance);
		} while (balance < 300);
			
			
			balance -= 45;
			System.out.println("Current Balance: " + balance);
		
		
		if (balance < 87) {
			System.out.println("Balance is low: Spending too much!");
		}
	}
}	
