package com.qa.main;

public class CakeTin {
	
	// Fields - attributes to describe the object
	
	public String flavour;
	public int size;
	public boolean glutenFree;
	public String colour;
	
	// static field (all cakes will have the same value)
	public static int cakesBaked;
	
	
	// Methods = Functions that the object can do
	
	public void eatCake() {
		System.out.println("Cake was delicious!");
	}
	
	// static method (Accessed via the class)
	public static void numberOfBakedCakes() {
		System.out.println("Cakes baked: " + cakesBaked);
	}
	
	
	
	
	
	// Constructor - constructors are 'methods' to create objects from a class
	// Constructors have NO RETURN (doesn't mean void, means no return)
	
	// Constructor name MUST BE THE CLASS NAME EXACTLY
	public CakeTin() {
		flavour = "Vanilla";
		size = 12;
		glutenFree = true;
		colour = "Beige";
		cakesBaked++; // Whenever this constructor runs, increment cakesBaked by 1
		// this. - when creating THIS object
	}

	public CakeTin(String flavour, int size, boolean glutenFree, String colour) {
		super();
		this.flavour = flavour;
		this.size = size;
		this.glutenFree = glutenFree;
		this.colour = colour;
	}

	
	
}
