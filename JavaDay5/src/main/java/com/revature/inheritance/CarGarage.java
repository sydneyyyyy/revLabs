package com.revature.inheritance;

public class CarGarage {

	public static void main(String[] args) {
		
//		Car c = new Car("New Car", 800, "Black");
//		System.out.println(c);
//		
//		System.out.println(c.getName());
//		System.out.println(c.getMileage());
//		System.out.println(c.getColor());
//		
//		c.setName(null);
//		c.setMileage(-5);
//		c.setColor(null);
//		
//		System.out.println(c);
//		
//		c.setName("Crosstrak");
//		c.setMileage(80000);
//		c.setColor("purple");
//		
//		System.out.println(c);
//		
//		Car c = new Car();
//		c.drive();
//		
//		Subaru cross = new Subaru("Crosstrek", 12, "blue");
//		
//		System.out.println(cross);
//		
//		cross.drive();
//		cross.driveSomeDistance(3000);
//		System.out.println(cross);
//		
//		Car newCar = new Subaru("another car", 1000, "silver");
//		
//		newCar.drive();
//		newCar.drive(10);
////		 // only defined for Subaru objects - this object is defined as a car. 
//		System.out.println(newCar);
		
		Person dan = new Person("Dan", 100);
		
		Subaru s = new Subaru("Crosstrek", 6000, "red");
		
		dan.setCar(s);
		System.out.println(dan);
		
		Car c = new Car("Honda", 75000, "Silver");
		Person p = new Person("Dumbledore", 500, c);
		System.out.println(p);
		
		Person ron = new Person("Ron", 50, new Car("Ford", 54000, "blue"));
		System.out.println(ron);
	}
}
