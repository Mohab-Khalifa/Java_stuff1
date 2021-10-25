package com.qa.main;

public class User {
	
	//Fields
	public String firstName;
	public String surName;
	public String email;
	public int age;
	

	// Constructor - Overloading
	// Within a class you can use AS MANY constructors as you want - with different combos of fields
	
	// This constructor takes in 4 parameters, 3 strings amd 1 int
	public User(String firstname, String surname, String email, int age) {
		super();
		this.firstName = firstname;
		this.surName = surname;
		this.email = email;
		this.age = age;
	}

	// This constructor only takes in firstName
	public User(String firstname) {
		super();
		this.firstName = firstname;
	}

	// Only contains an int
	public User(int age) {
		super();
		this.age = age;
	}
	

	
	
	
	
	

}
