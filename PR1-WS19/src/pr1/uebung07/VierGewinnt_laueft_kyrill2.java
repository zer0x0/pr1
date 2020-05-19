package pr1.uebung07;

import static pr.MakeItSimple.*;

/**
 * Vier Gewinnt Spiel - aktuell nur mit Vertical Win Condition
 * 
 * @author Heiopei
 *
 */
public class VierGewinnt_laueft_kyrill2 {

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

	/**
	 * Win Control umfasst alle 4 Gewinn methoden sobald eine der Methoden erfüllt
	 * ist gewinnt der akutelle Spieler das Spiel!
	 * 
	 * 
	 * @param spalte         ist die Spalte die der Spieler für die Münze gewählt
	 *                       hat
	 * @param gameFieldArray ist das aktuelle Spielfeld
	 * @param player         ist die Münze des aktuellen Spielers
	 * @param zeile          ist die Zeile in die die Münze geworfen wurde.
	 * @return true , falls ein Spieler gewonnen hat.
	 */
	static boolean winControl(int spalte, char[][] gameFieldArray, char player, int zeile) {
		if (WinHorizont() == true || WinVertically(spalte, gameFieldArray, player, zeile) == true || WinRL() == true
				|| WinLR() == true)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param spalte         ist die Spalte die der Spieler für die Münze gewählt
	 *                       hat
	 * @param gameFieldArray ist das aktuelle Spielfeld.
	 * @param player         ist die Münze des aktuellen Spielers.
	 * @param zeile          ist die Zeile in die die Münze geworfen wurde.
	 * @return true , falls ein Spieler eine Vertikale Gewinnbedingung erfüllt hat.
	 */
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

//	public static boolean checkHorizontal(int spalte, char[][] gameFieldArray, char player, int zeile) {
//		boolean returnwert = false;
//		if (zeile + 3 < gameFieldArray[spalte].length) {
//			if (gameFieldArray[spalte][zeile] == player && gameFieldArray[spalte][zeile + 1] == player
//					&& gameFieldArray[spalte][zeile + 2] == player && gameFieldArray[spalte][zeile + 3] == player) {
//				returnwert = true;
//			}
//		}
//		return returnwert;
//	}

	static boolean WinHorizont(/* int spalte, char[][] gameFieldArray, char player, int zeile */) {
//		int win = 0;
//		int zeileLeft;
//		int zeileRight;
//
//		zeileRight = 7 - spalte;
//		zeileLeft = 6 - zeileRight;
//		println("WINHORIZONT >>>>>> start");
//		println("spalte >>>> " + spalte);
//		println("RIGTH >>>> " + zeileRight);
//		println("LEFT >>>> " + zeileLeft);
//		int spalteLeft;
//		spalteLeft = spalte;
//
//		do {
//			if (gameFieldArray[spalte - 1][zeile] == player) {
//				win++;
//			}
//			while (spalte != 6)
//				spalte++;
//		} while (spalte < zeileRight || gameFieldArray[spalte - 1][zeile] == player);
//		println("Shleife RECHTS >>>>> ENDE");

//		for (int i = spalte; i <= zeileRight; i++) {
//			if (gameFieldArray[spalte - 1][zeile] == player) {
//				win++;
//			} 
//		}
//		do {
//			if (gameFieldArray[spalteLeft - 1][zeile] == player) {
//				win++;
//			}
//			while (spalteLeft != 1 )
//				spalteLeft--;
//		} while (spalteLeft > zeileLeft || gameFieldArray[spalteLeft - 1][zeile] == player);
//		println("Shleife LINKS >>>>> ENDE");

//		for (int i = spalte; i <= zeileLeft; i--) {
//			if (gameFieldArray[spalte - 1][zeile] == player) {
//				win++;
//			} else
//				return false;
//		if (win >= 5)
//			return true;
//
		return false;
	}

	/**
	 * Hier werden die Spielrunden gezählt und der aktuelle Spieler bestimmt.
	 * 
	 * @param round is t die aktuelle Runde des Spiels.
	 * @return wird die "Münze" der Character des Spielers
	 */
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

	/**
	 * Hier wird das aktuelle 2D Spielfeld Array ausgedruckt.
	 * 
	 * @param gameFieldArray ist das Spielfeld des aktuellen Spiels
	 */
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
	}

	static boolean FachVoll(char[][] gameFieldArray, int spalte) {

		if (gameFieldArray[spalte - 1][1] != ' ') {
			println("Spalte ist " + (spalte - 1) + " Voll! ");
			println("Bitte wähle eine neue Spalte!: ");
			return false;
		}

		return true;
//		}while(control == true);
//		
//		do {
//			if (zeile <= 0) {
//				do {
//					println("Fach ist voll!");
//					print("Bitte werfen Sie Ihre Münze: ");
//					spalte = readInt();
//				} while (spalte < 1 || spalte > 7);
//				zeile = 6;
//				control = true;
//			}
//		} while (control == false);
//		return false;

	}

	/**
	 * Hier wird das 2D Array mit Münzen befüllt. & bei falschen Eingaben, die
	 * Eingabe korrigiert. & ein freier Platz im Spielfeld für die Münze geusucht.
	 * 
	 * @param spalte         ist die Spalte die der Spieler für die Münze gewählt
	 *                       hat
	 * @param gameFieldArray ist das aktuelle Spielfeld.
	 * @param player         ist die Münze des aktuellen Spielers
	 * @return die aktuelle Zeile der geworfennen Münze
	 */
	public static int SetSpalte(int spalte, char[][] gameFieldArray, char player) {
		int zeile = 6;
		boolean control = false;
		do {
			if (FachVoll(gameFieldArray, spalte) == true) {
				
				for (int i= 6; i>0; i--)
				{
					if (gameFieldArray[spalte - 1][i] == ' ') {
						gameFieldArray[spalte - 1][i] = player;
						zeile = i;
						control = true;
				}
				}

			}
			spalte = readInt();
		} while (control == false);
	return zeile;
	}
	
	
	

	/**
	 * Hier wird das Spielfeld erstellt Die Idee war, das Hiermit das Spielfeld
	 * wieder geleert werden kann. Falls ein zweites Spiel gespielt werden soll.
	 * 
	 * @return das gerade erstellte 2D Character Array
	 */
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
