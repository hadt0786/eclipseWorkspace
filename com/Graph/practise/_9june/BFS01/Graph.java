package com.Graph.practise._9june.BFS01;

import java.util.List;

public interface Graph {
	
	enum GraphType {
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> getAdjacencyList(int v1);
	

}
