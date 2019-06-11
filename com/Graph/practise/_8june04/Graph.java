package com.Graph.practise._8june04;

import java.util.List;

public interface Graph {

	enum GraphType {
		UNDIRECTED, DIRECTED
	}

	void addEdge(int v1, int v2);

	List<Integer> adjacenyList(int v1);

}
