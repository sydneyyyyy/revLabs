package com.revature.Interfaces;

public abstract class Animal {

	public int numberOfLives = 1;
	
	// Constructor Method
	public Animal() {
		System.out.println("Animal Constructor called...");
	}
	
	// Abstract Method
	public abstract void makeSound();
	
	public void exist() {
		System.out.println("The animal is existing...");
	}

	@Override
	public String toString() {
		return "Animal [numberOfLives=" + numberOfLives + "]";
	}
	
	
	
	
}
