package com.revature.Labs.Recursion;

public class TestFib {

	public static void main(String[] args) {
		// create an instance of fib
		Fib fib = new Fib();
		
		// call the Fibonacci method using different values (n) printing the result to the console
		int result = fib.fibonacci(2); // position ???
		System.out.println(result);
		
		result = fib.fibonacci(5);
		System.out.println(result);
		
		result = fib.fibonacci(10);
		System.out.println(result);
		
	}
}
