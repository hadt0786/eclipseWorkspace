package com.Graph.practise._8June.AdjacencySET03;

import java.util.ArrayList;
import java.util.List;

public class AdjacencySet implements Graph {

	int vertexNmber = 0;
	GraphType graohType = GraphType.UNDIRECTED;
	List<Node> adjacencyList = new ArrayList<>();

	public AdjacencySet(int vertexNumber, GraphType graphType) {
		this.vertexNmber = vertexNumber;
		this.graohType = graphType;

		for (int i = 0; i < this.vertexNmber; i++) {
			this.adjacencyList.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {
		if (v1 >= this.vertexNmber || v1 < 0 || v2 >= this.vertexNmber || v2 < 0) {
			throw new IllegalArgumentException("Vertex number cant found ");
		}

		this.adjacencyList.get(v1).addNode(v2);
		if (this.graohType == GraphType.UNDIRECTED) {

			this.adjacencyList.get(v2).addNode(v1);

		}
	}

	@Override
	public List<Integer> getAdjacencyList(int v1) {
		if (v1 >= this.vertexNmber || v1 < 0) {
			throw new IllegalArgumentException("Vertex number cant found ");
		}

		return this.adjacencyList.get(v1).getAdjacencyList();
	}

}
