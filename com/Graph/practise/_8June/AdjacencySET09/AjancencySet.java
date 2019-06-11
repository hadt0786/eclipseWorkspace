package com.Graph.practise._8June.AdjacencySET09;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8June.AdjacencySET07.Graoh.GraphType;

public class AjancencySet implements Graph {

	int numVertex;
	GraphType graphTyoe = GraphType.UNDIRECTED;
	List<Node> adjacentList = new ArrayList<>();

	public AjancencySet(int v, GraphType graphType) {
		this.numVertex = v;
		this.graphTyoe = graphType;

		for (int i = 0; i < this.numVertex; i++) {
			this.adjacentList.add(new Node(i));
		}
	}

	@Override
	public void addEnde(int v1, int v2) {
		if (v1 >= this.numVertex || v1 < 0 || v2 >= this.numVertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex cant be found ");
		}

		this.adjacentList.get(v1).addNode(v2);
		if (this.graphTyoe == GraphType.UNDIRECTED) {
			this.adjacentList.get(v2).addNode(v1);
		}

	}

	@Override
	public List<Integer> adjacencyList(int v1) {
		if (v1 >= this.numVertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex cant be found ");
		}

		return this.adjacentList.get(v1).getAdjacencyList();
	}

}
