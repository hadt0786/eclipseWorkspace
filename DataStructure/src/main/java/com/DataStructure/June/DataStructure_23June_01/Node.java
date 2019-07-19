package com.DataStructure.June.DataStructure_23June_01;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T getdata() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return this.next;
	}

	public void setNode(Node<T> node) {
		this.next = node;
	}
	
	public String toString() {
		return String.valueOf(this.data);
		
	}

}
