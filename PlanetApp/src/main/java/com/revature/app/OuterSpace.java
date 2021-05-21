package com.revature.app;

import java.util.ArrayList;

import com.revature.exceptions.PlanetHasNoMoonsException;
import com.revature.models.Moons;
import com.revature.models.Planet;

public class OuterSpace {

	public static void main(String[] args) {
		
		ArrayList<Moons> moons = new ArrayList<Moons>();
		Planet mars = new Planet("Mars", 5555555, 84861511, false, moons );
		
		
		moons.add(new Moons("marsMoon1", 48181.0, 84166.0));
		moons.add(new Moons("marsMoon2", 48181.0, 84166.0));
		moons.add(new Moons("marsMoon3", 48181.0, 84166.0));
		moons.add(new Moons("marsMoon4", 48181.0, 84166.0));
		
		
		System.out.println(mars);
		
		Planet venus = new Planet("Venus", 484992919, 48491614, true);
		System.out.println(venus);
		try {
			for (Moons moon : venus.getMoons()) {
				System.out.println(moon);
			} 
		} catch (PlanetHasNoMoonsException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(mars.calculateSurfaceGravity());
		
	}
}
