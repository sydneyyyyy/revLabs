package com.revature.models;

import java.util.ArrayList;

import com.revature.exceptions.PlanetHasNoMoonsException;


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
	// Create a instance variable for planet - that holds that planet's moons.
	private ArrayList<Moons> moons; 
	// Code a getter and setter to retrieve and set the planet's moons
	
	
	
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
	
	public Planet(String name, double mass, double radius, boolean atmosphere, ArrayList<Moons> moons) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
		this.moons = moons;
	}
	
	


	// Getters and Setters
	
	
	public String getName() {
		return name;
	}


	public ArrayList<Moons> getMoons() throws PlanetHasNoMoonsException {
		if (this.moons == null) {
			throw new PlanetHasNoMoonsException("This planet has no moons!");
			
		} else {
			return this.moons;
		}
		
//		return moons;
	}

	public void setMoons(ArrayList<Moons> moons) {
		this.moons = moons;
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
		return "Planet [name=" + name + ", mass=" + mass + ", radius=" + radius + ", atmosphere=" + atmosphere
				+ ", moons=" + this.moons + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
