package com.Graph.practise._8june03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrix implements Graph {

	int[][] matrix;
	int numVertices;
	GraphType graphType = GraphType.UNDIRECTED;

	public AdjacentMatrix(int numvertices, GraphType graphType) {
		this.numVertices = numvertices;
		this.graphType = graphType;
		this.matrix = new int[this.numVertices][this.numVertices];
		for (int j = 0; j < this.numVertices; j++)
			for (int i = 0; i < this.numVertices; i++) {
				this.matrix[i][j] = 0;
			}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertices || v1 < 0 || v2 >= this.numVertices || v2 < 0)
			throw new IllegalArgumentException("Vertex not found ");

		this.matrix[v1][v2] = 1;
		if (this.graphType == GraphType.UNDIRECTED) {
			this.matrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {
		if (v1 >= this.numVertices || v1 < 0)
			throw new IllegalArgumentException("Vertex not found ");

		List<Integer> adjacentList = new ArrayList<>();

		for (int i = 0; i < this.numVertices; i++) {
			if (this.matrix[v1][i] == 1) {
				adjacentList.add(i);
			}
		}
		Collections.sort(adjacentList);

		return adjacentList;
	}

}
