package com.Graph.practise._8June.AdjacencySET04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

	int vertexNumber;
	Set<Integer> adjacentSet = new HashSet<>();

	public Node(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}

	public int getVertex() {
		return this.vertexNumber;
	}

	public void addNode(int vertexNumber) {
		this.adjacentSet.add(vertexNumber);
	}

	public List<Integer> getAdjancecySet() {
		List<Integer> sortedList = new ArrayList<>(this.adjacentSet);
		Collections.sort(sortedList);
		return sortedList;
	}

}
