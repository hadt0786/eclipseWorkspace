package com.practise.collection.CollectionPractise.ArrayList._07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to search an element in a array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList07 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		if (l.contains(10)) {
			System.out.println("true");
			System.out.println(l.indexOf(10));
			Collections.sort(l);
			System.out.println(Collections.binarySearch(l, 10));
		} else {
			System.out.println("false");
		}

	}

}
