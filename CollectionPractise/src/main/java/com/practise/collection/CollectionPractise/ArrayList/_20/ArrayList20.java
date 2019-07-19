package com.practise.collection.CollectionPractise.ArrayList._20;

import java.util.ArrayList;

/**
 * Write a Java program to increase the size of an array list. Write a Java
 * program to print all the elements of a ArrayList using the position of the
 * elements.
 * 
 * 
 * 
 * @author zibtek
 *
 */

public class ArrayList20 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList();

		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1.size());
		l1.ensureCapacity(6);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1.size());
		l1.set(5, 88888888);
		System.out.println(l1);

		for (Integer i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}

}
