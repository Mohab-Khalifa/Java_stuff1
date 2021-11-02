package com.qa.garage;

public class GarageTest {
	
	//create garage object
	Garage mygarage = new Garage();
	
	// test if its my garage
	@Test
	public void myGarageTypeTest() {
		assertTrue(myGarage instanceof Garage);
	}
	

}
