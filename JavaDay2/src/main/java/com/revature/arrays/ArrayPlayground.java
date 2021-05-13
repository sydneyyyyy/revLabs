package com.revature.arrays;

import java.util.Arrays;

public class ArrayPlayground {

	/*
	 * Arrays are collections of multiple values of the same type
	 * 
	 * Arrays have a  fixed length, determined at creation
	 * 
	 * Arrays can be pre-populated
	 * 
	 * Arrays are accessed by index (starts at 0 -> length - 1)
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		
		// Array Declaration
		int[] intArray = new int[10]; // size 10 array - length of 10.
		
		// Array literal (pre-populated)
		int[] otherArray = {1, 2, 3, 4, 5}; // length of 5
		
		System.out.println(intArray.length);
		System.out.println(otherArray.length);
		
		System.out.println(otherArray[0]); // references the 0th index of our array
		System.out.println(otherArray[4]);
//		System.out.println(otherArray[5]); Runtime Exception - ArrayIndexOutOfBoundsException
		
		int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(multiArray[0][2]);
		
		String[] strArray = {"Dan", "Is", "Awesome"};
		System.out.println(strArray[0]);
		
		int someInput = 5;
		String[] inputArray = new String[someInput];
		
		System.out.println("Before assignment: " + intArray[0]); // default values - int default value is 0
		intArray[0] = 100;
		System.out.println("After assignment: " + intArray[0]);
		
		// intArray[1] = "Hello"; putting string into int array 
		
		System.out.println(otherArray);
		System.out.println(strArray);
		
		System.out.println(Arrays.toString(otherArray));
		System.out.println(Arrays.toString(strArray));
		
		System.out.println(":::: FOR LOOP ::::");
		
		/*
		 * For Loops
		 * 
		 * for (initialization; condition; update) {
		 * 		instructions
		 * }
		 * 
		 * */
		for (int i = 0; i < otherArray.length; i++) { // unary operator - incrementing or decrementing
			System.out.println("Index: " + i);
			System.out.println("Value at Index: " + otherArray[i]);
		}
		
		// Enhanced For Loop
		for (int i : otherArray) {
			System.out.println(i);
		}
		
		for (String s : strArray) {
			System.out.println(s);
		}
		
		for (int[] i: multiArray) {
			for (int num: i) {
				System.out.println(num);
			}
			
		}
		
	}

}
