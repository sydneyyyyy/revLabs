package com.revature.utils;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Breed;
import com.revature.models.Cat;
import com.revature.models.Person;

public class MockDB {

	public static List<Person> peeps = new ArrayList<Person>();
	public static List<Cat> cats = new ArrayList<Cat>();
	public static List<Breed> breeds = new ArrayList<Breed>();
	
	// Create mock data for our db
	static { // executed at the time of loading a class - before main method starts loading
		
		// Cats
		Cat c = new Cat(1, "North", 4);
		cats.add(c);
		c = new Cat(2, "Cusco", 2);
		cats.add(c);
		
		cats.add(new Cat(3, "Persephone", 1));
		cats.add(new Cat(4, "Imhotep", 8000));
		cats.add(new Cat(5, "T-Shift", 11));
		cats.add(new Cat(6, "The Most Interesting Man in the World", 5));
		cats.add(new Cat(7, "Paddington", 2));
		cats.add(new Cat(8, "Caleb", 3));
		cats.add(new Cat(9, "Garfield", 71));
		
		
		// Breeds
		breeds.add(new Breed(1, "Calico"));
		breeds.add(new Breed(2, "Sphynx"));
		breeds.add(new Breed(3, "Maine Coon"));
		breeds.add(new Breed(4, "Tabby"));
		breeds.add(new Breed(5, "Scottish Fold"));
		
		
		// Person
		peeps.add(new Person(1, "catman", "kibbles"));
		peeps.add(new Person(2, "JohnR", "lasagna"));
		peeps.add(new Person(3, "phoebe", "smellycat"));
		peeps.add(new Person(4, "dan", "dantheman"));
		peeps.add(new Person(5, "jess", "ghostwriter"));
		
		
	}
	
	public static void main(String[] args) {
		
		for (Cat c: cats) {
			System.out.println(c);
		}
		
		for (Breed b : breeds) {
			System.out.println(b);
		}
		
		for (Person p : peeps) {
			System.out.println(p);
		}
	}
	
}
