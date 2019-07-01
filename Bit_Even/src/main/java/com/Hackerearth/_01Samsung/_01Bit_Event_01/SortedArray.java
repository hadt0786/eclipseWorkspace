package com.Hackerearth._01Samsung._01Bit_Event_01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedArray {

	public static void main(String[] args) {

		int N = 3;
		int K = 15;
		int[] input = new int[N];
		input[0] = 1;
		input[1] = 3;
		input[2] = 2;
		System.out.println(getX(N, input.length));
		System.out.println(getX(N, 5));
		System.out.println("output");
		int[] reps = getRepititions(input.length);
//		print(reps);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (!map.containsKey(input[i]))
				map.put(input[i], reps[i]);
			else {
//			int temp = map.get(input[i]);
				map.replace(input[i], map.get(input[i]) + reps[i]);
			}
		}
		TreeMap<Integer, Integer> sorted = new TreeMap<Integer, Integer>();
		sorted.putAll(map);
		int total = sorted.firstEntry().getValue();
		int res = 0;
		for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
			if (total >= K) {
				res = entry.getKey();
				break;
			} else {
				total += entry.getValue();
			}
		}
		System.out.println(res);
	}

	public static int getX(int N, int len) {
		int count = 1;
		while (N / 2 >= len) {
			N = N / 2;
			count++;
		}
		return count;
	}

	public static int[] getRepititions(int N) {
		int[] rep = new int[N];
		int x = 0;
		int X = getX(N, N);
		for (int i = 0; i < N; i++) {
			x = getX(N, N - i);
			System.out.println(x);
//			if(x-i > 0){
			rep[N - i - 1] = (x) * (x + 1) * N / 2;
//			} else {
//			rep[i] = N;
//			}
		}
		return rep;
	}

	public static void print(int[] inp) {
		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + ",");
		}
		System.out.println();
	}

}
