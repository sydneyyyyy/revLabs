package com.revature.lambdas;


@FunctionalInterface
public interface Magic {
	
	// variables have to be "public static final int count = 0;"

	// can only have one abstract method - implicitly "public abstract" 
	void castSpell();
	
	// Default here is not the access modifier that provides package private access
	default void beOminous() {
		System.out.println("Boo");
	}
	
}
