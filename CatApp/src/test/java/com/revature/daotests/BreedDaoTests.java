package com.revature.daotests;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import com.revature.models.Breed;
import com.revature.repositories.BreedDAO;


// This is all thats required for our project0

public class BreedDaoTests {
	
	private BreedDAO bdao = new BreedDAO();

	@Test
	public void getAllBreedsTest() {
		
		List<Breed> breeds = new ArrayList<Breed>();
		Breed b1 = new Breed(1, "Calico");
		Breed b2 = new Breed(2, "Bengal");
		Breed b3 = new Breed(3, "Tabby");
		Breed b4 = new Breed(4, "Sphynx");
		Breed b5 = new Breed(5, "Siamese");
		Breed b6 = new Breed(6, "Panther");

		breeds.add(b1);
		breeds.add(b2);
		breeds.add(b3);
		breeds.add(b4);
		breeds.add(b5);
		breeds.add(b6);
		
		Assert.assertEquals(breeds, bdao.getAll());
	}
	
	@Test
	public void getBreedByIdTest() {
		
		System.out.println(bdao.getById(1));
		
	}
	
	@Test
	public void addBreedTest() {
		
		Breed b = new Breed("Add Test 2");
		Assert.assertEquals(true, bdao.add(b));
	}
	
	
	
}
