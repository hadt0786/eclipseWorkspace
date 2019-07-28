package com.practise.collection.CollectionPractise.HashMap._01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		/*
		 * Write a Java program to associate the specified value with the specified key
		 * in a HashMap.
		 * 
		 * 
		 */

		HashMap<Integer, String> hash_map = new HashMap<>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "white");
		hash_map.put(5, "Blue");

		for (Map.Entry x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		/*
		 * Write a Java program to count the number of key-value (size) mappings in a
		 * map.
		 * 
		 * 
		 */

		System.out.println(hash_map.size());

		/*
		 * Write a Java program to copy all of the mappings from the specified map to
		 * another map.
		 * 
		 * 
		 */
		HashMap<Integer, String> hash_map2 = new HashMap<>();

		hash_map2.put(5, "white");
		hash_map2.put(7, "blue");
		hash_map2.put(8, "orange");
		hash_map2.put(9, "orange");
		hash_map2.put(10, "light green");

		hash_map2.putAll(hash_map);

		System.out.println(hash_map2);
		/*
		 * Write a Java program to remove all the mappings from a map.
		 * 
		 * 
		 */

		hash_map2.clear();

		System.out.println(hash_map2);

		/*
		 * Write a Java program to check whether a map contains key-value mappings
		 * (empty) or not.
		 * 
		 * 
		 */

		System.out.println(hash_map2.isEmpty());

		/*
		 * Write a Java program to get a shallow copy of a HashMap instance.
		 * 
		 * 
		 */

		HashMap<Integer, String> hashClone = (HashMap) hash_map.clone();
		System.out.println(hashClone);

		/*
		 * Write a Java program to test if a map contains a mapping for the specified
		 * key.
		 * 
		 * 
		 */

		if (hash_map.containsKey(1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		/*
		 * Write a Java program to test if a map contains a mapping for the specified
		 * value.
		 * 
		 * 
		 */

		if (hash_map.containsValue("white")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		/*
		 * Write a Java program to create a set view of the mappings contained in a map.
		 * 
		 * 
		 */

		Set set = hash_map.entrySet();

		System.out.println(set + " entry set ");

		/*
		 * Write a Java program to get the value of a specified key in a map.
		 * 
		 * 
		 */

		String val = (String) hash_map.get(3);
		System.out.println(val + " value at index  3");

		/*
		 * Write a Java program to get a set view of the keys contained in this map.
		 * 
		 * 
		 */

		Set s = hash_map.keySet();
		System.out.println(s + " key set ");

		/*
		 * Write a Java program to get a collection view of the values contained in this
		 * map.
		 * 
		 * 
		 */

		System.out.println("Collection view is " + hash_map.values());

	}

}
