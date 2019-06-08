package com.Graph.Adjacencymatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Graph.Graph;

// graph
public class Adjacencymatrix implements Graph {
	
	int[][] adjacencymtix ;
	int numVertices = 0;
	private GraphType graphType = GraphType.DIRECTED ;
	
	
	
	public Adjacencymatrix(int numVertices, GraphType graphType){
		this.numVertices = numVertices;
		this.graphType = graphType;
		
		adjacencymtix = new int[numVertices][numVertices];
		
		for(int i =0; i<numVertices; i++) {
			for(int j = 0; j<numVertices; j++){
				adjacencymtix[i][j] = 0;
			}
		}
		
	}
	
	@Override
	public void addEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		
		if(v1>=numVertices || v1<0 || v2>numVertices || v2<0) {
			throw new IllegalArgumentException("Vertex number is not valid");
		}
		
		adjacencymtix[v1][v2] = 1;
		if(graphType==GraphType.UNDIRECTED) {
			adjacencymtix[v2][v1] = 1;
		}
		
		
	}
	@Override
	public List<Integer> getAdjacentVertices(int v) {

		if(v>numVertices || v< 0) {
			throw new IllegalArgumentException("Vetex numver is not valid");
		}
		
		List<Integer> adjancentVerticesList = new ArrayList<>();
		for(int i =0; i<numVertices; i++)
		{
			if(adjacencymtix[v][i] == 1) {
				adjancentVerticesList.add(i);
			}
			
			// Always return the vertices in ascending order
			Collections.sort(adjancentVerticesList);
		}
		return adjancentVerticesList;
	}

}
