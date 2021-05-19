package com.revature.Lab.Inheritance;

public class Simulation {

	
	public static void main(String[] args) {
		
		// Create an instance of Flying Vehicle
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		
		fv.setName("A New Flying Vehicle");
		System.out.println(fv.getName());
		
		// Create an instance of Airplane
		Airplane boeing = new Airplane((short)4, (short)5);
		boeing.move(15);
	}
}
