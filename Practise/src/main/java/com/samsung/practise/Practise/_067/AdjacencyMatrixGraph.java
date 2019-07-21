package com.samsung.practise.Practise._067;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph {

	private int[][] adjacencymatrix;
	private GraphType graphType = GraphType.DIRECTED;
	private int numVertices = 0;

	public AdjacencyMatrixGraph(int numVertices, GraphType graphType) {
		this.graphType = graphType;
		this.numVertices = numVertices;
		this.adjacencymatrix = new int[numVertices][numVertices];

		for (int i = 0; i < this.numVertices; i++) {
			for (int j = 0; j < this.numVertices; j++) {
				adjacencymatrix[i][j] = 0;
			}
		}
	}

	public GraphType TypeofGraph() {
		return graphType;
	}

	public void addEdge(int v1, int v2) {
		if (v1 >= this.numVertices || v1 < 0 || v2 >= this.numVertices || v2 < 0) {
			throw new IllegalArgumentException("Vertex number is not valid");
		}

		adjacencymatrix[v1][v2] = 1;
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencymatrix[v2][v1] = 1;
		}
	}

	public void addEdge(int v1, int v2, int weight) {
		if (v1 >= this.numVertices || v1 < 0 || v2 >= this.numVertices || v2 < 0) {
			throw new IllegalArgumentException("Vertex number is not valid");
		}

		adjacencymatrix[v1][v2] = weight;
		if (this.graphType == GraphType.UNDIRECTED) {
			this.adjacencymatrix[v2][v1] = weight;
		}
	}

	public int getWeightEdge(int v1, int v2) {

		return this.adjacencymatrix[v1][v2];
	}

	public List<Integer> getAdjacentVertices(int v) {
		if(v<0||v>=this.numVertices) {
			throw new IllegalArgumentException("Vertex number is not valid ");
			
		}
		
		List<Integer> integerList = new ArrayList<>();
		for(int i = 0; i<this.numVertices;i++) {
			if(this.adjacencymatrix[v][i]!=0) {
				integerList.add(i);
			}
		}
		return integerList;
	}

	public int getNumVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIndegree(int v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
