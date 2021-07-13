package com.revature.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cats")
public class CatController {

//	private CatServicesImpl catServ;
//	
//	@Autowired
//	public CatController(CatServicesImpl catServ) {
//		this.catServ = catServ;
//	}
	
//	@RequestMapping(method=RequestMethod.GET, path="/cats")
//	public ResponseEntity<List<Cat>> getAllCats() {
//		
//	}
	
	// http://localhost:8080/catAppSpringWeb/cats
	
//	@GetMapping()
//	public ResponseEntity<List<Cat>> getAllCats() {
//		List<Cat> cats = catServ.getAllCats();
//		return ResponseEntity.ok(cats);
//	}
	
	// http://localhost:8080/catAppSpringWeb/cats/10
//	
//	@GetMapping(path="/{id}")
//	public ResponseEntity<Cat> getCatById(@PathVariable("id") int id) {
//		Cat c = catServ.getCatById(id);
//		return ResponseEntity.ok(c);
//	}
//	
//	
//	@PostMapping
//	public ResponseEntity<Cat> addCat(@RequestBody Cat c) { // I want to acknowledge that a new cat and end point have been created
//		Cat cat = catServ.addCat(c);
//		return ResponseEntity.created(URI.create("http://localhost:8080/CatAppSpringWeb" + cat.getId())).build();
//	}
//	
}




























