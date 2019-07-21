package com.practise.collection.CollectionPractise.HashSet._01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSet01 {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<>();

		// Write a Java program to append the specified element to the end of a hash
		// set.

		for (int i = 0; i < 256; i++) {
			h.add(i);
		}

		h.add(3);

		System.out.println(h);

// Write a Java program to iterate through all elements in a hash list.

		Iterator<Integer> p = h.iterator();

		while (p.hasNext()) {
			System.out.println(p.next());
		}

//		Write a Java program to get the number of elements in a hash set.
		System.out.println("Number of elements " + h.size());

// Write a Java program to empty an hash set.

//		h.removeAll(h);
//		
//		System.out.println(h.size()+ " " + h);

// Write a Java program to test a hash set is empty or not.

		System.out.println(h.isEmpty());
//		h.removeAll(h);
		System.out.println(h.isEmpty());

		HashSet<Integer> h2 = new HashSet<Integer>();
		h2 = (HashSet) h.clone();
		System.out.println(h2);

// Write a Java program to convert a hash set to an array.

		Integer[] arrayOfHash = new Integer[h.size()];

		h.toArray(arrayOfHash);

		System.out.println("Array Element" + arrayOfHash);

		for (Integer i : arrayOfHash) {
			System.out.print(i);
		}

// Write a Java program to convert a hash set to a tree set.

		System.out.println(h);

		Set<Integer> tree_set = new TreeSet<Integer>(h);

		System.out.println("Tree set element");

		for (Integer i : tree_set) {
			System.out.print(" elements " + i);
		}
// Write a Java program to convert a hash set to a List/ArrayList.

		List<Integer> li = new ArrayList<Integer>(h);
		System.out.println(li + " convert to array list ");

// Write a Java program to compare two hash sets.

		HashSet<Boolean> hasCOmpare = new HashSet<Boolean>();

		for (Integer i : h) {
			System.out.println(h.contains(i) ? true : false);
		}

// Write a Java program to remove all of the elements from a hash set.

//		h.clear();
		System.out.println(h.size());

// Write a Java program to compare two sets and retain elements which are same on both sets.

		li.retainAll(h);

		System.out.println(li);

	}

}
