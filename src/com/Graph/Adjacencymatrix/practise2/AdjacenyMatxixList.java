package com.Graph.Adjacencymatrix.practise2;

import java.util.ArrayList;
import java.util.List;

import com.Graph.Graph.GraphType;

public class AdjacenyMatxixList implements Graph{

	
	int[][] adjacentMatrix;
	int numVertices = 0;
	private GraphType graphType = GraphType.DIRECTED;
	
	public AdjacenyMatxixList(int numVertices, GraphType graphType) {
		this.numVertices = numVertices;
		this.graphType = graphType;
		
		for(int i = 0; i<numVertices; i++) {
			for(int j =0; j<numVertices; j++) {
				adjacentMatrix[i][j] = 0;
			}
		}
	}
	
	@Override
	public void addEdge(int v1, int v2) {

		if(v1>numVertices || v2>numVertices || v1<1 || v2<0){
			throw new IllegalArgumentException("Vertex number is not valid");
		}
		
		adjacentMatrix[v1][v2] = 1;
		
		if(graphType==GraphType.UNDIRECTED) {
			adjacentMatrix[v2][v1]=1;
		}
		
	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {
		
		if(v>numVertices || v<0) {
			throw new IllegalArgumentException("Vertex number is not valid");
			
		}
		List<Integer> adjacentVertices = new ArrayList<>();
		for(int i =0 ;i<numVertices; i++) {
			adjacentVertices.add(i);
		}
		
		
		
		return adjacentVertices;
	}
	
	

}
