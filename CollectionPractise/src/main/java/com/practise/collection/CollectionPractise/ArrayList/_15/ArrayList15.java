package com.practise.collection.CollectionPractise.ArrayList._15;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to join two array lists.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList15 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();

		for (Integer i = 0; i < 60; i++) {
			l1.add(i);
		}
		List<Integer> l2 = new ArrayList<>();

		for (Integer i = 60; i < 80; i++) {
			l2.add(i);
		}

		l1.addAll(l2);

		System.out.println(l1);

	}

}
