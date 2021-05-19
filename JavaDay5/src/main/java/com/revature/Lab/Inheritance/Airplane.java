package com.revature.Lab.Inheritance;

public class Airplane extends FlyingVehicle{

	// Properties
	private short wheels;
	private short propellers;
	
	public Airplane(short wheels, short propellers) {
		// we could've added:
		// super((short) 4, new Engine());
		
		this.wheels = wheels;
		this.propellers = propellers;
	}
	
	// Getter and Setters
	public short getWheel() { return this.wheels; }
	public void setWheel(short wheels) { this.wheels = wheels; }
	
	public short getPropellers() { return this.propellers; }
	public void setPropellers(short propellers) { this.propellers = propellers; } 
	
	// Behaviors
	public void turn() {
		System.out.println("Turning...");
	}
}
