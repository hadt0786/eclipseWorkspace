package com.Graph.practise._8june07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrix implements Graph {

	int[][] matrix;
	int numVertex;
	GraphType graphTpe = GraphType.UNDIRECTED;

	public AdjacentMatrix(int v, GraphType graphType) {
		this.graphTpe = graphType;
		this.numVertex = v;

		this.matrix = new int[this.numVertex][this.numVertex];

		for (int i = 0; i < this.numVertex; i++) {
			for (int j = 0; j < this.numVertex; j++) {
				this.matrix[i][j] = 0;
			}
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numVertex || v1 < 0 || v2 >= this.numVertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found");
		}

		this.matrix[v1][v2] = 1;
		if (this.graphTpe == GraphType.UNDIRECTED) {
			this.matrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {

		if (v1 >= this.numVertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex not found");
		}
		
		List<Integer> adjacentMatrix = new ArrayList<>();
		
		for(int i =0 ; i<this.numVertex;i++) {
			if(this.matrix[v1][i]==1) {
				adjacentMatrix.add(i);
			}
		}
		Collections.sort(adjacentMatrix);
		
		return adjacentMatrix;
	}

}
