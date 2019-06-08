package com.Graph.practise._8June.AdjacencySET07;

import java.util.List;

public interface Graoh {

	enum GraphType{
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> adjacencyList (int v1);
}
