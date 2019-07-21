package com.practise.collection.CollectionPractise.LinkedList._11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Write a Java program to display the elements 
 * and their positions in a linked list.

 */

public class LinkedList11 {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<>();

		for (int i = 0; i < 100; i++) {
			li.add(i);
		}

		System.out.println("Orginal linked list " + li);

		for (int i = 0; i < li.size(); i++) {
			System.out.println("element at index " + li.get(i));
		}

//		Write a Java program to remove a specified element from a linked list.

		li.remove(2);
		System.out.println(li);

// Write a Java program to remove first and last element from a linked list.

		li.removeFirst();
		li.removeLast();

		System.out.println(li);

// Write a Java program to remove all the elements from a linked list.

//		li.clear();

		System.out.println(li);

//		Write a Java program of swap two elements in an linked list.

		Collections.swap(li, 0, 2);

		System.out.println(li);

//		Write a Java program to shuffle the elements in a linked list.

		Collections.shuffle(li);

		System.out.println(li);

//		Write a Java program to join two linked lists.

		LinkedList<Integer> li2 = new LinkedList<Integer>();

		for (int i = 101; i < 200; i++) {
			li2.add(i);
		}

		LinkedList<Integer> li3 = new LinkedList<Integer>();

		li3.addAll(li);
		li3.addAll(li2);

		System.out.println(li3 + " coming li3 ");

//		Write a Java program to clone an linked list to another linked list.

		LinkedList<Integer> cloneLi = new LinkedList<Integer>();
		cloneLi = (LinkedList) li.clone();
//		cloneLi.getClass().getName();
//		System.out.println(cloneLi.getClass().getName());
		System.out.println(cloneLi);

// Write a Java program to remove and return the first element of a linked list.
		Collections.sort(li);
		li.pop();
		System.out.println(li);
// Write a Java program to retrieve but does not remove, the first element of a linked list.

		Integer x = li.peekFirst();

		System.out.println(x + " " + li);

// Write a Java program to retrieve but does not remove, the last element of a linked list.

		Integer y = li.peekLast();
		System.out.println(y + " " + li);

		// Write a Java program to check if a particular element exists in a linked
		// list.

		if (li.contains(4)) {
			System.out.println("present ");
		} else {
			System.out.println("false");
		}

		if (li.contains(200)) {
			System.out.println("present");
		} else {
			System.out.println("false");
		}

// Write a Java program to convert a linked list to array list.

		List<Integer> liToArray = new ArrayList<>(li);

		for (Integer i : li) {
			System.out.println(i);
		}
// Write a Java program to compare two linked lists.

		LinkedList<String> c3 = new LinkedList<String>();
		for (Integer e : li)
			c3.add(li.contains(e) ? "Yes" : "No");
		System.out.println(c3);

		// Write a Java program to test an linked list is empty or not.

		System.out.println(c3.isEmpty());
		c3.removeAll(c3);
		System.out.println(c3.isEmpty());

		// Write a Java program to replace an element in a linked list.

		li.set(0, 0);
		System.out.println(li);

// Write a Java program to check if a particular element exists in a linked list.

	}

}
