package com.revature.classesobjects;

public class AnimalShelter {

	public static void main(String[] args) {
		
		// use the constructor to create a Dog object
		// This will reserve the memory needed to store all information about our dog object
		// Data type + Reference Variable = new keyword + Constructor();
		Dog myDog = new Dog(); // Reference Variable - stores an object location in memory where your object is stored
		myDog.name = "Fido";
		
		Dog notMyDog = new Dog(); // creating a separate instance of that class
		notMyDog.name = "Jane";
		
		
		System.out.println(myDog.name);
		System.out.println(notMyDog.name);
		System.out.println(myDog.isFed);
		
		myDog.Bark();
		notMyDog.Bark();
		
		myDog.Bark(8);
		notMyDog.Bark(11);
		
		myDog.Bark(5, 8);
		
		Dog spot = new Dog("Spot", "Corgi", 5);
		
		System.out.println(spot.age);
		
		Dog testDog = new Dog();
		testDog.Bark(); // will return null says arf arf - value of any object not instantiated (doesn't exist) == null
		System.out.println(testDog.name); // == null String was never created.
	}
}
