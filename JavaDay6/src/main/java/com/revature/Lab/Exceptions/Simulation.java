package com.revature.Lab.Exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
		getInput();
		
		
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		
		// get input from the user
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);
		
		// test if number is even, throw exception if true
		if (isEven(line)) {
			// Don't need a catch-block to use a try-block, but you cannot have a try-block without either a catch-block or a finally-block
			try {
				throw new EvenNumberException();
			} catch (EvenNumberException e) {
				e.printStackTrace();
			} finally {
				in.close();
			}
		}
		
		// close resources
		in.close();
		
	}
	
	public static boolean isEven(String num) {
		// convert value to a number
		int value = Integer.parseInt(num);
		
		return (value % 2 == 0);
	}
}
