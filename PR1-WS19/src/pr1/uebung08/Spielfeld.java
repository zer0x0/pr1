package pr1.uebung08;

import static pr.MakeItSimple.*;

public class Spielfeld {
	Spielbrett board;
	Spieler spieler;
	char currentPlayer = 'R';
	int col;

	public Spielfeld(int height, int width) {
		Spielbrett board = new Spielbrett(height, width);
		this.board = board;
	}

	public boolean isValidMove(int col) {

//		 check if column is ok
		if (!this.board.isColValid(col)) {
			println("Column must be between 0 and " + (this.board.width - 1));
		}

//		 now we check if the column is free or full
		if (this.board.isColValid(col) && !this.board.isColFree(col)) {
			println("Column " + col + " is full. Try another Column");
		}

//		if both are ok, we return that the Move is Valid
		if (this.board.isColValid(col) && this.board.isColFree(col)) {
			return true;
		}
	return false;
	}

	public void nextPlayerTurn() {
		if (this.board.turn % 2 == 0) {
			this.currentPlayer = 'R';
		} else {
			this.currentPlayer = 'G';
		}
	}

	public void play() {

//		Explain the User how to play, and show the board
		println("Use 0-" + (this.board.width - 1) + " to choose a column");
		this.board.printB();
		
//		the game starts
		do {
			boolean validMove = false;

			while(validMove == false) {
//				we inform the Player whose move it is and ask for input
				println("Player " + this.currentPlayer + " turn: ");
//				the player has to choose a move, we check if its valid
				col = readInt();
				validMove = this.isValidMove(col);
				}
			

//				once the player finally gives us a valid move, we drop the coin in the valid spot
			this.board.dropCoin(col, currentPlayer);
//				and print the board again
			this.board.printB();

//			now we check if the last Coin was a Winning Play
			if (this.board.isWinningPlay(currentPlayer)) {
//				if it was a Winning Play, the current player wins and we return form the game
				println("Player " + this.currentPlayer + " wins!");
				return;
			}
//			if it wasn't a Winning Play, we start the next turn and change the Player
			this.nextPlayerTurn();
//			however, if we hit the maximum amount of Turns (the field is full) --> No winner, we return
			if (this.board.turn == this.board.maxTurns) {
				println("Board is full. Game over. No winner.");
				return;
			}
		} while (true);

	}

}
