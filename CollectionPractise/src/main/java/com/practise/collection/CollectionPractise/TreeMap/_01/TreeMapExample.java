package com.practise.collection.CollectionPractise.TreeMap._01;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		/*
		 * Write a Java program to associate the specified value with the specified key
		 * in a Tree Map.
		 * 
		 * 
		 */

		TreeMap<Integer, String> tree_map = new TreeMap<>();

		tree_map.put(1, "Red");
		tree_map.put(2, "Green");
		tree_map.put(3, "Black");
		tree_map.put(4, "White");
		tree_map.put(5, "Blue");

		for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		/*
		 * Write a Java program to copy a Tree Map content to another Tree Map.
		 * 
		 * 
		 */

		TreeMap<Integer, String> tree_map2 = new TreeMap<>();

		tree_map2.put(6, "Red");
		tree_map2.put(7, "Green");
		tree_map2.put(8, "Black");
		tree_map2.put(9, "White");
		tree_map2.put(1, "Blue");

		tree_map.putAll(tree_map2);

		System.out.println(tree_map);

		/*
		 * Write a Java program to search a key in a Tree Map.
		 * 
		 * 
		 */

		if (tree_map.containsKey(1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		/*
		 * Write a Java program to search a value in a Tree Map.
		 * 
		 * 
		 */

		if (tree_map.containsValue("white")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		/*
		 * Write a Java program to get all keys from the given a Tree Map.
		 * 
		 * 
		 */

		Set<Integer> keys = tree_map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}

		/*
		 * Write a Java program to delete all elements from a given Tree Map.
		 * 
		 * 
		 */

//		tree_map.clear();
		System.out.println(tree_map);

		/*
		 * Write a Java program to sort keys in Tree Map by using comparator.
		 * 
		 * 
		 * 
		 */

		TreeMap<String, String> tree_map3 = new TreeMap<String, String>(new sort_key());

		tree_map3.put("C2", "Red");
		tree_map3.put("C4", "Green");
		tree_map3.put("C3", "Black");
		tree_map3.put("C1", "White");
		System.out.println(" sorted tree map =>" + tree_map3);

		/*
		 * Write a Java program to get a key-value mapping associated with the greatest
		 * key and the least key in a map.
		 * 
		 * 
		 */

		System.out.println(tree_map.firstEntry());
		System.out.println(tree_map.lastEntry());

		/*
		 * Write a Java program to get the first (lowest) key and the last (highest) key
		 * currently in a map.
		 * 
		 * 
		 */

		System.out.println("Gretaes key " + tree_map.firstKey());
		System.out.println("least key " + tree_map.lastKey());

		/*
		 * Write a Java program to get a reverse order view of the keys contained in a
		 * given map.
		 * 
		 * 
		 */

		System.out.println("reverse order view of the keys " + tree_map.descendingKeySet());
		System.out.println("rever " + tree_map.descendingMap());

		/*
		 * Write a Java program to get a key-value mapping associated with the greatest
		 * key less than or equal to the given key.
		 * 
		 * 
		 */

		System.out.println(" Checking the enetry for 4 " + tree_map.floorEntry(4));

		/*
		 * Write a Java program to get the greatest key less than or equal to the given
		 * key.
		 * 
		 * 
		 * 
		 */

		System.out.println(" Checking the entry for 4 " + tree_map.floorKey(4));

		/*
		 * Write a Java program to get the portion of a map whose keys are strictly less
		 * than a given key.
		 * 
		 * 
		 */

		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.headMap(4));

		/*
		 * Write a Java program to get the portion of this map whose keys are less than
		 * (or equal to, if inclusive is true) a given key.
		 * 
		 * 
		 */

		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.headMap(5, true));

		/*
		 * Write a Java program to get the least key strictly greater than the given
		 * key. Return null if there is no such key.
		 * 
		 * 
		 */

		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.higherEntry(6));

		/*
		 * Write a Java program to get a key-value mapping associated with the greatest
		 * key strictly less than the given key. Return null if there is no such key.
		 * 
		 * 
		 */

		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.lowerEntry(7));

		/*
		 * Write a Java program to get the greatest key strictly less than the given
		 * key. Return null if there is no such key.
		 * 
		 * 
		 */

		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.lowerKey(6));

		/*
		 * Write a Java program to get NavigableSet view of the keys contained in a map.
		 * 
		 * 
		 */

		System.out.println("Orginal TreeMap content: " + tree_map.navigableKeySet());

		/*
		 * Write a Java program to remove and get a 
		 * key-value mapping associated with the least key in a map.


		 */
		
		System.out.println("Value returned: " + tree_map.pollFirstEntry());
		
		/*
		 * Write a Java program to remove and get a 
		 * key-value mapping associated with the greatest key in this map.


		 */
		
		
		
		  System.out.println("Value returned: " + tree_map.pollLastEntry());

		  /*
		   * Write a Java program to get the portion of a 
		   * map whose keys range from a given key (inclusive), 
		   * to another key (exclusive).


		   */
		  
		  SortedMap<Integer, String> st = new TreeMap<Integer, String>();
		  
		  System.out.println(tree_map);
		  st = tree_map.subMap(2, 4);
		  System.out.println("sub map key "+st );
		  
		  /*
		   * Write a Java program to get the portion of a 
		   * 
		   * map whose keys range from a given key to another key.


		   */
		  
		  st = tree_map.subMap(2, true, 6, true);
		  System.out.println("Sub map key-values: " + st);
		  
/*
 * Write a Java program to get a portion of a map whose keys 
 * are greater than or equal to a given key.


 */
		  
		  System.out.println("Keys are greater than or equal to 3: " +tree_map.tailMap(7));
		
		
		/*
		 * Write a Java program to get a portion of a map 
		 * whose keys are greater than to a given key.


		 */
		  
		  System.out.println("Keys are greater than 3: false " + tree_map.tailMap(3, false));
		  System.out.println("Keys are greater than 3: true " + tree_map.tailMap(3, true));

		/*
		 * Write a Java program to get a key-value 
		 * mapping associated with the least key greater than or 
		 * equal to the given key. Return null if there is no such key.


		 */
		
		
		  System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(2));
		  System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(4));
		  System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));
		
		/*
		 * Write a Java program to get the least key greater than or 
		 * equal to the given key. Returns null if there is no such key.


		 */
		  System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(2));
		  System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(3));
		  System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
	}

}

class sort_key implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {

		return arg0.compareTo(arg1);
	}

}
