package com.Graph.Traversal.BFS;

import java.util.List;
import java.util.Queue;

import com.Graph.Graph;

public class BFS {
	
	// non -recursival implementation
	
	public static void breadthFirstSearch(Graph graph, int[] visited,
			int currentVertex) throws Queue.OverFlowException,
	Queue.UnderFlowException{
		Queue<Integer> queue = new Queue<Integer>(Integer.class);
		
		queue.enqueue(currentVertex);
		
		while(!queue.isEmpty()) {
			int vertex = queue.dequeue();
			if(visited[vertex]=1) {
				List<Integer> list = graph.getAdjacentVertices(vertex);
				for(int v : list) {
					if(visited[v]!=1) {
						queue.enqueue(v);
					}
				}
			}
		}
		
		
	}

}
