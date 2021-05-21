package com.revature.labs.Overloading;

public class OverloadedMethods {

	public static void main(String[] args) {
		// create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		
		om.print("second print method.");
		om.print("Second", "Third");

	}
	
	// overload methods here
	public void print() {
		System.out.println("Original print method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
	
}
