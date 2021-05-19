package com.revature.abstraction;

public class OuterSpace {

	public static void main(String[] args) {
		
//		Star s = new Star(); // because it is an abstract.
		
		Star sun = new YellowDwarf();
		
		sun.supernova();
		sun.solarFlare();
		
		YellowDwarf anotherSun = new YellowDwarf();
		anotherSun.supportLifeOnPlanetEarth();
		
		
		
	}
	
}
