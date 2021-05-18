package com.revature.encapsulation.a;

public class APlayground {

	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.publicMethod(); // anywhere within the application
		s.protectedMethod(); // same package and children of the class
		s.defaultMethod(); // same package 
//		s.privateMethod(); // inside the same class 
	}
	
	
}
