package com.Graph.Adjacencymatrix.practise2;

import java.util.List;

public interface Graph {
	
	enum GrphType{
		UNIDRECTED, DIRECTED
	}
	
	void addEdge(int v1, int v2);
	
	List <Integer> getAdjacentVertices(int v);

}
