package com.Graph.practise._8june01;
import com.Graph.practise._8june01.Graph.GraphType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrix implements Graph {

	private int[][] matrix;
	private int numVertex = 0;
	private GraphType graphType = GraphType.UNDIRECTED;

	public AdjacentMatrix(int numVertex, Graph graphType) {
		this.numVertex = numVertex;
		this.graphType = graphType;

		matrix = new int[this.numVertex][this.numVertex];

		for (int i = 0; i < this.numVertex; i++)
			for (int j = 0; j < this.numVertex; j++) {
				matrix[i][j] = 0;
			}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertex || v1 < 0 || v2 >= this.numVertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found" + v1 + " " + v2);
		}

		matrix[v1][v2] = 1;
		if (this.graphType == GraphType.UNDIRECTED) {
			matrix[v2][v1] = 1;
		}

	}

	public List<Integer> getAdjacentList(int v) {
		if (v >= this.numVertex || v < 0) {
			throw new IllegalArgumentException("Vertex not found ");

		}

		List<Integer> adjacentList = new ArrayList<>();

		for (int i = 0; i < this.numVertex; i++) {
			if (this.matrix[v][i] == 1) {
				adjacentList.add(i);
			}
		}
		Collections.sort(adjacentList);

		return adjacentList;
	}

}
