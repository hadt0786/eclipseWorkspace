package com.practise.collection.CollectionPractise.ArrayList._14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program of swap two elements in an array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList14 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l1.add(i);
		}

		Collections.swap(l1, 1, 10);
		System.out.println(l1);

	}

}
