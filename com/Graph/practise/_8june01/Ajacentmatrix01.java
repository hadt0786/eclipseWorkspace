package com.Graph.practise._8june01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ajacentmatrix01 implements Graph {

	private int[][] matrix;
	private int numvertex;

	private GraphType graphType = GraphType.UNDIRECTED;

	public Ajacentmatrix01(int numVertex, GraphType graphType) {

		this.numvertex = numVertex;
		this.graphType = graphType;
		for (int j = 0; j < this.numvertex; j++)
			for (int i = 0; i < this.numvertex; i++) {
				this.matrix[i][j] = 0;
			}

	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= this.numvertex || v1 < 0 || v2 >= this.numvertex || v2 < 0) {
			throw new IllegalArgumentException("Vertex not found");
		}

		matrix[v1][v2] = 1;

		if (this.graphType == GraphType.UNDIRECTED) {
			matrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> getAdjacentList(int v) {
		if (v >= this.numvertex || v < 0 ) {
			throw new IllegalArgumentException("Vertex not found");
		}
		
		List <Integer> adjacentListEdge = new ArrayList<>();
		
		for(int i = 0; i<this.numvertex ; i++) {
			if(this.matrix[v][i]==1) {
				adjacentListEdge.add(i);
			}
		}
		Collections.sort(adjacentListEdge);
		
		return adjacentListEdge;
	}

}
