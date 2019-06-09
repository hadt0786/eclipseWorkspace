package com.Graph.practise._8June.AdjacencySET10;

import java.util.ArrayList;
import java.util.List;

import com.Graph.practise._8June.AdjacencySET10.Graph.GraphType;

public class AdjacencySet implements Graph {

	int numVertex;
	GraphType graphtype = GraphType.UNDIRECTED;
	List<Node> adjacent = new ArrayList<>();

	public AdjacencySet(int v, GraphType graphType) {
		this.numVertex = v;
		this.graphtype = graphType;

		for (int i = 0; i < this.numVertex; i++) {
			this.adjacent.add(new Node(i));
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if(v1>=this.numVertex || v1<0 || v2>=this.numVertex || v2<0) {
			throw new IllegalArgumentException("Vertex cant be found ");
			
		}
		
		this.adjacent.get(v1).addNode(v2);
		if(this.graphtype == GraphType.UNDIRECTED) {
			this.adjacent.get(v2).addNode(v1);
		}
		
		
		
	}

	@Override
	public List<Integer> adjacencyList(int v1) {
		if(v1>=this.numVertex || v1<0) {
			throw new IllegalArgumentException("Vertex not found ");
		}
		return this.adjacent.get(v1).getAdjacencyList();
	}

}
