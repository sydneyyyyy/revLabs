package com.revature.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPlayground {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(intArray[0]);
		System.out.println(intArray[6]);
		
		try {
			
			System.out.println(intArray[9]);
			
		} catch (ArrayIndexOutOfBoundsException e) { // have the more specific exception first otherwise the second catch block will not be reachable.
			
			e.printStackTrace();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}

}
