package com.practise.collection.CollectionPractise.ArrayList._07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to search an element in a array list.
 * 
 * 
 * 
 */

public class ArrayList01 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 1000; i++) {
			l.add(i);

		}
		System.out.println(l + "befire ");
		Collections.shuffle(l);
		Collections.sort(l);
		System.out.println(l + "after  ");

		if (l.contains(3)) {
			System.out.println(l.indexOf(3));
		} else {
			System.out.println("not found ");
		}
		//Collections.binarySearch(l, 3);
		System.out.println(Collections.binarySearch(l, 3) + " index ");

	}

}
