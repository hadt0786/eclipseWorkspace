package com.Graph.AdjacencySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Graph.Graph.GraphType;
import com.Graph.Adjacencymatrix.practise.Graph;

public class AdjacencySetGraph implements Graph {

	private List<Node> vertexList = new ArrayList<>();

	private GraphType graphType = GraphType.DIRECTED;

	private int numVertices = 0;

	public AdjacencySetGraph(int numVertices, GraphType graphType) {
		this.numVertices = numVertices;
		this.graphType = graphType;

		for (int i = 0; i < numVertices; i++) {
			vertexList.add(new Node(i));
		}
	}

	public class Node {

		private int vertexNumber;
		private Set<Integer> adjacencySet = new HashSet<>();

		public Node(int vertexNumber) {
			this.vertexNumber = vertexNumber;
		}

		public int getVertexNumber() {
			return vertexNumber;
		}

		public void addEdge(int vertexNumber) {
			adjacencySet.add(vertexNumber);
		}

		public List<Integer> getAdjacentVertices() {
			List<Integer> sortedList = new ArrayList<>(adjacencySet);
			Collections.sort(sortedList);
			return sortedList;
		}

	}

	@Override
	public void addEdge(int v1, int v2) {
		if (v1 > numVertices || v1 < 0 || v2 > numVertices || v2 < 0) {
			throw new IllegalArgumentException("Vertex number is not defined");

		}
		vertexList.get(v1).addEdge(v2);
		if(graphType== GraphType.UNDIRECTED) {
			vertexList.get(v2).addEdge(v2);
		}
		
	}

	@Override
	public List<Integer> getAdjacencyvetices(int v) {
		if (v > numVertices || v < 0 ) {
			throw new IllegalArgumentException("Vertex number is not defined");

		}
		
		
		return vertexList.get(v).getAdjacentVertices();
	}
}
