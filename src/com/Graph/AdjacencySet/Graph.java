package com.Graph.AdjacencySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Graph.Adjacencymatrix.practise.Graph;

public class Graph{
	
	
	
	
	public class Node {
		
	private	int vertexNumber;
	private	Set<Integer> adjacencySet = new HashSet<>();
	
	public Node(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}

	public int getVertexNumber() {
		return vertexNumber;
	}

	public void addEdge(int vertexNumber) {
		adjacencySet.add(vertexNumber);
	}
	
	public List<Integer> getAdjacentVertices(){
		List<Integer> sortedList = new ArrayList<> (adjacencySet);
		Collections.sort(sortedList);
		return sortedList;
	}
	
	

	}

	@Override
	public void addEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getAdjacencyvetices(int v) {
		// TODO Auto-generated method stub
		return null;
	}
}


