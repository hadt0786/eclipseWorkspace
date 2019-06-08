package com.Graph.practise._8June.AdjacencySET07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
	
	int vertexNumber ; Set<Integer> setNodes = new HashSet<>();
	
	public Node(int v ) {
		this.vertexNumber = v ;
	}
	public int getNodeVertex() {
		return this.vertexNumber;
	}
	public void addNode(int v) {
		this.setNodes.add(v);
	}
	public List<Integer> getAdjacencyNodeList() {
		List<Integer> sortedList = new ArrayList<>(this.setNodes);
		Collections.sort(sortedList);
		return sortedList;
	}

}
