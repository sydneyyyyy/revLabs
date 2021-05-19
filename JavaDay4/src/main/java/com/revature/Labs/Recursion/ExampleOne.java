package com.revature.Labs.Recursion;

public class ExampleOne {

	public static void main(String[] args) {
		// create some dummy data for our method
		int input = 5;
		
		ExampleOne eo = new ExampleOne();
		
		
		// call your methods here
		System.out.println(eo.factorial(input));
		
	}
	
	// create your first method here
	public int factorial (int num) {
		
		// base case - return a value directly 
		if (num <= 0) return 0;
		if (num == 1) return 1;
		
		// returns num and calls itself with num - 1
		return num * factorial(num-1);
	}
	
}
