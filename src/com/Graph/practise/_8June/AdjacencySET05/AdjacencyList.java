package com.Graph.practise._8June.AdjacencySET05;

import java.util.ArrayList;
import java.util.List;

import com.Graph.Adjacencymatrix.practise.Graph;
import com.Graph.practise._8june05.Graph.GraphType;

public class AdjacencyList implements Graph {

	int numVertex;
	List<Node> adjacencyList = new ArrayList<>();
	GraphType graphType = GraphType.UNDRIRECTED;

	public AdjacencyList(int numVertex, GraphType graphType) {
		this.numVertex = numVertex;
		this.graphType = graphType;
		for (int i = 0; i < this.numVertex; i++) {
			this.adjacencyList.add(new Node(i));
		}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertex || v1 < 0 || v2 >= this.numVertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex vant be found");
		}
		this.adjacencyList.get(v1).addNode(v2);
		if (this.graphType == GraphType.UNDRIRECTED) {
			this.adjacencyList.get(v2).addNode(v1);
		}

	}

	@Override
	public List<Integer> getAdjacencyvetices(int v1) {
		if (v1 >= this.numVertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex vant be found");
		}

		return this.adjacencyList.get(v1).getAdjacencyList();
	}

}
