package com.Graph.Adjacencymatrix.practise;

import java.util.List;

public interface Graph {
	
	int vertices = 0;
	
	enum gRAPHtYPE{
		DIRECTED, UNDIRECTED
	}
	
	void addEdge(int v1, int v2);
	List<Integer> getAdjacencyvetices(int v);
	
	

}
