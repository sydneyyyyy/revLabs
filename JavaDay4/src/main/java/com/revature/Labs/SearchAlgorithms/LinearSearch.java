package com.revature.Labs.SearchAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// create some dummy data for our method
		char letter = 'm';
		
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		// Create an instance of Linear Search 
		LinearSearch ls = new LinearSearch();
		
		// call your methods here
		int result = ls.findIndex(letter, letters);
		System.out.println(result);
		
	}
	
	// create your first method here
	
	public int findIndex(char target, char[] data) {
		if (data == null) return -1;
		
		int result = -1;
		
		// loop through the data
		for (int i = 0; i < data.length; i++) {
			char temp = data[i];
			
			// test current element against target
			if ( temp == target ) {
				return i; // return the current index
			}
		}
		
		return result;
	}
}
