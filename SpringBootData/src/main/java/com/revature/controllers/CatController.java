package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Cat;
import com.revature.services.CatServiceImpl;

@RestController
@RequestMapping(path="/cats")
public class CatController {
	
	private CatServiceImpl cs;
	
	// this is the preferred way (Constructor Injection)
	@Autowired
	public CatController(CatServiceImpl cs) {
		this.cs = cs;
	}
	
	@GetMapping(produces="application/json")
	public List<Cat> getAllCats() {
		return cs.getAllCats();
	}

	// add in Post, Update, and Delete Mapping
	// Test with Postman
	
	@GetMapping(path="/{id}")
	public Cat getCat(@PathVariable("id") int id) {
		return cs.getCat(id);
	}
	
	@PostMapping()
	public Cat addCat(@RequestBody Cat c) {
		return cs.addCat(c);
	}
	
	@PutMapping()
	public Cat update(@RequestBody Cat c) {
		return cs.updateCat(c);
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteCat(@PathVariable("id") int id) {
		cs.deleteCat(id);
	}
	
	
	
	
}
