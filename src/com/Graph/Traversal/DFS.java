package com.Graph.Traversal;

import java.util.List;

import com.Graph.Graph;

public class DFS {
	
	// post order tree traversal

	public static void depthFirstSearch(Graph graph, int[] visited, int currentVertex) {
		if (visited[currentVertex] == 1) {
			return;
		}
		visited[currentVertex] = 1;

		List<Integer> list = graph.getAdjacentVertices(currentVertex);
		for (int vertex : list) {
			depthFirstSearch(graph, visited, vertex);
		}
		System.out.println(currentVertex + " -> ");
		
		// if unconnected graph
		// N - > number of vertices
		for(int i = 0 ; i<N ; i++) {
			depthFirstSearch(graph, visited, i);
		}
	}

}
