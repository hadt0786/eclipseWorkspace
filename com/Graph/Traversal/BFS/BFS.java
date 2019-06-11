package com.Graph.Traversal.BFS;

import java.util.Queue;

import com.Graph.Graph;
import com.Graph.practise._9june.BFS01.AdjacencyMatrix;

public class BFS {

	// non -recursival implementation

	public static int N = 8;

	public static void main(String[] args) {

		Graph graph = new AdjacencyMatrix(N, Graph.GraphType.DIRECTED);

		graph.addEdge(1, 0);
		graph.addEdge(1, 2);
		graph.addEdge(2, 7);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(1, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 3);
		graph.addEdge(3, 4);

		int[] visited = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };

		for(int i =0 ; i<N ; i++) {
			breadthFirstSearch(graph, visited, i);
		}
		
	}

	private static void breadthFirstSearch(Graph graph, int[] visited, int currentVertex) {
		Queue<Integer> q = new Queue<Integer>(Integer.class);
		q.element(currentVetex);
		
		while(!q.isEmpty()) {
			int vertex = q.dequeue();
			if(visited[vertex]==1) {
				continue;
			}
			
			System.out.println(vertex + " -> ");
			visited[vertex] = 1;
			
			
			List<Integer> list = graph.getAdjacentVertices(vertex);
			for(int v : list) {
				if(visited[v]!=1) {
					q.enqueue(v);
				}
			}
		}
		
	}

}
