package com.revature.app;

import java.util.List;

import com.revature.models.Breed;
import com.revature.repositories.BreedRepository;




public class Driver {
	
	// Simulating Controller and Application layer all in one. 

	public static void main(String[] args) {
		
		BreedRepository br = new BreedRepository();
		
		List<Breed> breeds = br.getAll();
		
		for (Breed b : breeds) {
			System.out.println(b);
		}
		
		// typically frowned upon
		System.out.println("\n ");
//		
//		for (Breed b : MockDB.breeds) {
//			System.out.println(b);
//		}
		
		System.out.println(br.getById(1));
		
		Breed newBreed = new Breed("Jaguar");
		br.add(newBreed);
		
		for (Breed b : breeds) {
			System.out.println(b);
		}
		
//		System.out.println(br.getAll());
	}
	
}
