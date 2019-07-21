package com.codingninja.livewebinar.Backtracking;

public class Backtracking {

	public static void main(String[] args) {
		int n = 3;
		int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 1, 1 } };

		System.out.println(findPath(maze, n));

	}

	public static boolean findPath(int[][] maze, int n) {

		int[][] path = new int[n][n];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				path[i][j] = 0;
			}
		}
		// x = 0, y = 0

		return findPath(maze, n, 0, 0, path);

	}

	public static boolean findPath(int maze[][], int n, int x, int y, int path[][]) {
		// boundary condition
//		System.out.print("path to be disclosed");
		System.out.print(n);

		if (x < 0 | x >= n || y < 0 || y >= n) {
			return false;

		}
		// last cell
		if (x == n - 1 && y == -1) {
			path[x][y] = 1;
			for(int i = 0; i<n; i++) {
				for(int j = 0;j<n;j++) {
					System.out.print(path[i][j]);
//					System.out.println(maze[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			return true;
		}

		// x and y curent location cell

		if (maze[x][y] == 0 || path[x][y] == 1) {

			return false;

		}
		path[x][y] = 1;

		// right

		if (findPath(maze, n, x, y + 1, path)) {
			path[x][y] = 0;

			return true;
		}

		// left
		if (findPath(maze, n, x, y - 1, path)) {
			path[x][y] = 0;

			return true;
		}

		// top
		if (findPath(maze, n, x - 1, y, path)) {
			path[x][y] = 0;

			return true;
		}
		// down

		if (findPath(maze, n, x + 1, y, path)) {
			path[x][y] = 0;

			return true;
		}

		// neither option is true means i can't move fiurther
		path[x][y] = 0;

		return false;
	}

}
