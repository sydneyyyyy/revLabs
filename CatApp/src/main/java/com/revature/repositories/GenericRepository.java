package com.revature.repositories;

import java.util.List;

public interface GenericRepository<T> {

	// These will be the methods that align with CRUD operations (how we interact with the database)
	
	// CREATE - adding to database
	public T add(T t);
	
	
	// READ - get things from database
	public T getById(Integer id);
	
	public List<T> getAll();
	
	
	// UPDATE 
	public void update(T change);
	
	
	
	// DELETE
	public void delete(T t);
	
	
}
