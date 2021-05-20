package com.revature.models;

// Every class inherits from the Object Class - implicitly
public class Planet {

	// Static Variable - specific to the class - same for every instance of the class
	// Final - once instantiated - can no longer be changed (non-accessed modifiers) 
	public static final double G = 6.673E-11;
	
	// Instance Variable 
	private String name;
	private double mass;
	private double radius;
	private boolean atmosphere;
	
	
	
	// Constructor - noArg
	public Planet() {
		super();
	}

	// Constructor
	public Planet(String name, double mass, double radius, boolean atmosphere) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
	}


	// Getters and Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		if (name == null) {
			System.out.println("Please input valid name.");
		}
		this.name = name;
	}


	public double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		
		
		this.mass = mass;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public boolean isAtmosphere() {
		return atmosphere;
	}


	public void setAtmosphere(boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	
	
	// Methods
	public double calculateSurfaceGravity() {
		return (this.mass * G) / (Math.pow(this.radius, 2)); // Math Library 
		
	}
	

	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", radius=" + radius + ", atmosphere=" + atmosphere + "]";
	}
	
	
	
	
	
	
	
}
