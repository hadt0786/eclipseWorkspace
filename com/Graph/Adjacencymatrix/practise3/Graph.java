package com.Graph.Adjacencymatrix.practise3;

import java.util.List;

public interface Graph {
	
	enum GraphType {
		UNDIRECTED, DIRECTED
	}
	
	void addEdges(int v1, int v2);
	
	List<Integer> getAdjacencyList(int v);

}
