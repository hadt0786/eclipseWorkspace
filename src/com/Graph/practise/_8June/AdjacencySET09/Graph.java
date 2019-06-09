package com.Graph.practise._8June.AdjacencySET09;

import java.util.List;

public interface Graph {
	
	enum GraphType { 
		UNDIRECTED, DIRECTED
	}
	
	void addEnde(int v1, int v2);
	List<Integer> adjacencyList (int v1);

}
