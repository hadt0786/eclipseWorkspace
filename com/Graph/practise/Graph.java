package com.Graph.practise;

import java.util.List;

/**
 * MathMatical expression
 * 
 * G = (V, E) g -> UNDIRECTED and DIRECTED V - vertices e- - Edge
 * 
 **/

public interface Graph {

	enum GraphType {
		UNDIRECTED, DIRECTED
	}

	void addEdge(int v1, int v2); // add from sourse to des


	List<Integer> getAdjacentVertices(int v);

}
