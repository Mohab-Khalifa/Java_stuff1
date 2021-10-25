package com.qa.main;

import java.util.Random;

public class DiceRoller {
	
	public static int threeSidedDie() {
		int result = new Random().nextInt(3);
		result = result + 1;
		return result;
	}
	
	public static int fourSidedDie() {
		int result = new Random().nextInt(4);
		result = result + 1;
		return result;
	}

	public static int sixSidedDie() {
		int result = new Random().nextInt(6);
		result = result + 1;
		return result;
	}
	
	public static int eightSidedDie() {
		int result = new Random().nextInt(8);
		result = result + 1;
		return result;
	}

	public static int tenSidedDie() {
		int result = new Random().nextInt(10);
		result = result + 1;
		return result;
	}
	
	
	
	
	// This will calculate the sum of 4 six sided dice
	public static int fourBySixSides() {
		int result = sixSidedDie() + sixSidedDie() + sixSidedDie() + sixSidedDie();
		return result;
	}
	
	// This will calculate the sum of 2 ten-sided dice and 2 three-sided dice
	public static int doubleDice() {
		int firstResult = tenSidedDie() + tenSidedDie();
		int secondResult = threeSidedDie() + threeSidedDie();
		int finalresult = firstResult + secondResult;
		return finalresult;	
	}
	
	// adds the sum of each dice rolled once
	public static int sumOfEachDice() {
		int result = threeSidedDie() + fourSidedDie() + sixSidedDie() + 
				eightSidedDie() + tenSidedDie();
		return result;
	}
	
	// sum of 4 six sided dice ignoring the smallest value
	public static void fourBySixMinusSmallest() {
		int num1 = sixSidedDie();
		int num2 = sixSidedDie();
		int num3 = sixSidedDie();
		int num4 = sixSidedDie();
		
		int total;
		
		if(num1 < num2 && num1 < num3 && num1 < num4) {
			total = num2 + num3 + num4;
			
		} else if (num2 < num1 && num2 < num3 && num2 < num4) {
			total = num1 + num3 + num4;
		} 
	}		
	//not finished	
}
