package com.samsung.practise.Practise._067;

import java.util.List;

public interface Graph {

	enum GraphType {
		DIRECTED, UNDIRECTED
	}

	GraphType TypeofGraph();

	void addEdge(int v1, int v2);

	int getWeightEdge(int v1, int v2);

	List<Integer> getAdjacentVertices(int v);

	int getNumVertices();

	int getIndegree(int v);
}
