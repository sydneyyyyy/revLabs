package com.revature.Lab.Stack;

import java.util.Arrays;

public class Stack {

	private int lastItem = 0;
	private int[] items = new int[0];
	
	// add items to the stack - implementing Push()
	public void push(int newItem) {
		
		// get current length to store as index
		int index = items.length; 
		System.out.println("The array length is: " + index);
		
		// increase the array by 1 so that we can add our new item 
		items = new int[items.length + 1];
		System.out.println("items after extending the length by 1: " + Arrays.toString(items));
	
		// Store the value in the index
		items[index] = newItem;
		System.out.println("items after storing the new value: " + Arrays.toString(items));
		
		
		// update lastItem
		lastItem = newItem;
		System.out.println("The last item: " + lastItem);
		
	}
	
	// remove items from the stack - Implementing Pop
	// Arrays are fixed-sized objects in Java, we'll have to copy over all of the 
	// elements to a new array and get rid of the old one. 
	public int pop() {
		
		// Store the last item into a variable
		int tempItem = lastItem;
		
		// copy a new array but remove last item
		int[] newArray = new int[items.length - 1];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = items[i];
		}
		
		// update the items array
		items = newArray;
		
		// update lastItem
		lastItem = items[items.length - 1];
		
		// return our 'popped' element
		return tempItem;
		
	}
	
	// view last item
	public int peek() {
		return 0;
	}
	
}
