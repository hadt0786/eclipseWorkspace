package com.practise.collection.CollectionPractise.PriorityQueue._01;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		/*
		 * Write a Java program to create a new priority queue, add some colors (string)
		 * and print out the elements of the priority queue.
		 * 
		 * 
		 */

		PriorityQueue<Integer> p = new PriorityQueue<>();

		for (Integer i = 0; i < 100; i++) {
			p.add(i);
		}

		System.out.println("Queue at the time of initialisation " + p);

		/*
		 * Write a Java program to iterate through all elements in priority queue.
		 * 
		 * 
		 */

		for (Integer i : p) {
			System.out.println("  p q at element " + i);
		}

		/*
		 * Write a Java program to add all the elements of a priority queue to another
		 * priority queue.
		 * 
		 * 
		 */

		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		for (Integer i = 90; i < 200; i++) {
			p2.add(i);
		}

		p.addAll(p2);
		System.out.println(p + " with element ");

		/**
		 * Write a Java program to insert a given element into a priority queue.
		 * 
		 * 
		 */

		p.offer(2);
		System.out.println(p);

		/**
		 * Write a Java program to remove all the elements from a priority queue.
		 * 
		 * 
		 */

//		p.clear();
		System.out.println(p);

		/*
		 * Write a Java program to count the number of elements in a priority queue.
		 * 
		 * 
		 */
		System.out.println(p.size());

		/*
		 * Write a Java program to compare two priority queues.
		 * 
		 * 
		 */

		for (Integer i : p) {
			System.out.println(p.contains(i) ? "yes" : "no");
		}

		/*
		 * Write a Java program to retrieve the first element of the priority queue.
		 * 
		 * 
		 */

		System.out.println(p.peek() + " peek element ");

		/*
		 * Write a Java program to retrieve and remove the first element.
		 * 
		 * 
		 */
		System.out.println(p.poll());
		System.out.println(p);

		/*
		 * Write a Java program to convert a priority queue to an array containing all
		 * of the elements of the queue.
		 * 
		 * 
		 */

		List<Integer> li = new ArrayList<>(p);
		System.out.println(li + " pq to array list ");
		
		/*
		 * Write a Java program to convert a Priority Queue elements to a string representation.


		 */
		
		StringBuilder st = new StringBuilder(p.toString());
		System.out.println(st);
		
		/*
		 * Write a Java program to change priorityQueue to maximum priorityqueue.


		 */
		
		System.out.println("befire pq "+p);
		Integer val = null;
		while( (val = p.poll()) != null) {
		    System.out.print(val+"  ");
		      }
			  System.out.print("\n");
		  }

}
