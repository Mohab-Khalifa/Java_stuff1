package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int one = 1;
		Cat feline = new Cat();
		Cat lion = new Cat(5, false, "Brown", "cookies");
		

		
		System.out.println(lion.toString());
		System.out.println(feline.toString());
		
		
	}
	
	
}

