package com.revature.encapsulation.b;

import com.revature.encapsulation.a.Shape;

public class BPlayground {

	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.publicMethod();
//		s.protectedMethod(); // Only accessible in the same package and or in child classes. 
//		s.defaultMethod(); // only accessible in the package defined it's in
//		s.privateMethod(); // only accessible in the class it was defined
		
		Rectangle r = new Rectangle();
		
		r.publicMethod(); // Rectangle is a child class of Shape - Rectangle inherits all of the same methods. 
		r.publicRectangeMethod();
	}

}
