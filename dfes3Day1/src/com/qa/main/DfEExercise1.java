package com.qa.main;



public class DfEExercise1 {
	
    public static void main(String[] args) {
    	
        boolean amIHappy = false; // A boolean names amIHAppy is being delcared and assigned false
       
        int weight = 20; // An integer named 'weight' is being declared and assigned value '20'
        String name = "Billy Bob"; // a string named 'name' is being declared and assigned 'Billy Bob'
        Dog goodBoy = new Dog(name, weight); // Object is being created called goodboy and assigning it values created above
        int x = weight - 10; // variable x is being assigned the weight variable minus 10, which will = 10
        if (x < 15) goodBoy.bark(); // an if statement to determine whether the dog should bark or 
        							// not depending on value
       
        while (x < 3) { // while x is less than 3, then goodboy will play 
            goodBoy.play();
        }
        
        int[] numList = {1,2,3,4,5,6}; // Creating an array named NumList and entering nums
        System.out.println("How are you"); // Printing the string 'how are you'
        System.out.println("My " + name + " is doing great"
                + " how's yours"); // Prints a statement with the name variable
        String num = "305"; //creating a string named num called '305'
        int z = Integer.parseInt(num); // New variable called z and converts it into an integer
    
        
    }
    
    
    }