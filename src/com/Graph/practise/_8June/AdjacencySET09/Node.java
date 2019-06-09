
package com.Graph.practise._8June.AdjacencySET09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	
	int numVertex ; Set<Integer> adjacentSet = new HashSet<>();
	
	public Node(int v ) {
		this.numVertex = v;
	}
	public int getVertexNumber() {
		return this.numVertex;
	}
	public void addNode(int vertex) {
		this.adjacentSet.add(vertex);
	}
	public List<Integer> getAdjacencyList(){
		List<Integer> sortedList = new ArrayList<>();
		Collections.sort(sortedList);
		return sortedList;
	}
	

}
