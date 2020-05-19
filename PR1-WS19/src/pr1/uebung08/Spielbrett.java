package pr1.uebung08;

import static pr.MakeItSimple.*;

public class Spielbrett {
	char[][] cells;
	public int height;
	public int width;
	public int maxTurns;
	public int turn = 0;
	public int[] lastCoin;

	public Spielbrett(int height, int width) {
		char[][] cells = new char[height][width];

//	a simple function to create a board filled with '.'

		for (int i = height - 1; i >= 0; i--) {
			for (int j = 0; j < width; j++) {
				cells[i][j] = '.';
			}
		}
		this.cells = cells;
		this.height = height;
		this.width = width;
		this.lastCoin = new int[2];
		this.maxTurns = height * width;
	}

	public void printB() {
//	just a simple function to print the Board, so we can see
		println();
		for (int i = this.height - 1; i >= 0; i--) {
			println();
			for (int j = 0; j < this.width; j++) {
				print(" " + (this.cells[i][j]) + " ");
			}
		}
		println();
	}

	public boolean isColValid(int col) {
		return ((0 <= col && col < this.width));

	}

	public boolean isColFree(int col) {
		for (int h = 0; h < this.height; h++) {
			if (this.cells[h][col] == '.') {
				return true;
			}
		}
		return false;
	}

	public void dropCoin(int col, char currentPlayer) {
		for (int h = 0; h < this.height; h++) {
			if (this.cells[h][col] == '.') {
				this.cells[h][col] = currentPlayer;
				this.lastCoin[0] = h;
				this.lastCoin[1] = col;
				this.turn++;
				return;
			}
		}
	}

	public boolean isWinningPlay(char currentPlayer) {

		int y = this.lastCoin[0];
		int x = this.lastCoin[1];

//	check vertical
//	check if you are inside the bounds of the board
		if (y > 2) {
			int matches = 0;
//		then check if there are 3 Symbols below the last placed (since we know that the coin that we just placed is = current symbol)
			for (int i = 1; i < 4; i++) {
				if ((this.cells[y - i][x]) == currentPlayer) {
					matches++;
				}
//		if we find 3 matches, return true
			}
			if (matches == 3)
				return true;
		}

//    check horizontal
//	we have to check everything from -4 to the left, until +4 to the right
		for (int i = 0; i < 4; i++) {

			int matches = 0;
//		therefore we check 4 times starting at x-4 if there are 4 matches in a row
			for (int j = 3; j >= 0; j--) {
				int offset = i - j;
//			dont forget to stay inside the bounds of the borad
				if (x + offset >= 0 && x + offset < this.width) {
					if (this.cells[y][x + offset] == currentPlayer) {
						matches++;
					}
				}
			}
//		if we find 4 machtes, we return true. otherwise we start looking for 4 matches on the next position
			if (matches == 4)
				return true;

		}
//    check diagonal
//	simular to the horizontal check, you have to check everything around the last coin diagonally from -4 to +4
		for (int i = 0; i < 4; i++) {
			int matches2 = 0;
			int matches = 0;
			for (int j = 3; j >= 0; j--) {
				int offset = i - j;
//			now not only 1 variable changes but both, since we move diagonally (this one is the slash check /)
//			don't forget to stay in bounds
				if (x + offset >= 0 && x + offset < this.width && y + offset < this.height && y + offset >= 0) {
					if (this.cells[y + offset][x + offset] == currentPlayer) {
						matches++;
					}
				}
//			this one is the backslash check \
//			don't forget to stay in bounds
				if (x + offset >= 0 && x + offset < this.width && y - offset < this.height && y - offset >= 0) {
					if (this.cells[y - offset][x + offset] == currentPlayer) {
						matches2++;
					}

				}
			}
//		if there is a diagonal / or \ match, we return true
			if (matches == 4 || matches2 == 4)
				return true;
		}
//		if none of the winning conditions are met, we return false

		return false;
	}
 


	public boolean checkRemis() {
		if (this.turn == this.maxTurns) {
			return true;
		}
		else return false;
	}
}