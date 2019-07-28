package com.practise.collection.CollectionPractise.TreeSet._01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// Write a Java program to create a new tree set, add some
		// colors (string) and print out the tree set.

		TreeSet<Integer> t = new TreeSet<>();
		Collection c = new ArrayList<>();
		for (Integer i = 0; i < 50; i++) {
			c.add(i);
		}
		Collections.shuffle((List<?>) c);

		System.out.println(c);

		t.addAll(c);

		System.out.println(t + " tress set ");

		/*
		 * Write a Java program to iterate through all elements in a tree set.
		 * 
		 * 
		 */

		for (Integer i : t) {
			System.out.println(i + " from tree set ");
		}

		TreeSet<Integer> t2 = new TreeSet<Integer>();

		for (int i = 40; i < 80; i++) {
			t2.add(i);
		}

		t.addAll(t2);

		System.out.println(t + " add all tree2 ");

		/*
		 * Write a Java program to create a reverse order view of the elements contained
		 * in a given tree set.
		 * 
		 * 
		 */

		Iterator it = t.descendingIterator();

		while (it.hasNext()) {
			System.out.println(it.next() + " from iterator ");
		}

		/*
		 * Write a Java program to get the first and last elements in a tree set.
		 * 
		 * 
		 * 
		 */

		Object firstEle = t.first();
		System.out.println(firstEle + " first element of tree set");

		Object lastEle = t.last();
		System.out.println(lastEle + " tree set last ele ");

		/*
		 * Write a Java program to clone a tree set list to another tree set.
		 * 
		 * 
		 */

		TreeSet<Integer> cloneTree = (TreeSet<Integer>) t.clone();

		System.out.println(cloneTree + " clone tress");

		/*
		 * Write a Java program to get the number of elements in a tree set.
		 * 
		 * 
		 */

		System.out.println(t.size() + "size of a tree set ");

		/*
		 * Write a Java program to compare two tree sets.
		 * 
		 * 
		 */

		for (Integer i : t) {
			System.out.println(t.contains(i) ? "yes" : "No");
		}

		/*
		 * Write a Java program to find the numbers less than 7 in a tree set.
		 * 
		 * 
		 */

		TreeSet<Integer> treeHead = new TreeSet<Integer>();

		treeHead = (TreeSet) t.headSet(30);

		Iterator it2 = treeHead.iterator();
		while (it2.hasNext()) {
			System.out.printf(it2.next() + " ");
		}

		/*
		 * Write a Java program to get the element in a tree set which is greater than
		 * or equal to the given element.
		 * 
		 * 
		 */

		TreeSet<Integer> tree1 = new TreeSet<>();

		for (Integer i = 0; i < 1000; i++) {
			tree1.add(i);
		}

		TreeSet<Integer> tree2 = new TreeSet<Integer>();

		System.out.println(" Greter than or equal to 50 " + tree1.ceiling(50));

		/*
		 * Write a Java program to get the element in a tree set which is less than or
		 * equal to the given element.
		 * 
		 * 
		 */

		System.out.println(" less than or equal to 40 " + tree1.floor(40));

		/*
		 * Write a Java program to get an element in a tree set which is strictly
		 * greater than the given element.
		 * 
		 */

		System.out.println("Strictly greater than 76 : " + tree1.higher(76));

		/*
		 * Write a Java program to get an element in a tree set which is strictly less
		 * than the given element.
		 * 
		 * 
		 */

		System.out.println("Strictly less than 69 : " + tree1.lower(69));

		/*
		 * Write a Java program to retrieve and remove the first element of a tree set.
		 * 
		 * 
		 */

		System.out.println("Removes the first(lowest) element: " + tree1.pollFirst());
		System.out.println(tree1);
		
		/*
		 * Write a Java program to retrieve and remove the last element of a tree set.


		 */
		   System.out.println("Removes the last element: "+tree1.pollLast());
		   
		   /*
		    * Write a Java program to remove a given element from a tree set.


		    */
		   System.out.println("Removes 70 from the list: "+tree1.remove(2));
		   System.out.println(tree1);


	}

}
