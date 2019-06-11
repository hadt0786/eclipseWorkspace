package com.Graph.practise._8June.AdjacencySET08;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8June.AdjacencySET08.Graph.GraphType;

public class AdjacecncySet implements Graph {

	int numvertex;
	List<Node> adjacencySet = new ArrayList<>();
	GraphType graphType = GraphType.UNDIRECTED;

	public AdjacecncySet(int v, GraphType graphtype) {
		this.numvertex = v;
		this.graphType = graphtype;

		for (int i = 0; i < this.numvertex; i++) {
			this.adjacencySet.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numvertex || v1 < 0 || v2 >= this.numvertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found");

		}

		this.adjacencySet.get(v1).addNode(v2);
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencySet.get(v2).addNode(v1);
		}

	}

	@Override
	public List<Integer> adjacencyLisy(int v1) {
		if (v1 >= this.numvertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex not found");

		}
		return this.adjacencySet.get(v1).getAdjacencyList();
	}

}
