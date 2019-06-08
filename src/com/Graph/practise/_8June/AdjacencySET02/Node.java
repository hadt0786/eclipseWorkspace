package com.Graph.practise._8June.AdjacencySET02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	
	int vertexNumber;
	Set<Integer> adjacentSet = new HashSet<>();
	
	public Node (int vertexNumber) {
		this.vertexNumber = vertexNumber;
	
	}
	
	public int getVertexNumber() {
		return this.vertexNumber;
	}
	
	public void addEdge(int vertexNumber) {
		
		this.adjacentSet.add(vertexNumber);
		
		
	}
	public List<Integer> getAdjacencyList(){
		List<Integer> sortedList = new ArrayList<>(this.adjacentSet);
		Collections.sort(sortedList);
		return sortedList;
	}

}
