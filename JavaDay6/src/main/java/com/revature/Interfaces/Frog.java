package com.revature.Interfaces;

// When you implement an interface - you MUST define implementation 
// for all of the abstract methods in that interface.
public class Frog extends Animal implements Amphibious, Ectothermic {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.swim();
		frog1.makeSound();
		frog1.heatUp();
		frog1.coolDown();
		
		Swimmable frog2 = new Frog();
		
		frog2.swim();
		frog2.floatOnWater();
//		frog2.makeSound();
		
		Animal frog3 = new Frog();
		
		System.out.println(frog3.numberOfLives);
		frog3.exist();
		frog3.makeSound();
//		frog3.swim(); // Animal doesn't implement swim - Frog does!
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Ribbit Ribbit!");
		
	}

	// Remember that Amphibious extends Swimmable
	// Frog will inherit the abstract swim() from Swimmable so we need to @Override it
	@Override
	public void swim() {
		System.out.println("The frog just keeps swimming.");
		
	}

	@Override
	public void coolDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heatUp() {
		// TODO Auto-generated method stub
		
	}

}
