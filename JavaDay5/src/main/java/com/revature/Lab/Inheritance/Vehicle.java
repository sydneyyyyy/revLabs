package com.revature.Lab.Inheritance;

public class Vehicle {

	// Vehicle Properties
	private String name;
	private long serialNumber;
	
	// Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Vehicle Behaviors
	public void move() {
		System.out.println("Vehicle is moving...");
	}
	
	public void move(int spaces) {
		System.out.println("Vehicle moving " + spaces + " spaces");
	}
	
}
