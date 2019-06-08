package com.Graph.practise._8June.AdjacencySET02;

import java.util.List;

public interface Graph {
	
	enum Graphtype {
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> adjacentList(int v1);

}
