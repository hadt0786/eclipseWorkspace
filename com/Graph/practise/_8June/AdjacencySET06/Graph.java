package com.Graph.practise._8June.AdjacencySET06;

import java.util.List;

public interface Graph {
	
	enum GraohType{
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> adjacencyList (int v1);

}
