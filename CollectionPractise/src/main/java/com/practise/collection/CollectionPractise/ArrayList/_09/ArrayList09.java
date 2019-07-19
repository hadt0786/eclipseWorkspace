package com.practise.collection.CollectionPractise.ArrayList._09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to copy one array list into another.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList09 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		List<Integer> l1 = new ArrayList<>();

		for (Integer i = 100; i < 200; i++) {
			l1.add(i);
		}

		Collections.copy(l, l1);
		System.out.println(l1 + "\n " + l1);
	}

}
