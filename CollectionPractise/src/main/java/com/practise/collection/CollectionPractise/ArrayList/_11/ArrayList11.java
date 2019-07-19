package com.practise.collection.CollectionPractise.ArrayList._11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*888
 * Write a Java program to reverse elements in a array list.


 */

public class ArrayList11 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		Collections.reverse(l);
		System.out.println(l);

	}

}
