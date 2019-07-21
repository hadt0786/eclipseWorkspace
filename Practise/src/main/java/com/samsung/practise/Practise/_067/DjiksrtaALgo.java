package com.samsung.practise.Practise._067;

import java.util.Scanner;

public class DjiksrtaALgo {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int v = cin.nextInt(), e = cin.nextInt();
		int[][] adjacencymatrix = new int[v][e];

		for (int i = 0; i < e; i++) {
			int v1 = cin.nextInt(), v2 = cin.nextInt(), weight = cin.nextInt();
			adjacencymatrix[v1][v2] = weight;
			adjacencymatrix[v2][v1] = weight;

		}

		djikstra(adjacencymatrix);

	}

	private static void djikstra(int[][] adjacencymatrix) {
		
		int v = adjacencymatrix.length;
		boolean visted[] = new boolean[v];
		int distance[] = new int[v];
		distance[0] = 0;
		for(int i = 0; i<v;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i<v-1;i++) {
			// find vertices with minum vertex 
			
			int minVertex = findMinimumVertex(distance, visted);
			//explore neighbourse
			
			for(int j = 0; j<v; j++) {
				if(adjacencymatrix[minVertex][j]!=0 && !visted[j]) {
					int newDist = dist[minvertex]+adjacencymatrix
				}
			}
			
		}
		
	}

	private static int findMinimumVertex(int[] distance, boolean[] visted) {

		int minVertex  = -1;
		
		for(int i = 0; i<distance.length; i++) {
			if(!visted[i] &&(minVertex==-1 || distance[i]<distance[minVertex])) {
				minVertex = i;
			}
		}
		
		return minVertex;
	}

}
