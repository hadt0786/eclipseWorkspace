package com.Graph.practise._8june08;

import java.util.List;

public interface Graph {
	
	enum GraphType { 
		UNDIRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> adjacentList(int v1);
	

}
