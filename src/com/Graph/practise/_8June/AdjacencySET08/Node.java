
package com.Graph.practise._8June.AdjacencySET08;

import java.util.ArrayList
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

	int numVertex;
	Set<Integer> adjacencySet = new HashSet<>();

	public Node(int v) {
		this.numVertex = v;

	}

	public int getNodeVertex() {
		return this.numVertex;
	}

	public void addNode(int v) {
		this.adjacencySet.add(v);
	}

	public List<Integer> getAdjacencyList() {
		List<Integer> adjacencyList = new ArrayList<>(this.adjacencySet);
		Collections.sort(adjacencyList);
		return adjacencyList;
	}

}
