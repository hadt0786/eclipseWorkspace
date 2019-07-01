package com.DataStructure.June.DataStructure_23June_01;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

	private Node<T> head = null;

	public LinkedList() {

	}

	/** Print all the nodes in the linked list */

	public static void printode(Node head) {
		Node curr = head;
		if (head == null) {
			return;
		}
		int i = 1;
		while (curr != null) {
			System.out.println("This is the node number " + i + " the value of it store is" + " " + curr.toString());
			curr = curr.getNextNode();
			i++;
		}
	}

	/** Append a new node in the Linked List */

	public void appendToTail(T data) {
		if (this.head == null) {
			return;
		}
		Node<T> pointer = this.head;
		while (pointer != null) {
			pointer = pointer.getNextNode();
		}
		pointer.setNode(new Node(data));
	}

	/** Count the number of nodes in the linked list */

	public int countNodes() {
		if (this.head == null) {
			return 1;
		}
		int count = 1;
		Node<T> pointer = this.head;

		while (pointer != null) {

			pointer = pointer.getNextNode();
			count++;
		}
		return count;

	}

	/** Return the first element in the list */

	public T popElement() {
		if (this.head == null) {
			return this.head.getdata();
		} else {
			T topElement = this.head.getdata();
			this.head = head.getNextNode();
			return topElement;

		}
	}

	/**
	 * Delete all the elements in the linked list.
	 */

	public void deleteLinkedList() {
		// This is the easiest code every written in Java, no clean up
		// required. Java's garbage collector will clean up the memory
		// for all the elements being used in this linked list if
		// they are no longer referenced in the program.
		this.head = null;
	}

	/**
	 * Insert at the nth position in the list. Return if the number of nodes is less
	 * than n.
	 */

	public void insertNthNode(int n, T data) {

		if (n > this.countNodes()) {
			return;
		}

		if (n == 0) {
			Node<T> nNode = this.head;
			this.head = new Node(data);
			this.head.setNode(nNode);
		} else {
			// Move the curr node to one before the position where we
			// want to insert the element and adjust the pointers accordingly.

			int i = 0;
			Node<T> pointer = this.head;
			while (i < n - 1) {
				pointer = pointer.getNextNode();
				i++;
			}
			Node<T> next = pointer.getNextNode();
			pointer.setNode(new Node<T>(data));
			pointer.getNextNode().setNode(next);
		}

	}

}
