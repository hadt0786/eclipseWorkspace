package com.Graph.practise._8June.AdjacencySET04;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList implements Graph {

	int vertexNumber;
	List<Node> adjacencyList = new ArrayList<>();
	GraphType graphType = GraphType.UNDIRECTED;

	public AdjacencyList(int vertexNumber, GraphType graohType) {
		this.vertexNumber = vertexNumber;
		this.graphType = graphType;

		for (int i = 0; i < this.vertexNumber; i++) {
			this.adjacencyList.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.vertexNumber || v1 < 0 || v1 >= this.vertexNumber || v1 < 0) {
			throw new IllegalArgumentException("Vertex Number not found");
		}

		this.adjacencyList.get(v1).addNode(v2);
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencyList.get(v2).addNode(v1);
		}
	}

	@Override
	public List<Integer> getadjacencyList(int v1) {
		if (v1 >= this.vertexNumber || v1 < 0) {
			throw new IllegalArgumentException("Vertex Number not found");
		}
		return this.adjacencyList.get(v1).getAdjancecySet();
	}

}
