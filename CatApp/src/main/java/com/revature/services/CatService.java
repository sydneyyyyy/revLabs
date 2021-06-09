package com.revature.services;

import java.util.List;

import com.revature.models.Cat;

public interface CatService {

	// CRUD methods
	Cat addCat(Cat c);
	
	Cat getCat(Integer id);
	
	List<Cat> getAllCats();
	
	boolean updateCat(Cat c);
	
	boolean deleteCat(Cat c);
	
	// If our cat app needed more logic to it (we had the ability to adopt a cat)
	// Cat adoptCat(Cat c, Person p); this is where we would have logic to add a cat to a person's
	// list of cats.
	
}
