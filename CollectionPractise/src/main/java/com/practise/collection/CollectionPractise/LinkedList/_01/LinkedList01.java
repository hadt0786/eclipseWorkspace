package com.practise.collection.CollectionPractise.LinkedList._01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to append the specified element to the end of a linked
 * list.
 * 
 * Write a Java program to iterate through all elements in a linked list
 * starting at the specified position.
 * 
 * Write a Java program to iterate through all elements in a linked list.
 * 
 * Write a Java program to iterate a linked list in reverse order.
 * 
 * Write a Java program to insert the specified element at the specified
 * position in the linked list.
 * 
 * 
 * 
 * @author zibtek
 *
 */

public class LinkedList01 {

	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		for (Integer i = 0; i < 100; i++) {
			li.add(i);
		}
		li.add(2, 3333333);

		System.out.println(li);
//		System.out.println(li + " added to tail ");

		for (Integer i : li) {
//			System.out.println(i);
		}

		Iterator p = li.listIterator();

		while (p.hasNext()) {
//			System.out.println(p.next());
		}

		LinkedList<Integer> l = new LinkedList<Integer>(li);

		Iterator rev = l.descendingIterator();
		while (rev.hasNext()) {
//			System.out.println(rev.next() + " from linked list ");
		}

		

	}

}
