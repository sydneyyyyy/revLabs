package com.revature.inheritance;

public class Person { // implicitly extends the Object class

	private String name;
	private int age;
	private Car car;
	
	
	public Person() {
		super();
	}

	// Constructor Overloading 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	// without - will print out hashcode - implicitly extending Object class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
	
	
	
	
	
	
}
