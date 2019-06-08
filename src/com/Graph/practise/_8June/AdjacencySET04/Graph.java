package com.Graph.practise._8June.AdjacencySET04;

import java.util.List;

public interface Graph {

	enum GraphType{
		DIRECTED, UNDIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> getadjacencyList(int v1);
	
	
}
