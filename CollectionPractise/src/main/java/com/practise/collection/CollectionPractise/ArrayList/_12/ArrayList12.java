package com.practise.collection.CollectionPractise.ArrayList._12;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to compare two array lists.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList12 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
		for (Integer i = 0; i < 50; i++) {
			l1.add(i);
		}
		for (Integer i = 50; i < 100; i++) {
			l2.add(i);
		}

		ArrayList<Integer> l3 = new ArrayList<>();

		for (Integer i : l1) {
			l3.add(l2.contains(i) ? 0 : 1);
		}
		System.out.println(l3);
	}
//		ArrayList<String> c1 = new ArrayList<String>();
//		c1.add("Red");
//		c1.add("Green");
//		c1.add("Black");
//		c1.add("White");
//		c1.add("Pink");
//
//		ArrayList<String> c2 = new ArrayList<String>();
//		c2.add("Red");
//		c2.add("Green");
//		c2.add("Black");
//		c2.add("Pink");
//
//		// Storing the comparison output in ArrayList<String>
//		ArrayList<String> c3 = new ArrayList<String>();
//		for (String e : c1)
//			c3.add(c2.contains(e) ? "Yes" : "No");
//		System.out.println(c3);
//
//	}
}
