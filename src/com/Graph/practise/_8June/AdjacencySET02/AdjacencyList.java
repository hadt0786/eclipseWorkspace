package com.Graph.practise._8June.AdjacencySET02;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8june09.Graph.GraphType;

public class AdjacencyList implements Graph {

	List<Node> adjacenyList = new ArrayList<>();
	int vertexNumber;
	GraphType graphType = GraphType.UNDIRECTED;

	public AdjacencyList(int vertexNumber, GraphType graphtype) {
		this.vertexNumber = vertexNumber;
		this.graphType = graphtype;

		for (int i = 0; i < this.vertexNumber; i++) {
			this.adjacenyList.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 > this.vertexNumber || v1 < 0 || v2 > this.vertexNumber || v2 < 0) {
			throw new IllegalArgumentException("Vertex number did not found");
		}

		this.adjacenyList.get(v1).addEdge(v2);
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacenyList.get(v2).addEdge(v1);
		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {
		if (v1 > this.vertexNumber || v1 < 0) {
			throw new IllegalArgumentException("Vertex number can;t be found");

		}
		return this.adjacenyList.get(v1).getAdjacencyList();
	}

}
