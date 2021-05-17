package com.revature.passbyvalueexample;

public class Example {
	
	// You can define classes in other classes
	// Static so that we don't need an instance of Example class in order to make a Dog instance
	public static class Dog {
		String name;
	}
	
	public static void main(String[] args) {
		
//		int x = 5;
//		
//		change(x);
//		
//		System.out.println(x);
//		
//		// x = actuallyChange(x);
//		// system.out.println(x);
//		System.out.println(actuallyChange(x));
		
		Dog d = new Dog();
		d.name = "Petunia";
		
		someChange(d);
		
		System.out.println(d.name);
		
		anotherChange(d);
		System.out.println(d.name);
	}
	
	// Method
	public static void someChange(Dog d) {
		// Because Java is Pass By Value - this does not change the Dog d in the main method
		// We passes the value of d into this method - value of d -> reference to a location/address in memory
		// Then we call a new Constructor() ->	 
		d = new Dog(); // creates a new object
		// and because Java makes copies of values that it passes into methods
		// This d now points to a new location in memory (our d in main method has not changed) 
		d.name = "Jimmy";
	}
	// if we wanted to make a change
	public static void anotherChange(Dog d) {
		d.name = "Harry";
	}
	
	public static void change(int x) { // Java makes a copy of the value of x (Primitive)
		// and so - even thought we set x = 10, this does not affect x in our main method
		x = 10;
		
	}
	
	// if we wanted to change the value of x... 
	public static int actuallyChange(int x) {
		x = 10;
		return x;
	}
}
