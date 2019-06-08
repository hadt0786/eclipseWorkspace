package com.Graph.practise._8June.AdjacencySET01;

import java.util.List;

public class AdjancecyList implements Graph {

	private List<Node> adjacencyList;
	int numvertex;
	GraphType graphType = GraphType.UNDIRECTED;

	public AdjancecyList(int numvertex, GraphType graphType) {
		this.numvertex = numvertex;
		this.graphType = graphType;

		for (int i = 0; i < this.numvertex; i++) {
			this.adjacencyList.add(new Node(i));
		}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numvertex || v1 < 0 || v1 >= this.numvertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex number can;t be found ");
		}

		this.adjacencyList.get(v1).addEdge(v2);

		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencyList.get(v2).addEdge(v1);
		}

	}

	@Override
	public List<Integer> adjacencyList(int v1) {
		if (v1 >= this.numvertex || v1 < 0 ) {
			throw new IllegalArgumentException("Vertex number can;t be found ");
		}
		
		
		return this.adjacencyList.get(v1).getAdjancentVertex();
	}

}
