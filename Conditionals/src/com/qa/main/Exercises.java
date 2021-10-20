package com.qa.main;

public class Exercises {
	
	public static void fizzBuzz(int y) {
		
		if (y % 3 == 0 && y % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (y % 3 == 0) {
			System.out.println("Fizz");
		} else if (y % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(y);
		}
	}
	
	public static int blackJack(int a, int b) {
		
		if (a > b && a < 22) {
			return a;
		} else if (a > b && a > 21 && b < 22) {
			return b;
		} else if (b > a && b < 22) {
			return b;
		} else if (b > a && b > 21 && a < 22) {
			return a;
		} else {
			return 0;
		}
	}
	
	
	public static int blackJackV2(int house, int player) {
		
		// if house AND player are over 21 
		// if either player is over 21 the other wins
		
		if (house > 21 && player > 21) {
			return 0;
		} else if (house > 21) {
			return player;
		} else if (player > 21) {
			return house;
		} // if we get here, Neither person are over 21
		else if (house >= player) {
			return house;
		} else {
			return player;
		}
	}
	
	
	public static int uniqueSum(int d, int e, int f) {
		
		if (d == e && d == f) {
			return 0;
		} else if (d == e) {
			return f;
		} else if (d == f) {
			return e;
		} else if (e == f) {
			return d;
		} else {
			return d + e + f;
		}

	}	
}