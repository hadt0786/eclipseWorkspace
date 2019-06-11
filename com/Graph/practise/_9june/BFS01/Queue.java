package com.Graph.practise._9june.BFS01;

import java.lang.reflect.Array;

public class Queue<T> {

	private static final int SPECIAL_EMPTY_value = -1;
	private static final int MAX_SIZE = SPECIAL_EMPTY_value;
	private T[] elements;

	private int headIndex = SPECIAL_EMPTY_value;
	private int tailIndex = SPECIAL_EMPTY_value;

	public Queue(Class<T> clazz) {
		this(clazz, MAX_SIZE);
	}

	public Queue(Class<T> clazz, int maxSize) {

		this.elements = (T[]) Array.newInstance(clazz, maxSize);

	}

	public void enqueue(T data) throws QueueOverFlowException{
		if(isFull()) {
			throw new QueueOverFlowException()
			
			
		}
		
		tailIndex = (tailIndex+1) % elements.length;
		elements[tailIndex] = data;
		
		if(headIndex == SPECIAL_EMPTY_value) {
			headIndex = tailIndex;
			
		}
		
	}

	public boolean offer(T data) {
		if (isFull()) {
			return false;
		}
		try {
			enqueue(data);
		} catch (QueueOverFlowException qoe) {

		}
		return true;
	}

	public T dequeue() throws QueueUnderFlowException {
		if (isEmpty()) {
			throw new QueueUnderFlowException();
		}
		T data = this.elements[headIndex];

		// this was the last element in the queue
		if (headIndex == tailIndex) {
			headIndex = SPECIAL_EMPTY_value;
		} else {
			headIndex = (headIndex + 1) % this.elements.length;
		}
		return data;
	}

	public T peek() throws QueueUnderFlowException {
		if (isEmpty()) {
			throw new QueueUnderFlowException();
		}
		return this.elements[headIndex];
	}

	public boolean isEmpty() {

		return headIndex == SPECIAL_EMPTY_value;

	}

	public boolean isFull() {

		int nextIndex = (tailIndex + 1) % this.elements.length;
		return nextIndex == headIndex;

	}

	public static class QueueOverFlowException extends Exception {

	}

	public static class QueueUnderFlowException extends Exception {

	}

}
