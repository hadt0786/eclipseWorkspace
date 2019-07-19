package com.DataStructure.June.DataStructure_29June_01.Stack;

import java.lang.reflect.Array;

public class Queue<T> {

	private static final int SPECIAL_EMPTY_VALUE = -1;
	private static int MAX_SIZE = 40;
	private T[] elements;

	// the head index is initialiasied to a special value
	// indicate queue is empty
	private int headIndex = SPECIAL_EMPTY_VALUE;
	private int tailIndex = SPECIAL_EMPTY_VALUE;

	public Queue(Class<T> clazz) {
		this.elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public boolean isFull() {
		int nextIndex = (tailIndex + 1) % elements.length;
		return this.headIndex == nextIndex;
	}

	public boolean isEmpty() {
		return this.headIndex == SPECIAL_EMPTY_VALUE;
	}

	public void enqueue(T data) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException();
		}
		this.tailIndex = (this.tailIndex + 1) % elements.length;
		elements[this.tailIndex] = data;

		if (this.headIndex == SPECIAL_EMPTY_VALUE) {
			this.headIndex = tailIndex;
		}
	}

	public T dequeu() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException();
		}

		T data = elements[headIndex];
		if (this.headIndex == this.tailIndex) {
			this.headIndex = SPECIAL_EMPTY_VALUE;
		} else {
			this.headIndex = (this.tailIndex + 1) % elements.length;
		}
		return data;

	}

	public static class QueueOverflowException extends Exception {

	}

	public static class QueueUnderflowException extends Exception {

	}

}
