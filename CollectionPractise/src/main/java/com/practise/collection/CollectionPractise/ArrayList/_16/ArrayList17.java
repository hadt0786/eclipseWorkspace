package com.practise.collection.CollectionPractise.ArrayList._16;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to empty an array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList17 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l1.add(i);
		}

		System.out.println(l1 + " " + l1.isEmpty());
		l1.removeAll(l1);
		System.out.println(l1 + " " + l1.isEmpty());

	}

}
