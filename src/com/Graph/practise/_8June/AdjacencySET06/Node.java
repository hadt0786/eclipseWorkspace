package com.Graph.practise._8June.AdjacencySET06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

	int vertexNumber;
	Set<Integer> adjacentSet = new HashSet<>();

	public Node(int v) {
		this.vertexNumber = v;

	}
	
	public int getVertexNumber(int v) {
		return this.vertexNumber;
	}
	public void addNode(int v) {
		this.adjacentSet.add(v)
	}
	
	public List<Integer> getAdjacencyList(){
		List<Integer> sortedList = new ArrayList<>(this.adjacentSet);
		Collections.sort(sortedList);
		return sortedList;
	}

}
