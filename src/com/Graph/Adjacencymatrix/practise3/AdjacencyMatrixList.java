package com.Graph.Adjacencymatrix.practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixList implements Graph {

	int[][] adjacentMattrix;
	int numvertices = 0;
	private GraphType graphType = GraphType.DIRECTED;

	public AdjacencyMatrixList(int numvertices, GraphType graphType) {
		this.numvertices = numvertices;
		this.graphType = graphType;

		for (int i = 0; i < numvertices; i++) {
			for (int j = 0; j < numvertices; j++) {
				adjacentMattrix[i][j] = 0;
			}
		}

	}

	@Override
	public void addEdges(int v1, int v2) {

		if (v1 >= numvertices || v1 > 0 || v2 >= numvertices || v2 > 0) {
			throw new IllegalArgumentException("Vertex is not a number");
		}

		adjacentMattrix[v2][v1] = 1;
		if (this.graphType == GraphType.UNDIRECTED) {
			adjacentMattrix[v1][v2] = 1;
		}

	}

	@Override
	public List<Integer> getAdjacencyList(int v1) {

		if (v1 >= numvertices || v1 > 0) {
			throw new IllegalArgumentException("Vertex is not a number");
		}

		List<Integer> adjacentList = new ArrayList<>();

		for (int i = 0; i < this.numvertices; i++) {
			if (this.adjacentMattrix[v1][i] == 1) {
				adjacentList.add(i);
			}
			Collections.sort(adjacentList);
		}

		return adjacentList;
	}

}
