package com.revature.classesobjects;

/*
 * Classes:
 * 		- represent real world things
 * 		- serve the role of a software module (collections of related methods and their necessary variables)
 * 
 * As real-world representation:
 * 		- Each 'instance' of a class (what we refer to as an object) represents a single 'thing'
 * 		- i.e. Two cars of the same make/model, but with different VINs, color, mileage, etc..
 * 
 * As a software module:
 * 		- Generally we only create one instance of the class at a time.
 * 		- TestClass - 
 * 
 * A class is a blueprint for objects
 * 		- it outlines behaviors and shared states for instances
 * 		- values of those states may change independently of the other instances (*).
 * 
 * An object's state is unique to itself.
 * Each object operates its own behavior independently. (*)
 * 
 * 
 * */
public class Dog {

	// Instance Variables - unique / specific to each instance of the class that we create
	String name;
	String breed;
	int age;
	boolean isFed;
	
	/*
	 * Constructors - are used to create objects. "Instantiating a class"
	 * 
	 * When a class' constructor is  run - a new object is created from the class. 
	 * (Class => Blueprint for objects.)
	 * 
	 * Constructors are just special methods.
	 * 		- they have no return type
	 * 		- they always have the same name as the class in which they're defined
	 * 		- Every class MUST have at least one constructor (if you don't provide one - the compiler
	 * 			provides one implicitly
	 * 			- If you do provide one, the default constructor is 'lost'.
	 * */
	
	// no-args constructor - exactly what the compiler provides as a default constructor
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	// Constructors can have parameters (Parameterized Constructor) - and this is how we overload constructors.
	public Dog(String name, String breed, int age) {
		this.name = name; // the 'this' keyword is used for self-reference - references the object in question (calling the method, referring to the object being created).
		this.breed = breed;
		this.age = age;
		this.isFed = false;
	}
	
	// Methods that are unique to this class (sometimes talked about as behaviors when speaking abstractly).
	public void Bark() {
		System.out.println(this.name + " says Arf arf!");
	}
	
	// Method Overloading - we can have multiple methods with the same name as long as they have different
						// 	number and types of parameters
	public void Bark(int times) {
		System.out.println("Arf Arf x " + times);
	}
	
	public void Bark(int times, int i) {
		System.out.println("Another implementation of the bark method");
	}
	
	// Notice that this class has no main() method - we don't need one because we're not running this class.
	
	
	
	
	
	
	
	
	
	
	
}
