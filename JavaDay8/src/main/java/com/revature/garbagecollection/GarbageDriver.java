package com.revature.garbagecollection;

public class GarbageDriver {

	public static void main(String[] args) {
		
		System.out.println("Instantiating a new GarbageDriver object");
		
		GarbageDriver garbage = new GarbageDriver();
		System.nanoTime();
		
		System.out.println("GarbageDriver object successfully created!");
		
		System.out.println("Some amount of time passes...");
		
//		.finalize();
		try {
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
//		System.out.println("Assign the variable garbage to null");
//		garbage = null;
		
		System.out.println("Assign the variable 'garbage' to some other GarbageDriver object");
		garbage = new GarbageDriver();
		
		System.gc(); // NEVER DO THIS
		
		// infinite loop
		int i = 0;
		for (;;) {
			System.out.println(i++);
		}
		
	}
	
	@Override
	protected void finalize() { // comes from the Object class
		System.out.println("GarbageDriver's finalize() method called!");
		System.out.println("Goodbye, cruel world...");
		System.out.println(System.nanoTime());
		System.exit(0);
	}
	
	
	
	
	
}
