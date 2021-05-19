package com.revature.abstraction;

/*
 * Abstract Classes - is a class that cannot be instantiated.
 * 					- contain unimplemented methods that MUST be overridden by a concrete subclass.
 * 
 * You CAN have concrete methods in an Abstract Class.
 * 
 * BUT - any class that has an abstract method - MUST be an Abstract class. 
 *  
 *  
 * */



public abstract class Star {
	
	public String name;
	public int age;
	
	
	/*
	 * Abstract Methods - have no implementation (no body {} ) only a method signature
	 * Any concrete subclass that extends this abstract class will be required to implement all of the abstract methods.
	 * 
	 * 
	 * */
	
	public abstract void supernova();
	
	public abstract void twinkle();
	
	// concrete method
	public void solarFlare() {
		System.out.println("Lots of radiation.");
	}

}
