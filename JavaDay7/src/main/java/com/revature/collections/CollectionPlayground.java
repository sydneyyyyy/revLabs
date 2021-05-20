package com.revature.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {

	public static void main(String[] args) {
	
		// Creating a List
//		List<String> names = new ArrayList<String>();
		
		/*
		 * Why List<> and ArrayList<>
		 * 
		 * Coding to interfaces - any implementation of List shares functionality (.add(), .remove(), etc).
		 * 
		 * ALL lists share these methods - they have their own implementations
		 * 
		 * */
		
		// OLD WAY
		// have to specify a size and cannot change
//		String[] names2 = new String[5];
//		
//		names.add("Dan");
//		names.add("Ryan");
//		names.add("Sierra");
//		names.add("Richard");
//		names.add("Adam");
//		
//		// put in at the specified index and pushes the remaining names
//		names.add(2, "Tyler");
//		
//		System.out.println(names);
//		System.out.println(names.size());
//		
//		
//		
//		List<Integer> intList = new ArrayList<Integer>();
//		
		List<User> users = new ArrayList<User>();
		
		User u = new User("admin", "password", 100);
		User u2 = new User("bono", "pass", 99);
		
		users.add(u);
		users.add(u2);
		// because this is a list we can have duplicates
		users.add(u);
		
//		users.add("Hello"); // can't have different objects in an ArrayList
		
		System.out.println(users);
		
		for (User user: users) {
			user.setAge(user.getAge() + 1);
		}
		
		for (User user : users) {
			System.out.println(user);
		}
		
	}

}
 