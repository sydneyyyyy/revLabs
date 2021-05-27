package com.revature.lambdas;

public class Spell {

	// Create Static Methods
	
	
	
	// Arrow notation - overriding method castSpell() saving it to a "fireball" reference
	static Magic fireball = () -> { System.out.println("Hurls a magic fireball!"); };
	
	static Magic alohomora = () -> { System.out.println("The lock is now open"); }; // need the ";" because this is a statement
	
	static Magic avadaKedavra = () -> { System.out.println("This curse is unforgiveable"); };
	
	
}
