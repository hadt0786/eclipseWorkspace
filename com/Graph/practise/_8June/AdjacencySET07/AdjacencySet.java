package com.Graph.practise._8June.AdjacencySET07;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8June.AdjacencySET07.Graoh.GraphType;
import com.Graph.practise._8june07.Graph;

public class AdjacencySet implements Graph {

	int numVertex;
	GraphType graphType = GraphType.DIRECTED;
	List<Node> adjacencyList = new ArrayList<>();

	public AdjacencySet(int numVertex, GraphType graphtype) {
		this.numVertex = numVertex;
		this.graphType = graphtype;

		for (int i = 0; i < this.numVertex; i++) {
			this.adjacencyList.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertex || v1 < 0 || v2 >= this.numVertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex cant be found ");
		}

		this.adjacencyList.get(v1).addNode(v2);
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencyList.get(v2).addNode(v1);

		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {
		if (v1 >= this.numVertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex cant be found ");
		}

		return this.adjacencyList.get(v1).getAdjacencyNodeList();
	}

}
