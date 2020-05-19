package pr1.uebung07;

import static pr.MakeItSimple.*;

public class VierGewinnt_laueft_kyrill {

	public static void main(String[] args) {
		int round = 1;
		println("Vier Gewinnt - Let's Play together :)");
		char[][] gameFieldArrayMain = gameFieldCreation();
		int spalteMain;
		char player;
		int zeileMain;
		do {
			player = Turn(round);
			do {
				print("Bitte werfen Sie Ihre Münze: ");
				spalteMain = readInt();
			} while (spalteMain < 1 || spalteMain > 7);
			println("Guter Zug!");
			zeileMain = SetSpalte(spalteMain, gameFieldArrayMain, player);
			gameFieldProgress(gameFieldArrayMain);
			round++;
		} while (winControl(spalteMain, gameFieldArrayMain, player, zeileMain) != true);
		if (round % 2 == 0)
			println(">> Player 1 << \n>> You win the GAME <<");
		else
			println(">> Player 2 << \n>> You win the GAME <<");
	}

	static boolean FachVoll ()
	{
		return true;
	}
	
	static boolean winControl(int spalte, char[][] gameFieldArray, char player, int zeile) {
		if (WinHorizont(spalte, gameFieldArray, player, zeile) == true
				|| WinVertically(spalte, gameFieldArray, player, zeile) == true || WinRL() == true || WinLR() == true)
			return true;
		else
			return false;
	}

	static boolean WinVertically(int spalte, char[][] gameFieldArray, char player, int zeile) {
		int win = 0;
		for (int i = zeile; i < 7; i++) {
			if (gameFieldArray[spalte - 1][i] == player) {
				win++;
			} else
				return false;
			if (win == 4)
				return true;
		}
		return false;
	}

	static boolean WinRL() {

		return false;
	}

	static boolean WinLR() {

		return false;
	}

	static boolean WinHorizont(int spalte, char[][] gameFieldArray, char player, int zeile) {
		int win = 0;
		int zeileLeft;
		int zeileRight;

		zeileRight = 7 - spalte;
		zeileLeft = 6 - zeileRight;
		println("WINHORIZONT >>>>>> start");
		println("spalte >>>> " + spalte);
		println("RIGTH >>>> " + zeileRight);
		println("LEFT >>>> " + zeileLeft);
		int spalteLeft;
		spalteLeft = spalte;

		do {
			if (gameFieldArray[spalte - 1][zeile] == player) {
				win++;
			}
			while (spalte != 6)
				spalte++;
		} while (spalte < zeileRight || gameFieldArray[spalte - 1][zeile] == player);
		println("Shleife RECHTS >>>>> ENDE");

//		for (int i = spalte; i <= zeileRight; i++) {
//			if (gameFieldArray[spalte - 1][zeile] == player) {
//				win++;
//			} 
//		}
		do {
			if (gameFieldArray[spalteLeft - 1][zeile] == player) {
				win++;
			}
			while (spalteLeft != 1 )
				spalteLeft--;
		} while (spalteLeft > zeileLeft || gameFieldArray[spalteLeft - 1][zeile] == player);
		println("Shleife LINKS >>>>> ENDE");

//		for (int i = spalte; i <= zeileLeft; i--) {
//			if (gameFieldArray[spalte - 1][zeile] == player) {
//				win++;
//			} else
//				return false;
		if (win >= 5)
			return true;

		return false;
	}

	static char Turn(int round) {

		char player;
		if (round % 2 != 0) {
			// player1
			player = '0';
			println(round + ". Spielzug");
			println(">> Player 1 << \n>> Münze " + player + " <<");
			return player;
		} else {
			// player2
			player = 'X';
			println(round + ". Spielzug");
			println(">> Player 2 << \n>> Münze " + player + " <<");
			return player;
		}
	}

	static void gameFieldProgress(char[][] gameFieldArray) {

		for (int i = 0; i < 7; i++) {
			println("");
			for (int j = 0; j < 7; j++) {
				print("|_" + gameFieldArray[j][i] + "_");
				if (j == 6)
					print("|");
			}
		}
		println("\n");
//		return gameFieldArray;
	}

	public static int SetSpalte(int spalte, char[][] gameFieldArray, char player) {
		int zeile = 6;
		boolean control = false;
		do {
			if (gameFieldArray[spalte - 1][zeile] == ' ') {
				gameFieldArray[spalte - 1][zeile] = player;
				control = true;
			} else {
				zeile--;
				if (zeile <= 0) {
					do {
						println("Fach ist voll!");
						print("Bitte werfen Sie Ihre Münze: ");
						spalte = readInt();
					} while (spalte < 1 || spalte > 7);
					zeile = 6;
					control = false;
				}
			}
		} while (control == false);
		return zeile;
	}

	static char[][] gameFieldCreation() {
		char[][] gameFieldArray = { { '1', ' ', ' ', ' ', ' ', ' ', ' ' }, { '2', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ '3', ' ', ' ', ' ', ' ', ' ', ' ' }, { '4', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ '5', ' ', ' ', ' ', ' ', ' ', ' ' }, { '6', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ '7', ' ', ' ', ' ', ' ', ' ', ' ' } };

		for (int i = 0; i < 7; i++) {
			println("");
			for (int j = 0; j < 7; j++) {
				print("|_" + gameFieldArray[j][i] + "_");
				if (j == 6)
					print("|");
			}
		}
		println("\n");
		return gameFieldArray;
	}
}
