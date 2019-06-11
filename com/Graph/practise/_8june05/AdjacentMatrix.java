package com.Graph.practise._8june05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrix implements Graph {

	private int[][] matrix;
	int numVertex;
	GraphType graphType = GraphType.UNDRIRECTED;

	public AdjacentMatrix(int v, GraphType graphType) {
		this.numVertex = v;
		this.graphType = graphType;

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
		if (this.graphType == GraphType.UNDRIRECTED) {
			this.matrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> adjacentList(int v1) {
		if (v1 >= this.numVertex || v1 < 0) {
			throw new IllegalArgumentException("Vertex not found");

		}
		
		List <Integer> adjacnetList = new ArrayList<>();
		
		for(int i = 0;i< this.numVertex ; i++) {
			if(this.matrix[v1][i]==1) {
				adjacnetList.add(i);
			}
		}
		
		Collections.sort(adjacnetList);

		return null;
	}

}
