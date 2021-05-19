package com.revature.Lab.Inheritance;

public class Airplane extends FlyingVehicle{

	// Properties
	private short wheels;
	private short propellers;
	
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
