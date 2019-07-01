package com.DataStructure.June.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

	private Node<T> head = null;

	public LinkedList() {

	}

	/* Add a node to linked list very end of a linked list **/

	public void addNode(T data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node<T> curr = this.head;
			while (curr.getNext() != null) {

				curr = curr.getNext();

			}
			curr.setNext(new Node<T>(data));
		}
	}

	/** Print all nodes in linked list **/

	public void printNodes() {
		if (this.head == null) {
			System.out.println(" Thre is no node in Linked list");
		} else {
			Node<T> curr = this.head;
			while (curr != null) {
				int i = 0;
				System.out.println("Node<T> number " + i + ", the vale it is" + curr.toString());
				curr = curr.getNext();
				i++;
			}
		}
	}

	/* Delete all the lement in the linked list */

	public void deleteLinkedList() {
		// java's garbage collector will clean up the memory for all the element being
		// used in
//		the linked list if they are no longer referenced in the progran
		this.head = null;
	}

	/**
	 * Insert at the n th position in the linked list
	 **/

	public void insertNth(int n, T data) {
		if (n > this.countNode()) {
			return;
		}
		if (n == 0) {
			Node<T> nextNode = this.head;
			this.head = new Node<T>(data);
			head.setNext(nextNode);
		} else {
			int i = 0;
			Node<T> curr = this.head;
			while (i < n - 1) {
				curr = curr.getNext();
				i++;
			}
			Node<T> next = curr.getNext();
			curr.setNext(new Node<T>(data));
			curr.getNext().setNext(next);

		}
	}

	/*
	 * Insert the data into correct position in a sorted list. Assume that the list
	 * is sorted in ascending order
	 * 
	 */

	public void insertSorted(T data) {
		if (this.countNode() == 0 || this.head.getData().compareTo(data) > 0) {
			Node<T> next = this.head;
			this.head = new Node<T>(data);
			this.head.setNext(next);
		} else {
			Node<T> curr = this.head;
			while (curr.getNext() != null && curr.getNext().getData().compareTo(data) < 0) {
				curr = curr.getNext();
			}
			Node<T> next = curr.getNext();
			curr.setNext(new Node<T>(data));
			curr.getNext().setNext(next);
		}
	}

	/**
	 * Append the nodes of the other list to the end of the current list
	 * 
	 */

	public void appnedLinkedList(LinkedList<T> ll) {
		if (ll.head == null) {
			return;
		} else {
			Node<T> curr = ll.head;
			while (curr.getNext() != null) {
				this.addNode((T) curr.getData());
				curr = curr.getNext();
			}
		}
	}

	/**
	 * Split a Linked list into 2 equal parts . If there are an odd number of
	 * elelemnts, the extra element should be in the first list
	 */

	public List<Node<T>> frontBackSplit() {
		Node<T> front = null, back = null;

		if (this.head == null) {
			front = null;
			back = null;
		} else if (this.head.getNext() == null) {
			front = this.head;
			back = null;
		} else {
			Node<T> fast = this.head, slow = this.head;
			while (fast != null) {
				fast = fast.getNext();
				if (fast == null) {
					break;
				}
				fast = fast.getNext();
				if (fast != null) {
					slow = slow.getNext();
				}

			}
			front = head;
			back = slow.getNext();
			slow.setNext(null);
		}
		List<Node<T>> list = new ArrayList<Node<T>>();
		list.add(front);
		list.add(back);

		return list;

	}

	/** return the first element i.e- pop- reffer to first element */

	public T popElement() {
		// head==null no element no first element return null
		if (head != null) {
			T topElement = head.getData();
			this.head = this.head.getNext();
			return topElement;
		}
		return null;

	}

	/* Count the number of nodes in linked list */
	public int countNode() {
		if (this.head == null) {
			return 0;
		}

		Node<T> curr = this.head;
		int count = 0;
		while (curr != null) {
			count++;
		}
		return count;

	}

}
