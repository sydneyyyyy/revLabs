package com.revature.models;

public class Moons extends Planet {

	private String name;
	private double mass;
	private double radius;
	
	
	public Moons() {
		super();
	}
	
	
	public Moons(String name, double mass, double radius) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
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


	@Override
	public String toString() {
		return "Moons [name=" + name + ", mass=" + mass + ", radius=" + radius + "]";
	}
	
	
	
	
	
}
