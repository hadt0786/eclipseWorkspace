package com.codingninja.livewebinar.Backtracking.AllPath;

public class Sudoku {

	static boolean canPlaceNum(int board[][], int row, int col, int num) {
		board = new int[4][4];

		if (!isRowSafe(board, row, num)) {
			return false;
		}
		if (!colSafe(board, col, num)) {
			return false;
		}
		if (!isBoxsafe(board, row, col, num)) {
			return false;
		}

		return true;
	}

	static boolean isRowSafe(int board[][], int row, int num) {
		board = new int[4][4];
		for (int j = 0; j <= 4; j++) {
			if (board[row][j] == num) {
				return false;
			}

		}
		return true;
	}

	static boolean colSafe(int board[][], int col, int num) {
		board = new int[4][4];
		for (int j = 0; j <= 4; j++) {
			if (board[col][j] == num) {
				return false;
			}

		}
		return true;
	}

	static boolean isBoxsafe(int board[][], int row, int col, int num) {
		board = new int[4][4];
		// even - 4x4
//		row = 3 col =3
//				row start = row - row%2
//				col strat = col - col%2
//				
//		// odd - 9x9
//				row = 3 col =3
//				row start = row - row%3
//				col strat = col - col%3

		int rowstart = row - row % 2;
		int colstart = col - col % 2;

		for (int i = rowstart; i < rowstart + 2; i++) {
			for (int j = colstart; j < colstart + 2; j++) {
				if (board[i][j] == num)
					return false;
			}
		}

		return true;
	}

	static boolean sudokoSolver(int board[][]) {
		board = new int[4][4];

		// find the empty cell
		int row = -1, col = -1;
		boolean isEmpty = false;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// empty cell = 0
				if (board[i][j] == 0) {
					isEmpty = true;
					row = i;
					col = j;
					break;
				}
			}
			if (isEmpty) {
				break;
			}
		}
		if (!isEmpty) {
			return true;
		}

		for (int num = 1; num <= 4; num++) {
			// place a num or not
			if (canPlaceNum(board, row, col, num)) {
				board[row][col] = num;

				if (sudokoSolver(board)) {
					return true;
				}

				board[row][col] = 0;

			}
		}
		return false;
		// we solve the soduko all cells are filled

	}

	public static void main(String[] args) {

		int board[][] = { { 1, 3, 0, 4 }, { 2, 0, 3, 1 }, { 0, 1, 0, 2 }, { 4, 0, 1, 2 } };
		System.out.println(sudokoSolver(board));

	}

}
