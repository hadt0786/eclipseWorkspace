package com.practise.collection.CollectionPractise.ArrayList._08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * Write a Java program to sort a given array list.
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList08 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i, i);
		}

		Collections.shuffle(l);
		Collections.sort(l);
		System.out.println(l);

	}

}
