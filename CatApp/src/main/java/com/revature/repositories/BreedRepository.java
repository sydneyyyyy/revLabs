package com.revature.repositories;

import java.util.List;

import com.revature.models.Breed;
import com.revature.utils.MockDB;

// Communicate with the database 
public class BreedRepository implements GenericRepository<Breed> {

	
	// unimplemented methods from GenericRepository and changing T - Breed
	@Override
	public Breed add(Breed b) {
		Breed breed = MockDB.breeds.stream().max((b1, b2) -> b1.getId().compareTo(b2.getId())).orElse(null);
		Integer id = (breed != null) ? breed.getId() + 1 : 1;
		b.setId(id);
		MockDB.breeds.add(b);
		return b;
	}

	// Using Streams to simulate connecting and retrieving and sending data to and from a db.
	@Override
	public Breed getById(Integer id) {
		Breed b = MockDB.breeds.stream().filter((breed) -> breed.getId() == id).findFirst().orElse(null);
		return b;
	}

	
	@Override
	public List<Breed> getAll() {
		return MockDB.breeds; // will return MockDB's list of breeds
	}

	@Override
	public boolean update(Breed b) {
//		Integer id = MockDB.breeds.indexOf(b);
//		b.setId(id);
		return false;
		
	}

	@Override
	public boolean delete(Breed b) {
		MockDB.breeds.remove(b);
		return true;
	}

}
