package com.practise.collection.CollectionPractise.ArrayList._16;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to clone an array list to another array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList16 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l1.add(i);
		}
		List<Integer> l2 = new ArrayList<>(l1);

		System.out.println(l2);

	}

}
