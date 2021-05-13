package com.revature.primitives;

public class PrimitivePlayground {

	public static void main(String[] args) {
		/*
		 * Variables
		 * 
		 * All variables only hold a single value
		 * 
		 * Primitives reserve a fixed amount of memory to hold a specific value of a specific type
		 * 
		 * In Java - there are 8 primitives:
		 * 
		 * Whole Numbers:
		 *  - Byte
		 *  - Short 
		 *  - char
		 *  - int
		 *  - long
		 * 
		 * Decimal Numbers:
		 *  - float
		 *  - double
		 * 
		 * Other:
		 *  - boolean
		 *  
		 * EVERYTHING else are reference variables (hold a reference to an object's location in memory)
		 *  
		 * */
		
		// Remember - Java is statically typed
		
		byte b = 127; // 1 byte or 8 bits (0000 0000)
		short s = 32767;
		char c = 'c'; // 2 bytes (16 bits) - just numbers in disguise
		// c + 4 = 103 = g -- 4 character after c
		int i = 2147483647; // 4 bytes (32 bits)
		long l = 9223372036854775807L; // 8 bytes (64 bits)
		float f = 3.4f;
		double d = 688.77;
		boolean bool = false;
		
		/*
		 * Casting
		 * 
		 * How we can convert from one data type to another
		 * Most conversions must be done explicitly
		 * 
		 * 
		 * */

		// Note that if casting down (down casting) won't always work.
		long longNum = 94l;
		int castedInt = (int) 1;
		System.out.println("Casted Int " + longNum); // concatenation
		
		// Casting up can be done implicitly - but it's always better to be explicit in your code. 
		
		long castInt = i;
		System.out.println(castInt);
	}

}
