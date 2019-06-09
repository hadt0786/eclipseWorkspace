package com.Graph.practise._9june.DFS01;

import java.util.List;

public class DFS {

	public static int N = 8; // Number of vertices

	public static void main(String[] args) {

		Graph graph = new AdjacencyMatrixGraph(N, Graph.GraphType.DIRECTED);
		graph.addEdge(1, 0); 
		graph.addEdge(1, 2);
		graph.addEdge(2, 7);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(1, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 3);
		graph.addEdge(3, 4);
		
		int[] visited = new int[] {0, 0, 0 , 0 , 0, 0, 0 , 0 };
		
		for(int i =0 ; i<N; i++) {
				depthFirstTraverasl(graph, visited, i);
		}

	}

	private static void depthFirstTraverasl(Graph graph, int[] visited, int currentVertex) {
		if(visited[currentVertex]==1) {
			return;
		}
		visited[currentVertex] = 1;
		List<Integer> list = graph.getAdjacentVertices(currentVertex);
		System.out.println("list"+list.toString());
		
		for(int vertex : list) {
			depthFirstTraverasl(graph, visited, vertex);
		}
		System.out.print(currentVertex + " - > " );
	}

}
 