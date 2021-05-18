package com.revature.strings;

public class StringPlayground {

	public static void main(String[] args) {
		
		// Strings are Objects in Java 
		// Strings are NOT mutable - cannot change them!!
		// There are two ways to create a string:
		
		// String Literal - live in the pool to save memory
		String s1 = "Hello";
		
		// use a constructor
		String s2 = new String("Hello"); // forcing Java to create a new object in the HEAP outside of the String pool.
//		System.out.println(s1);
//		System.out.println(s2);
		
		// charAt();
		System.out.println(s1.charAt(0));
		
		// indexOf();
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('l'));
		
		// length()
		System.out.println(s1.length());
		
		// substring()
		System.out.println(s1.substring(2)); // second index on...
		System.out.println(s1.substring(2, 3)); // does not include character at ending index.
		System.out.println(s1.substring(2, 4));
		
		// equals()
		System.out.println(s1.equals(s2)); // returns a boolean value
		
		/*
		 * NOTE: with strings == is not the same as equals() 
		 * */
		
		System.out.println(s1 == s2); 
		
		
		// StringBuilder - an object that manipulates Strings - basically to make them mutable
		StringBuilder sb = new StringBuilder("My name is Sydney.");
		
		System.out.println(sb);
		
		sb.append(" Nice to meet you.");
		
		System.out.println(sb);
//		
//		String greeting = "My name is Sydney.";
//		
//		String g2 = greeting + " Nice to meet you."; // Not best practices
		
		// substring()
		String sub = sb.substring(10);
		System.out.println(sub);
		int index = sb.indexOf("N");
		System.out.println(index);
		
		// replace()
		sb.replace(0, 19, "");
		System.out.println(sb);
		
		
		
		
		
	}
	
	
}
