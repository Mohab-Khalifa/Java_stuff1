package com.qa.main;

import java.util.Random;

public class WhileExercise {
	
	// Using a while loop start with a beginning total (300), subtract an amount of money 
	// from it (45) until the total goes less than another value (87)
	// When the total goes below the set value, print out "You're spending too much money!"
	
	public static void bankAccount() {
		
		System.out.println("Current Balance: 300");
		
		int balance = 300;
		
		while(balance > 86) {
			balance -= 45;
			System.out.println("Current Balance: " + balance);
		}
		
		if (balance < 87) {
			System.out.println("Balance is low: Spending too much!");
		}
	}

}

// how to implement code below to subtract random amounts from the total?
// Random random = new Random();
// return random.nextInt(max - min) + min;
