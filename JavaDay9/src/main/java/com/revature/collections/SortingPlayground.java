package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Collections: a class filled with static methods used to manipulate collections
 * 
 * NOT to be confused with Collection -> which is an interface that provides the standard functionality of a collection
 * 		this is sometimes also referred to as the Collection API (Application Programming Interface)
 * 
 * 
 * */

public class SortingPlayground  {

	public static void main(String[] args) {
		
		// We also have an Arrays Class
		int[] intArr = {6, 3, 52, 44, 66, 87, 2, 2333, 77, 0, 7, 21, 1, 5};
		System.out.println("Before sorting...");
		
		for (int i: intArr) {
			System.out.println(i);
		}
		
		Arrays.sort(intArr);
		
		System.out.println("\nAfter sorting....");
		
		for (int i: intArr) {
			System.out.println(i);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(5);
		intList.add(8);
		intList.add(0);
		
		System.out.println("\nIntList Before Sort....");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		
		System.out.println("\nIntList after sort....");
		
		Collections.sort(intList);
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		/*
		 * Both TreeSet and TreeMap order the insertion of objects into the collection based
		 * on a sorting method.
		 * 
		 * 		Whether it be implicit (String, primitives)
		 * 		Or explicit (implementing Comparable or passing an instance of a Comparator to the Constructor)
		 * 
		 * TreeSet and TreeMap sort at the moment of insertion.
		 * 
		 * */
		
		Set<String> myExampleTreeSet = new TreeSet<>();
		myExampleTreeSet.add("hello");
		myExampleTreeSet.add("1hello");
		myExampleTreeSet.add("!hello");
		myExampleTreeSet.add(" world");
		myExampleTreeSet.add("word");
		myExampleTreeSet.add("Word");
		myExampleTreeSet.add("wOrd");
		myExampleTreeSet.add("word!");
		
		System.out.println("\nTreeSet....");
		for (String s: myExampleTreeSet) {
			System.out.println(s);
		}
		
		// key - value pairs
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		// sorted as they are inserted
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(3, "Three");
		treeMap.put(4, "Four");
		treeMap.put(5, "Five");
		
		System.out.println("\nSo do TreeMaps");
		
		// Map does not implement iterable
//		for (Integer i : treeMap.keySet()) {
//			System.out.println(i + " => " + treeMap.get(i));
//		}
		
		// Sorts the treeMap as we are inserting them
		Iterator it = treeMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		Map<User, Integer> umap = new TreeMap<User, Integer>();
		
		umap.put(new User("John", 55), 1001);
		umap.put(new User("Steve", 35), 54848);
		umap.put(new User("Mary", 19), 78362);
		umap.put(new User("Mavis", 88), 288264);
		umap.put(new User("Nick", 28), 4194616);

		umap.forEach((user, num) -> System.out.println(user + " => " + num));
		
		// can't instantiate this class because it is Private!
//		Collections col = new Collections();
	}
	
	
}
