package com.revature.encapsulation.b;

import com.revature.encapsulation.a.Shape;

// Extends is the keyword we use to create child classes or subclasses => when we 
// want to extend that class.
public class Rectangle extends Shape {

	public void publicRectangeMethod() {
		System.out.println("Public Rectangle Method");
//		this.protectedMethod(); // only available because Rectangle = child of Shape
		
	}
}
