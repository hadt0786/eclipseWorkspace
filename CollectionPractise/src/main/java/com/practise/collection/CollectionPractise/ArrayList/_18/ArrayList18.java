package com.practise.collection.CollectionPractise.ArrayList._18;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to trim the capacity of an array list the current list
 * size.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList18 {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		System.out.println(l1.size());

		for (Integer i = 0; i < 100; i++) {
			l1.add(i);
		}

		l1.trimToSize();

		System.out.println(l1.size());

	}

}
