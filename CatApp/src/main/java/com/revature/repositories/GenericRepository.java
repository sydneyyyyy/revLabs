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
	public boolean update(T t);
	
	
	
	// DELETE
	public boolean delete(T t);
	
	
}
