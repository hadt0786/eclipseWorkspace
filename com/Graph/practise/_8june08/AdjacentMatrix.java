package com.Graph.practise._8june08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrix implements Graph {

	int[][] matrix;
	int numvertex;
	 GraphType graphType = GraphType.UNDIRECTED;

	public AdjacentMatrix(int v, GraphType graphType) {
		this.numvertex = v;
		this.graphType = graphType;
		this.matrix = new int[this.numvertex][this.numvertex];

		for (int i = 0; i < this.numvertex; i++) {
			for (int j = 0; j < this.numvertex; j++) {
				this.matrix[i][j] = 0;
			}
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numvertex || v1 < 0 || v2 >= this.numvertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found ");
		}

		this.matrix[v1][v2] = 1;
		if (this.graphType == GraphType.UNDIRECTED) {
			this.matrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {

		if (v1 >= this.numvertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex not found ");
		}
		List<Integer> adjacentList = new ArrayList<>();

		for (int i = 0; i < this.numvertex; i++) {
			if (this.matrix[v1][i] == 1) {
				adjacentList.add(i);
			}
		}

		Collections.sort(adjacentList);

		return adjacentList;
	}

}
