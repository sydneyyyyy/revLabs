package com.revature.Labs.Classes;

public class Ball {
	// ball properties
	String size;
	String color;

	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing.");
	}
	public static void main(String[] args) {
		// instances with reference variables
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		
		// declare initial state
		b1.size = "big";
		b1.color = "red";
		b2.size = "small";
		b2.color = "blue";
		
		// invoke the bounce method
		b1.bounce();
		b2.bounce();
		

	}

}
