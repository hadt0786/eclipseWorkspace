package com.practise.collection.CollectionPractise.LinkedList._10;

import java.util.LinkedList;
import java.util.List;

/***
 * Write a Java program to get the first and last occurrence of the specified
 * elements in a linked list.
 * 
 * 
 * @author zibtek
 *
 */

public class LinkedList10 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();

		for (Integer i = 0; i < 100; i++) {
			l.add(i);
		}

		Object first = l.getFirst();
		Object last = l.getLast();

		System.out.println(first + " " + last + " ");
		List<Integer> li = new LinkedList<>(l);

		System.out.println(li + " list ");

	}

}
