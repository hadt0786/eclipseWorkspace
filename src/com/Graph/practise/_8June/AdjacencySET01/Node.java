package com.Graph.practise._8June.AdjacencySET01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	
	int vertexNumber;
	
	Set<Integer> adjacencySet = new HashSet<>();
	
	public Node(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}
	
	public int getVertexNumber() {
		return this.vertexNumber;
	}
	
	public void addEdge(int vertexNumber) {
		this.adjacencySet.add(vertexNumber);
	}
	
	public List<Integer> getAdjancentVertex(){
		List<Integer> sortedList = new ArrayList<>(this.adjacencySet);
		Collections.sort(sortedList);
		return sortedList;
	}

}
