package com.Graph.Adjacencymatrix.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Graph.Graph.GraphType;

import sun.security.provider.certpath.AdjacencyList;

public class AdjacencyMatrix implements Graph {

	int[][] adjacencyMatrix;
	int numVertices = 0;
	private GraphType graph = GraphType.DIRECTED;

	public AdjacencyMatrix(int numVertices, GraphType graphType) {
		this.numVertices = numVertices;
		this.graph = graphType;

		adjacencyMatrix = new int[numVertices][numVertices];

		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				adjacencyMatrix[i][j] = 0;
			}
		}
	}

	@Override
	public void addEdge(int v1, int v2) {

		if (v1 >= numVertices || v1 < 0 || v2 >= numVertices || v2 < 0) {
			throw new IllegalArgumentException("Verices is not valid");
		}

		adjacencyMatrix[v1][v2] = 1;
		if (graph == GraphType.DIRECTED) {
			adjacencyMatrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> getAdjacencyvetices(int v) {

		if (v > numVertices || v < 0) {
			throw new IllegalArgumentException("Verices is not valid");
		}

		List<Integer> adjcencyverticesList = new ArrayList<>();
		for (int i = 0; i < numVertices; i++) {
			adjcencyverticesList.add(i);
		}
		
		Collections.sort(adjcencyverticesList);
		
		return adjcencyverticesList;
	}

}
