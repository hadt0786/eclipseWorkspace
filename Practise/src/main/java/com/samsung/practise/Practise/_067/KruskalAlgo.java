package com.samsung.practise.Practise._067;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class KruskalAlgo {

	static class Edge {
		public int source, dest, weigth;

	}

	public static void main(String[] args) {

		KruskalAlgo algo = new KruskalAlgo();
		int n, e = 0;
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		e = cin.nextInt();
		Edge input[] = new Edge[e];

		for (int i = 0; i < e; i++) {
			int s = cin.nextInt(), d = cin.nextInt(), w = cin.nextInt();
			// intput [ i ] -->represent one object of Edge

			input[i].source = s;
			input[i].dest = d;
			input[i].weigth = w;
		}

		algo.kruskalsAlgorithm(input, n, e);

	}

	boolean compare(Edge e1, Edge e2) {

		// equal -- 0 ; less --> -1 ,, greater +1

		return e1.weigth < e2.weigth; // increasing order
	}

	private void kruskalsAlgorithm(Edge[] input, int n, int e) {

		// sort the input array in ascending order based on weights

		// create the output array -- n -1 edges size

		Edge[] output = new Edge[n - 1];

		int[] parent = new int[n];

		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int count = 0, i = 0; // i --> current edge
		while (count != n - 1) {
			Edge currentEdge = input[i];
			// check if we can add the current edge in mst or not
			int sourceParent = findParent(currentEdge.source, parent);
			int destinationParent = findParent(currentEdge.dest, parent);

			if (sourceParent != destinationParent) {
				output[count] = currentEdge;
				count++;
				parent[sourceParent] = destinationParent;
			}
			i++;

		}
		for(int i = 0; i<n-1;i++) {
			if(output[i].source < output[i].dest) {
				System.out.println(output[i].source+" "+output[i].dest+" "+output[i].weigth);;

			}
			else {
				System.out.println(output[i].dest+" "+output[i].source+" "+output[i].weigth);;

			}
		}

	}

	private int findParent(int v, int[] parent) {
		if (parent[v] == v) {
			return v;
		}

		return findParent(parent[v], parent);

	}

}
