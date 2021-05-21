package com.revature.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		User u1 = new User("admin", "password", 100);
		User u2 = new User("bono", "pass", 99);
		
//		users.add(u);
//		users.add(u2);
//		// because this is a list we can have duplicates
//		users.add(u);
		
//		users.add("Hello"); // can't have different objects in an ArrayList
		
//		System.out.println(users);
//		
//		for (User user: users) {
//			user.setAge(user.getAge() + 1);
//		}
//		
//		for (User user : users) {
//			System.out.println(user);
//		}
//		
		
		
		/*
		 * Map - an object that 'maps' keys to values. Key - Value pairs.
		 * 
		 * A map cannot contain duplicate keys
		 * 
		 * Each key maps to at most one value.
		 * 
		 * HashMap - can contain one null value for a key (only one key in the map can be null)
		 * 
		 * 	- HashMaps do not preserve order
		 * 
		 * Syntax:
		 * 
		 * 		Map<K, V> map = new HashMap<K, V>();
		 * 
		 * TreeMap
		 * LinkedHashMap -> preserves order of insertion
		 * 
		 * */
		
		User u3 = new User("Tony", "pass", 44);
		User u4 = new User("Harry", "igloo", 99);
		User u5 = new User("George", "clooney", 993);
		
		
		Map<String, User> userMap = new HashMap<String, User>();
		
		userMap.put("admin", u1);
		userMap.put("bono", u2);
		userMap.put("Tony", u3);
		userMap.put("Harry", u4);
		userMap.put("George", u5);
		
//		System.out.println(userMap);
		
		User u6 = new User("helena", "fox", 50);
		User u7 = new User("benji", "halloween", 55);
		User u8 = new User("michael", "david", 548);
		
		List<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		
//		for (User u : userList) {
//			userMap.put(u.getUsername(), u);
//		}
//		
//		System.out.println(userMap);
		
		// iterate over maps 
		// .keySet();
		System.out.println("-------------keySet()-----------------");
		for (String key : userMap.keySet()) {
			System.out.println("Key: " + key + "\nValue: " + userMap.get(key));
		}
		
		// .entrySet();
		System.out.println("-------------entrySet()-------------");
		for (Map.Entry<String, User> entry : userMap.entrySet()) {
			String key = entry.getKey();
			User us = entry.getValue();
			System.out.println("Key: " + key + " Value: " + us);
		}
		
		// .values();
		System.out.println("-----------values()---------------");
		for (User use: userMap.values()) {
			System.out.println(use);
		}
		
		// .forEach() - * more details on this later.
		System.out.println("-------------forEach()-------------");
		userList.forEach(user -> System.out.println(user));
		
		
	}
	
	

}
 