package com.revature.Lab.AbstractClasses;

public class Developer extends Person {
	
	// inherits the name property and methods from Person

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

}
