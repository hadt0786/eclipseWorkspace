package com.Graph.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdjacencySetGraph implements Graph {

	public class Node {
		private int vertexNumber;
		private Set<Integer> adjacentSet = new HashSet<>();
		private int numVertices;

		public Node(int vertexNumber) {
			this.numVertices = numVertices;
		}

		public void addEdge(int v) {
			this.adjacentSet.add(v);
		}

		public int getVertexNumber() {
			return this.vertexNumber;
		}

		public List<Integer> getAdjacentVertices() {
			List<Integer> sortedList = new ArrayList<>(adjacentSet);
			Collections.sort(sortedList);
			return sortedList;
		}
	}

	private int numVertices;
	private List<Node> adjacentSet = new ArrayList<>();
	private GraphType graphType = GraphType.UNDIRECTED;

	public AdjacencySetGraph(int numVertices, GraphType graphType) {
		this.numVertices = numVertices;
		this.graphType = graphType;

		for (int i = 0; i < this.numVertices; i++) {
			this.adjacentSet.add(new Node(i));
		}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertices || v1 < 0 || v2 >= this.numVertices || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found in graph");

		}

		this.adjacentSet.get(v1).addEdge(v2);
		if (graphType == GraphType.UNDIRECTED) {
			this.adjacentSet.get(v2).addEdge(v1);
		}

	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {

		if (v >= this.numVertices || v < 0) {
			throw new IllegalArgumentException("Vertex not found");

		}

		return this.adjacentSet.get(v).getAdjacentVertices();
	}

}
