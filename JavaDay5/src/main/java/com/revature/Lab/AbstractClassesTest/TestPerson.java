package com.revature.Lab.AbstractClassesTest;

import com.revature.Lab.AbstractClasses.Developer;
import com.revature.Lab.AbstractClasses.Person;

public class TestPerson {
	
	public static void main(String[] args) {
		
		// indirectly instantiate the abstract class - polymorphism
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
		
		
	}
}
