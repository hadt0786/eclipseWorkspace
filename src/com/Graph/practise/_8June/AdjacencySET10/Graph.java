package com.Graph.practise._8June.AdjacencySET10;

import java.util.List;

public interface Graph {
	
	enum GraphType { 
		UNDIRECTED, DIRECTED
	}
	void addEdge(int v1, int v2);
	List<Integer> adjacencyList (int v1);

}
