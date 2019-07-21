package com.codingninja.livewebinar.Backtracking.AllPath;

import java.lang.module.FindException;

public class AllPath {

	public static void main(String[] args) {
		int n = 3;
		int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 1, 1 } };

//System.out.println(findPath(maze, n));
		findPath(maze, n);
	}

	public static void findPath(int[][] maze, int n) {

		int[][] path = new int[n][n];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				path[i][j] = 0;
			}
		}
		// x = 0, y = 0

//		return findPath(maze, n, 0, 0, path);

	}

	public static void findPath(int maze[][], int n, int x, int y, int path[][]) {
		// boundary condition
//		System.out.print("path to be disclosed");
		System.out.print(n);

		if (x < 0 | x >= n || y < 0 || y >= n) {

			return;
		}
		// last cell
		if (x == n - 1 && y == -1) {
			path[x][y] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(path[i][j]);
//					System.out.println(maze[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			return;
		}

		// x and y curent location cell

		if (maze[x][y] == 0 || path[x][y] == 1) {

			return;

		}
		path[x][y] = 1;

		// right
		findPath(maze, n, x, y + 1, path);


		// left
		findPath(maze, n, x, y - 1, path);

		// top
		findPath(maze, n, x - 1, y, path);

		// down
		findPath(maze, n, x + 1, y, path);

		// neither option is true means i can't move fiurther
		path[x][y] = 0;

	}

}
