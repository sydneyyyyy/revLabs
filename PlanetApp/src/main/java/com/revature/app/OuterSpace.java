package com.revature.app;

import com.revature.models.Planet;

public class OuterSpace {

	public static void main(String[] args) {
		
		Planet mars = new Planet("Mars", 5555555, 84861511, false);
		
		System.out.println(mars);
		
		System.out.println(mars.calculateSurfaceGravity());
		
	}
}
