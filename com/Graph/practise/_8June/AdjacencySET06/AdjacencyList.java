package com.Graph.practise._8June.AdjacencySET06;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8June.AdjacencySET05.Graph.GraphType;

public class AdjacencyList implements Graph {

	int vertex;
	List<Node> adjacencyList = new ArrayList<>();
	GraphType graphtype = GraphType.DIRECTED;

	public AdjacencyList(int vertexNumber, GraphType graphtype) {
		this.vertex = vertexNumber;
		this.graphtype = graphtype;

		for (int i = 0; i < this.vertex; i++) {
			this.adjacencyList.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.vertex || v1 < 0 || v1 >= this.vertex || v1 < 0) {
			throw new IllegalArgumentException("vertex cant be found ");
		}

		this.adjacencyList.get(v1).addNode(v2);
		if (this.graphtype == GraphType.UNDIRECTED) {
			this.adjacencyList.get(v2).addNode(v1);
		}

	}

	@Override
	public List<Integer> adjacencyList(int v1) {
		if (v1 >= this.vertex || v1 < 0) {
			throw new IllegalArgumentException("vertex cant be found ");
		}
		return this.adjacencyList.get(v1).getAdjacencyList();
	}

}
