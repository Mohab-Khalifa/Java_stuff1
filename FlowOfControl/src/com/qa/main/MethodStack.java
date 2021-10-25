package com.qa.main;

import java.util.Random;

public class MethodStack {
	
	// This method will return a number to main
	public static int firstLayer() {
		
		System.out.println("first layer called");
		int result = secondLayer();
		

		//run secondLayer again, add the value to it again

		System.out.println("first layer finished");
		result = result + secondLayer();
		return result;
	}
	
	//This method will provide a random number for firstLayer to use
	public static int secondLayer() {
		
		// new Random().nextInt() will return a random number from 0 to max (-1)
		int result = new Random().nextInt(7);
		return result;
		
	}

}
