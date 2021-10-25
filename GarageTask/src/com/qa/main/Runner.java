package com.qa.main;

import com.qa.garage.Boat;
import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Helicopter;
import com.qa.garage.Vehicle;


//Garage Task

// The task is to create a garage class with methods for the following:
// - Adding Vehicles to garage ✅
// - Removing vehicles 
// - Updating vehicles
// - Reading vehicle
// - Removing all vehicles
// - Running vehicle.fixVehicle() custom method ✅


// Vehicles
// Vehicle should be a base class (parent) with at least 3 fields
// and a fixVehicle() method
//
// You should create at least 3 child classes extending off of Vehicle
// (car, bike, helicopter).
// Each child class should inherit the fields AND have 2 specific fields

public class Runner {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		System.out.println(garage);
		
		Vehicle car1 = new Car("Land", 5, false, "Black", 150, false,  4, "Vauxhall");
		garage.addVehicle(car1);
		car1.fixVehicle();
		
		Vehicle car2 = new Car("Land", 2, true, "White", 200, true, 4, "Lamborghini");
		garage.addVehicle(car2);
		car2.fixVehicle();
		
		System.out.println(garage);
		
		Vehicle Heli1 = new Helicopter("Air", 4, false, "Silver", 250, true, 3, false);
		Vehicle Heli2 = new Helicopter("Air", 6, false, "Matt Black", 300, false, 4, true);
		
		Vehicle Boat1 = new Boat("Water", 6, false, "Eggshell White", 100, true, 30, "Fishing Boat", true);
		
		System.out.println(garage);
	}

}
