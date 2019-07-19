package com.DataStructure.June.DataStructure;

public class Node<T extends Comparable<T>> {

	// t -- any data type
	//

	// piece of information 
	private T data;
	private Node<T> next; // reference to the next node

	public Node(T data) {
		this.data = data;
		this.setNext(null);
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> next) {
		this.next = next;

	}

	public T getData() {
		return this.data;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

}