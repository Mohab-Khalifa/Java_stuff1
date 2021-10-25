package com.qa.main;

import com.qa.car.Car;
import com.qa.car.SportsCar;
import com.qa.car.Truck;

public class Runner {
	
	public static void main(String[] args) {
		
		// CakeTin is the data type
		// gfSpongeCake(gluten-free spongeCake) is the name of the object
		// Equal to new CakeTin (The method we're using)
		
//		CakeTin gfSpongeCake = new CakeTin();
//		gfSpongeCake.numberOfBakedCakes();
//		System.out.println(gfSpongeCake.flavour);
//		gfSpongeCake.eatCake();
////		CakeTin.eatCake(); // Cannot run an instanced from a class
//		
//		
//		gfSpongeCake.numberOfBakedCakes();
//		CakeTin.numberOfBakedCakes();
//		===============================================================================================
		
		
		
//		Car tesla = new Car();
//		System.out.println(tesla);
//		
//		Car myCar = new Car("Mercedes", "C Class", 5, false, "Black");
//		System.out.println(myCar);
//		myCar.startEngine();
//		
		SportsCar Nissan = new SportsCar("Nissan", "GTR", 2, false, "Crimson", false, 420);
		Nissan.startEngine();

		Truck Ford = new Truck("Ford", "1842", 4, false, "White", 12, false);
		Ford.startEngine();
		Ford.reverseTruck();
		System.out.println(Ford.getDoors());
		System.out.println(Ford);
		
		
		
// =====================================================================================================		
//		Penguin penguin1 = new Penguin("Arthur", true, "EEEEEE", false);
//		System.out.println(penguin1.isEatenFish());
//		penguin1.setName("Pingu");
//		System.out.println(penguin1.getName());
		
		
	
	}
	
	// Static methods belong to classes
	// Non static belong to objects

}
